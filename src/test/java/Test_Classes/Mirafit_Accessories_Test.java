package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Common_Methods_Pom;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_Accessories_Pom;

public class Mirafit_Accessories_Test extends Mirafit_BaseClass_Pre_Production
{

	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_Accessories_Pom Accessories;
	Common_Methods_Pom method;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Accessories = new Mirafit_Accessories_Pom(driver);
		method = new Common_Methods_Pom(driver);
		
	}
	
	@Test
	public void Accessories() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		login.login();
		
		Accessories.Move_To_Accessories(driver);
		
//		Accessories.GetProductImage();
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,300)");
//		
//		Accessories.click_Wish_List();
//		
//		Accessories.Get_Wishlist_Message();
//		
//		Accessories.Click_Continue_shopping();
//				
//		js.executeScript("window.scrollBy(0,300)");
//	
//		Accessories.Click_View_Details(driver);
//		
//		Accessories.Get_Stock();
//		
//		Accessories.Get_Reviews();
//		
//		
//		
////		Accessories.Click_Choice();
//		
//		Accessories.Click_Add_To_Cart(driver);
//		
//		Accessories.Click_On_Cart_Button(driver);
		
		method.Add_product_to_cart(driver);
		
		Accessories.Click_Remove_item_from_Cart(driver);
		
//		Accessories.Get_EmptyCartMessage();

		logout.logout(driver);
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
}


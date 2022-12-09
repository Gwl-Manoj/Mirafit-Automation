package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_Homepage_Dumbbells_Pom;

public class Mirafit_Homepage_Dumbbells_Test extends Mirafit_BaseClass_Pre_Production
{
	
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_Homepage_Dumbbells_Pom Search;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Search = new Mirafit_Homepage_Dumbbells_Pom(driver);
		
	}
	

	@Test
	public void AddToCart() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
	
		login.login();

		Search.Click_Dumbbells_Button(driver);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		Search.GetProductImage();
		
		Search.click_Wish_List();
		
		Search.Get_Wishlist_Message();
		
		Search.Click_Continue_shopping();
		
		js.executeScript("window.scrollBy(0,500)");
		
		Search.Click_View_Details(driver);
		
		Search.Get_Stock();
		
		Search.Get_Reviews();
		
		Search.Click_Choice();
		
		Search.Quantity_Increment();
		
		Search.Click_Add_To_Cart(driver);
		
		Search.Click_On_Cart_Button(driver);
		
		Search.Click_Remove_item_from_Cart(driver);
		
		Search.Get_EmptyCartMessage();
		
		logout.logout(driver);
			
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
	
	
	
}



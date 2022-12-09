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
import POM_Classes.Mirafit_ParallelBars_Homepage_Image_Pom;

public class Mirafit_ParallelBars_Homepage_Image_Test extends Mirafit_BaseClass_Pre_Production
{

	int TCID;
	
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_ParallelBars_Homepage_Image_Pom Parallelbars;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Parallelbars = new Mirafit_ParallelBars_Homepage_Image_Pom(driver);
		
	}
	
	
	@Test
	public void parallelbar() throws InterruptedException, EncryptedDocumentException, IOException
	{	
		login.login();
		
		Parallelbars.Click_Logo();
		
		Parallelbars.Click_Strength(driver);
		
		Parallelbars.GetProductImage();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Parallelbars.click_Wish_List();
		Parallelbars.Get_Wishlist_Message();
		Parallelbars.Click_Continue_shopping();

		
		js.executeScript("window.scrollBy(0,300)");
		Parallelbars.Click_View_Details(driver);

		
		
		Parallelbars.Get_Stock();
		
//		Parallelbars.Get_Reviews();

		Parallelbars.Click_Choice();

		Parallelbars.Click_Add_To_Cart(driver);

		Parallelbars.Click_On_Cart_Button(driver);
		
		Parallelbars.Click_Remove_item_from_Cart(driver);

		Parallelbars.Get_EmptyCartMessage();
	
		logout.logout(driver);
	
	}

	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}

}

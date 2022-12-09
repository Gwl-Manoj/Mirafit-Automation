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
import POM_Classes.Mirafit_ClearWishlist_Pom;

public class Mirafit_ClearWishlist_Test extends Mirafit_BaseClass_Pre_Production
{

	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_ClearWishlist_Pom Clear_Wishlist;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Clear_Wishlist = new Mirafit_ClearWishlist_Pom(driver);
		
	}
	
	
	
	@Test
	public void wishlist() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Clear_Wishlist.Clear_wish_list(driver);
			
		logout.logout(driver);	
	
	}

	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}

}

	
	


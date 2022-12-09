package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import Library_Files.Utility;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_CheckOut_Pre_Production_Pom;
import POM_Classes.Mirafit_Order_Page_Pre_Production_Pom;

public class Mirafit_Order_Page_Pre_Production_Test extends Mirafit_BaseClass_Pre_Production
{

	
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_Order_Page_Pre_Production_Pom Order_Page;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Order_Page = new Mirafit_Order_Page_Pre_Production_Pom(driver);
		
		
	}
	
	
	@Test
	public void Accessories() throws InterruptedException, EncryptedDocumentException, IOException
	{
	
		login.login();
		
		Order_Page.Order_page(driver);

		
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
	
	
	
}


package Test_Classes;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import Library_Files.Mirafit_BaseClass_multipledata_Preproduction;
import POM_Classes.Login_page_Validation_Pom;

public class Mirafit_Login_Page_Validation_Test extends Mirafit_BaseClass_multipledata_Preproduction
{

	Login_page_Validation_Pom login;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login = new Login_page_Validation_Pom(driver);
	}
	
	@Test
	public void Login_With_multiple_data() throws InterruptedException, IOException
	{
		login.Login_With_Multiple_data(driver);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
	
	
}

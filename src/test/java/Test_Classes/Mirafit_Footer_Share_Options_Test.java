package Test_Classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Mirafit_Footer_Share_Options_Pom;

public class Mirafit_Footer_Share_Options_Test extends Mirafit_BaseClass_Pre_Production 
{
	int TCID;
	
	Mirafit_Footer_Share_Options_Pom Footer_Share_Options;
	
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		Footer_Share_Options = new Mirafit_Footer_Share_Options_Pom(driver);
		
	}
	

	
	@Test
	public void Footer_Share_Option_Facebook() throws InterruptedException
	{
		
		Footer_Share_Options.click_Facebook(driver);
		
	}
	
	@Test
	public void Footer_Share_Option_Instagram() throws InterruptedException
	{
		
		Footer_Share_Options.click_Instagram(driver);
		
	}
	
	@Test
	public void Footer_Share_Option_Youtube() throws InterruptedException
	{
		
		Footer_Share_Options.click_Youtube(driver);
		
	}
	
	@Test
	public void Footer_Share_Option_Tik_Tok() throws InterruptedException
	{
		
		Footer_Share_Options.click_Tik_Tok(driver);
		
	}
	
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}


}

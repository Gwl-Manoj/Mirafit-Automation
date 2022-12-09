package Test_Classes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Mirafit_Footer_Pom;

public class Mirafit_Footer_Test extends Mirafit_BaseClass_Pre_Production 
{
	int TCID;
	
	Mirafit_Footer_Pom Footer_Options;
	
//	public static final String USERNAME = "sonambindal_DGyqAH";
//	public static final String AUTOMATE_KEY = "ixYMdE6jb3MEDZJr46XX";
//	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		Footer_Options = new Mirafit_Footer_Pom(driver);
		
	}
	

	
	@Test
	public void Footer_Shop_Option() throws InterruptedException
	{
		
		Footer_Options.Footer_Shop_Option(driver);
		
	
	}
	
	@Test
	public void Footer_Company_Option() throws InterruptedException
	{
		Footer_Options.Footer_Company_Option(driver);
		
	}
	
	@Test
	public void Footer_Help_Option() throws InterruptedException
	{
		Footer_Options.Footer_Help_Option(driver);
		
	}
	
	@Test
	public void Footer_Share_Option() throws InterruptedException
	{
		Footer_Options.Footer_Share_Option(driver);
	}
	
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}


}

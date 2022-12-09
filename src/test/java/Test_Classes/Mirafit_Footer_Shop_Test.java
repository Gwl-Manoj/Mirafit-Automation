package Test_Classes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Mirafit_Footer_Shop_Pom;

public class Mirafit_Footer_Shop_Test extends Mirafit_BaseClass_Pre_Production 
{
	int TCID;
	
	Mirafit_Footer_Shop_Pom Footer_Shop_Options;
	
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		Footer_Shop_Options = new Mirafit_Footer_Shop_Pom(driver);
		
		
	}
	

	
	@Test
	public void Footer_Shop_Option() throws InterruptedException
	{
		
		Footer_Shop_Options.Footer_Shop_Option(driver);
		
	
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}


}

package Test_Classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Mirafit_Footer_Company_Pom;

public class Mirafit_Footer_Company_Test extends Mirafit_BaseClass_Pre_Production 
{
	int TCID;
	
	Mirafit_Footer_Company_Pom Footer_Company;
	
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		Footer_Company = new Mirafit_Footer_Company_Pom(driver);
		
		
	}
	

	
	@Test
	public void Footer_Help_Menu_About_US() throws InterruptedException
	{
		TCID=001;
		
		Footer_Company.click_About_US(driver);
		
	}
	
	@Test
	public void Footer_Help_Menu_Athletes() throws InterruptedException
	{
		Footer_Company.click_Athletes(driver);
		
	
	}
	
	@Test
	public void Footer_Help_Menu_Blog() throws InterruptedException
	{
		
		Footer_Company.click_Blog(driver);
		
		
	
	}
	
	@Test
	public void Footer_Help_Menu_Careers() throws InterruptedException
	{
		
		Footer_Company.click_Careers(driver);
	
	}
	
	@Test
	public void Footer_Help_Menu_FAQs() throws InterruptedException
	{
		
		Footer_Company.click_FAQs(driver);
		
	
	}
	
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}


}

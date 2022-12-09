package Test_Classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Mirafit_Footer_Help_Pom;

public class Mirafit_Footer_Help_Test extends Mirafit_BaseClass_Pre_Production 
{
	int TCID;
	
	Mirafit_Footer_Help_Pom Footer_Help;
	
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		Footer_Help = new Mirafit_Footer_Help_Pom(driver);
		
		
	}
	

	
	@Test
	public void Footer_Help_Menu_Contact_US() throws InterruptedException
	{
		
		Footer_Help.click_Contact_US(driver);
		
		
	}
	
	@Test
	public void Footer_Help_Menu_FAQs() throws InterruptedException
	{
		
		Footer_Help.click_FAQs(driver);
	
		
	}
	@Test
	public void Footer_Help_Menu_Delivery() throws InterruptedException
	{
		
		Footer_Help.click_Delivery(driver);
		
	}
	
	@Test
	public void Footer_Help_Menu_Returns() throws InterruptedException
	{
	
		Footer_Help.click_Returns(driver);
		
	}
	
	@Test
	public void Footer_Help_Menu_Finance() throws InterruptedException
	{
		
		Footer_Help.click_Finance(driver);
		
	}
	
	@Test
	public void Footer_Help_Menu_Privacy_Policy() throws InterruptedException
	{
		
		Footer_Help.click_Privacy_Policy(driver);
		
		
	}
	
	@Test
	public void Footer_Help_Menu_Terms_Conditions() throws InterruptedException
	{
		
		Footer_Help.click_Terms_Conditions(driver);
	
	}
	
	@Test
	public void Footer_Help_Menu_Product_Help_Centre() throws InterruptedException
	{
		
		Footer_Help.click_Product_Help_Centre(driver);
		
		
	}
	
	@Test
	public void Footer_Help_Menu_buyers_guides() throws InterruptedException
	{
		
		Footer_Help.click_buyers_guides(driver);

		
	}
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}


}

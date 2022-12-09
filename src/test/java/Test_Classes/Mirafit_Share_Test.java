package Test_Classes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Mirafit_Share_Pom;

public class Mirafit_Share_Test extends Mirafit_BaseClass_Pre_Production 
{
	int TCID;
	
	Mirafit_Share_Pom Share;
	
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		Share = new Mirafit_Share_Pom(driver);
		
		
	}
	

	
	@Test
	public void Share_Options_Facebook() throws InterruptedException
	{
		
		Share.click_Facebook(driver);
		
	}
	
	@Test
	public void Share_Options_Gmail() throws InterruptedException
	{
		
		Share.Click_Gmail(driver);
		
	}
	
	@Test
	public void Share_Options_Twitter() throws InterruptedException
	{
		
		Share.Click_Twitter(driver);
		
	}
	
	@Test
	public void Share_Options_LinkedIn() throws InterruptedException
	{
		
		Share.Click_More_LinkedIn(driver);
		
	}
	
//	@Test
//	public void Share_Options_Pin() throws InterruptedException
//	{
//		
//		Share.Click_Pin(driver);
//		
//	}
	
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}



}

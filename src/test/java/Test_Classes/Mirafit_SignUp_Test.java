package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Mirafit_SignUp_Pom;

public class Mirafit_SignUp_Test extends Mirafit_BaseClass_Pre_Production
{
	
	int TCID;
	Mirafit_SignUp_Pom SignUp;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		SignUp = new Mirafit_SignUp_Pom(driver);
		
		
	}
	

	@Test
	public void Sign_Up() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
	
	
		SignUp.Click_ProfileButton();
		
		SignUp.SignUpButton();
			
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
	
	
	
}



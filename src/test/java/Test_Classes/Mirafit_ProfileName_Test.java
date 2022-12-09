package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.ProfileName_Pom;

public class Mirafit_ProfileName_Test extends Mirafit_BaseClass_Pre_Production
{

	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	ProfileName_Pom verify;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		verify= new ProfileName_Pom(driver);
	}
	
	
	@Test
	public void ProfileName() throws InterruptedException, EncryptedDocumentException, IOException
	{
	
		login.login();
		
		verify.Get_Profile_Name();
		
		logout.logout(driver);
	}
	
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}

}

	
	


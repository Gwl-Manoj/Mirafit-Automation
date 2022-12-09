package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_Address_Pom;

public class Mirafit_Address_Test extends Mirafit_BaseClass_Pre_Production
{
	
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_Address_Pom Address;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Address = new Mirafit_Address_Pom(driver);
		
	}
	
	@Test
	public void Address() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Address.Click_Manage_Address();
		
		Address.Click_Add_New_Address();
		
		Address.Set_Phone_Number();
		
		Address.Set_Street_Address();
		
		Address.Set_City();
		
		Address.Set_Zip_Code();
		
		Address.Click_Save_Address();
		
		Address.Click_Delete();
		
		logout.logout(driver);
		
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
	

}


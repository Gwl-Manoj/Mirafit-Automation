package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_showlistbox_Pom;

public class Mirafit_showlistbox_test extends Mirafit_BaseClass_Pre_Production
{

	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_showlistbox_Pom Show_listbox;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();

		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Show_listbox = new Mirafit_showlistbox_Pom(driver);
		
		
	}


	
	
	@Test
	public void Showlistbox() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Show_listbox.Click_Strength_Equipement();
		
		Show_listbox.Click_Show_List_Box(driver);
		
		logout.logout(driver);
		
	}
	
	
	
	
	@AfterMethod
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
}



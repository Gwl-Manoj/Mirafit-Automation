package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_Sortby_listbox_Pom;

public class Mirafit_Sortby_listbox_Test extends Mirafit_BaseClass_Pre_Production
{
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_Sortby_listbox_Pom Sortby_listbox;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
	
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Sortby_listbox = new Mirafit_Sortby_listbox_Pom(driver);
		
	}
	
	
	@Test
	public void sortby() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Sortby_listbox.Click_Strength_Equipement();
		
		Sortby_listbox.Click_SortBy(driver);
		
		logout.logout(driver);
		
	}
	
	
	@AfterMethod
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	

}



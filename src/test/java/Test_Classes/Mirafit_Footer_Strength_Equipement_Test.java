package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Common_Methods_Pom;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_Footer_Strength_Equipement_Pom;

public class Mirafit_Footer_Strength_Equipement_Test extends Mirafit_BaseClass_Pre_Production
{
	
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_Footer_Strength_Equipement_Pom Strength_Equipement;
	Common_Methods_Pom method;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Strength_Equipement = new Mirafit_Footer_Strength_Equipement_Pom(driver);
		
	}
	

	@Test
	public void AddToCart() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		
		login.login();
		
		Strength_Equipement.Click_Strength_Equipement_Button(driver);
		
		method.Add_product_to_cart(driver);
		
		method.Click_Remove_item_from_Cart(driver);
		
//		method.Get_EmptyCartMessage();
		
		logout.logout(driver);
			
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
	
	
	
}



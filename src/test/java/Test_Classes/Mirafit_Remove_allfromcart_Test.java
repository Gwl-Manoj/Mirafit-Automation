package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Common_Methods_Pom;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Remove_allfromcart_Cart_Pom;

public class Mirafit_Remove_allfromcart_Test extends Mirafit_BaseClass_Pre_Production
{
	Login_Pre_Production_Pom login;
	Remove_allfromcart_Cart_Pom removefromcart;
	Common_Methods_Pom method;
	Logout_Pom logout;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		
		open_browser();
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		removefromcart = new Remove_allfromcart_Cart_Pom(driver);
		method = new Common_Methods_Pom(driver);
		
	}
	
	@Test()
	public void parallelbar() throws InterruptedException, EncryptedDocumentException, IOException
	{	
		login.login();
		
		removefromcart.Moveto_Strength(driver);
		
		method.Add_product_to_cart(driver);
		
		removefromcart.Move_To_Accessories(driver);
		
		method.Add_product_to_cart(driver);
		
		removefromcart.Clear_cart(driver);
		
		logout.logout(driver);
		
	}
	
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
	}

	

}

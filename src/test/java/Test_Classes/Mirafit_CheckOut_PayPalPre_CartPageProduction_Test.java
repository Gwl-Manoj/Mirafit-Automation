package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Common_Methods_Pom;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_CheckOut_PayPalPre_CartPage_Production_Pom;

public class Mirafit_CheckOut_PayPalPre_CartPageProduction_Test extends Mirafit_BaseClass_Pre_Production
{

	
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_CheckOut_PayPalPre_CartPage_Production_Pom CheckOut;
	Common_Methods_Pom method;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		CheckOut = new Mirafit_CheckOut_PayPalPre_CartPage_Production_Pom(driver);
		method = new Common_Methods_Pom(driver);
		
	}
	
	
	@Test
	public void Accessories() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		CheckOut.Move_To_Accessories(driver);
		
		method.Add_product_to_cart(driver);
	
		CheckOut.Click_Paypal_Checkout_button(driver);
		
		CheckOut.Set_Login_Paypal_Account(driver);

		logout.logout(driver);
		
		
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
	
	
	
}


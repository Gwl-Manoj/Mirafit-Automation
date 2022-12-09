package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Common_Methods_Pom;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_CheckOut_Pre_Production_Pom;

public class Mirafit_CheckOut_Pre_Production_Test extends Mirafit_BaseClass_Pre_Production
{

	
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_CheckOut_Pre_Production_Pom CheckOut;
	Common_Methods_Pom method;
	
	
	@BeforeMethod
	public void Open_Browser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		CheckOut = new Mirafit_CheckOut_Pre_Production_Pom(driver);
		method = new Common_Methods_Pom(driver);
		
		
		
	}
	
	
	@Test
	public void CheckOut() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		CheckOut.Move_To_Accessories(driver);
		
		method.Add_product_to_cart(driver);
		
//		CheckOut.Click_Checkoutpropcedure(driver);
		
		CheckOut.Checkout_steps(driver);
		
		logout.logout(driver);
		
		
	}
	
	
	@AfterMethod
	public void Close_Browser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
	}	
	
	
	
	
}


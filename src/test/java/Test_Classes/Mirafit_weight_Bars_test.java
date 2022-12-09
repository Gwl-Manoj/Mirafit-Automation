package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Common_Methods_Pom;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_weight_Bars_Pom;

public class Mirafit_weight_Bars_test extends Mirafit_BaseClass_Pre_Production
{
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_weight_Bars_Pom Weight_Bars;
	Common_Methods_Pom method;
	

	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();

		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Weight_Bars = new Mirafit_weight_Bars_Pom(driver);
		method = new Common_Methods_Pom(driver);
		
	}
	
	
	
	@Test
	public void Weight_Bars() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		login.login();
		
		Weight_Bars.Moveto_Weight_Bars(driver);
		
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


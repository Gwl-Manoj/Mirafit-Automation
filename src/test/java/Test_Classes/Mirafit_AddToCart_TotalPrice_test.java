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
import POM_Classes.Mirafit_AddToCart_TotalPrice_Pom;

public class Mirafit_AddToCart_TotalPrice_test extends Mirafit_BaseClass_Pre_Production 
{
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_AddToCart_TotalPrice_Pom AddToCart_TotalPrice;
	Common_Methods_Pom method;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		AddToCart_TotalPrice = new Mirafit_AddToCart_TotalPrice_Pom(driver);
		method = new Common_Methods_Pom(driver);
		
	} 
	
	
	@Test
	public void AddToCart() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		AddToCart_TotalPrice.Get_Search();
		
		method.Add_product_to_cart(driver);
		
		AddToCart_TotalPrice.Get_Total_Price(driver);
		
		logout.logout(driver);
	}
	

	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}

}

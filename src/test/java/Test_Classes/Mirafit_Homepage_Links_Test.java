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
import POM_Classes.Mirafit_Homepage_Links_Pom;

public class Mirafit_Homepage_Links_Test extends Mirafit_BaseClass_Pre_Production
{
	
	int TCID;

	Mirafit_Homepage_Links_Pom Links;
	Common_Methods_Pom method;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
			
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		Links = new Mirafit_Homepage_Links_Pom(driver);
		method = new Common_Methods_Pom(driver);
		login = new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		
	}
	

	@Test
	public void Verify_Homepage_Weight_Benches() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Links.Click_Weight_Benches(driver);
		
//		driver.navigate().to("https://preprod.mirafit.co.uk/mirafit-semi-commercial-adjustable-fid-weight-bench.html");
		
		method.Add_product_to_cart(driver);
		
		method.Click_Remove_item_from_Cart(driver);
		
		logout.logout(driver);	
	}
	
	@Test
	public void Verify_Homepage_Squat_Racks() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Links.Click_Squat_Racks(driver);
		
//		driver.navigate().to("https://preprod.mirafit.co.uk/mirafit-gen-ii-squat-box.html");
		
		method.Add_product_to_cart(driver);
		
		method.Click_Remove_item_from_Cart(driver);
		
		logout.logout(driver);
	}
	
	@Test
	public void Verify_Homepage_Power_Racks() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Links.Click_Power_Racks(driver);
		
//		driver.navigate().to("https://preprod.mirafit.co.uk/mirafit-m100-power-rack.html");
		
		method.Add_product_to_cart(driver);
		
		method.Click_Remove_item_from_Cart(driver);
		
		logout.logout(driver);
	}
	
	@Test
	public void Verify_Homepage_Weight_Bars() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Links.Click_Weight_Bars(driver);
		
//		driver.navigate().to("https://preprod.mirafit.co.uk/mirafit-2-olympic-weight-jaw-collars-clamps.html");
		
		method.Add_product_to_cart(driver);
		
		method.Click_Remove_item_from_Cart(driver);
		
		logout.logout(driver);
	}
	
	@Test
	public void Verify_Homepage_Medicine_Balls() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Links.Click_Medicine_Balls(driver);
		
//		driver.navigate().to("https://preprod.mirafit.co.uk/mirafit-strongman-training-ball.html");
		
		method.Add_product_to_cart(driver);
		
		method.Click_Remove_item_from_Cart(driver);
		
		logout.logout(driver);
	}
	
	@Test
	public void Verify_Homepage_Battle_Ropes() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Links.Click_Battle_Ropes(driver);
		
//		driver.navigate().to("https://preprod.mirafit.co.uk/mirafit-38mm-black-orange-battle-rope-9-12-15m.html");
		
		method.Add_product_to_cart(driver);
		
		method.Click_Remove_item_from_Cart(driver);
		
		logout.logout(driver);
	}
	
	@Test
	public void Verify_Homepage_Dumbbells() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Links.Click_Dumbbells(driver);
		
//		driver.navigate().to("https://preprod.mirafit.co.uk/mirafit-m3-commercial-dumbbells.html");
		
		method.Add_product_to_cart(driver);
		
		method.Click_Remove_item_from_Cart(driver);
		
		logout.logout(driver);
	}
	
//	@Test
//	public void Verify_Homepage_Weighted_Vests() throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		login.login();
//		
//		Links.Click_Weighted_Vests(driver);
//		
////		driver.navigate().to("https://preprod.mirafit.co.uk/mirafit-m3-commercial-dumbbells.html");
//		
//		method.Add_product_to_cart(driver);
//		
//		method.Click_Remove_item_from_Cart(driver);
//		
//		logout.logout(driver);
//			
//	}
		
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
	
	
	
}



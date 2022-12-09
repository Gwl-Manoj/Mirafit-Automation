package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_multipledata_Preproduction;
import POM_Classes.Common_Methods_Pom;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafirt_Remove_AllFromCart_Pom;

public class Mirafirt_Remove_AllFromCart_Test extends Mirafit_BaseClass_multipledata_Preproduction
{

	int TCID;
	
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafirt_Remove_AllFromCart_Pom Remove_AllFrom_Cart;
	Common_Methods_Pom method;
	
	
	@BeforeMethod
	public void Open_Browser() throws InterruptedException, EncryptedDocumentException, IOException
	{

		open_browser();
		
		login = new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Remove_AllFrom_Cart = new Mirafirt_Remove_AllFromCart_Pom(driver);
		method = new Common_Methods_Pom(driver);
		
	}
	
	
	@Test
	public void Clear_Shopping_Cart_Choice_Color() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		login.login();
		
//		Remove_AllFrom_Cart.Moveto_Strength(driver);
//		
//		method.GetProductImage();
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,300)");
//		
//		Remove_AllFrom_Cart.click_Wish_List();
//		
//		Remove_AllFrom_Cart.Get_Wishlist_Message();
//		
//		Remove_AllFrom_Cart.Click_Continue_shopping();
//		
//		js.executeScript("window.scrollBy(0,300)");
//		
//		Remove_AllFrom_Cart.Click_View_Details(driver);
//		
//		Remove_AllFrom_Cart.Get_Stock();
//		
//		Remove_AllFrom_Cart.Get_Reviews();
		
		method.Click_Choice_varients(driver);
		
//		Remove_AllFrom_Cart.Click_Choice_Color(driver);
//		
//		Remove_AllFrom_Cart.Click_Choice_size(driver);
//		
//		Remove_AllFrom_Cart.Click_Choice_No_Stock(driver);
		
		Remove_AllFrom_Cart.Click_Add_To_Cart(driver);
		
		Remove_AllFrom_Cart.Click_On_Cart_Button(driver);
		
		
		///////////////////////////////////////////////////////////////////////////
		
//		Remove_AllFrom_Cart.Click_Continue_Shopping1();
//		
//		Remove_AllFrom_Cart.Moveto_Strength(driver);
//		
//		Remove_AllFrom_Cart.GetProductImage();
//		
//		
//		js.executeScript("window.scrollBy(0,300)");
//		
//		Remove_AllFrom_Cart.click_Wish_List();
//		
//		Remove_AllFrom_Cart.Get_Wishlist_Message();
//		
//		Remove_AllFrom_Cart.Click_Continue_shopping();
//		
//		js.executeScript("window.scrollBy(0,300)");
//		
//		Remove_AllFrom_Cart.Click_View_Details(driver);
//		
//		Remove_AllFrom_Cart.Get_Stock();
//		
//		Remove_AllFrom_Cart.Get_Reviews();
//		
////		Remove_AllFrom_Cart.Click_Choice();
//		
//		Remove_AllFrom_Cart.Click_Add_To_Cart(driver);
//		
//		Remove_AllFrom_Cart.Click_On_Cart_Button(driver);
		
//		Remove_AllFrom_Cart.Click_Continue_Shopping1();
//	
////		js.executeScript("window.scrollBy(0,500)");
//		
//		Remove_AllFrom_Cart.Click_Power_Racks();
//		
////		js.executeScript("window.scrollBy(0,300)");
//		
//		Remove_AllFrom_Cart.Click_View_Details1(driver);
//		
//		Remove_AllFrom_Cart.Get_Stock1();
//		
//		Remove_AllFrom_Cart.Get_Reviews1();
//		
//		Remove_AllFrom_Cart.Click_Size();
//		
//		Remove_AllFrom_Cart.Click_Choice1();
//		
//		Remove_AllFrom_Cart.Click_Add_To_Cart1(driver);
//		
//		Remove_AllFrom_Cart.Click_On_Cart_Button1(driver);
		
		Remove_AllFrom_Cart.Clear_cart(driver);
	
		logout.logout(driver);
	}
	
	
	@AfterMethod
	public void Close_Browser() throws InterruptedException
	{

		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}	

	
	
}




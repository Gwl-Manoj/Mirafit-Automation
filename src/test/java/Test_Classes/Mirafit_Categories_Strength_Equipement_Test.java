package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_Categories_Strength_Equipement_Pom;

public class Mirafit_Categories_Strength_Equipement_Test extends Mirafit_BaseClass_Pre_Production
{
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_Categories_Strength_Equipement_Pom Categories;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Categories = new Mirafit_Categories_Strength_Equipement_Pom(driver);
	}
	
	
	@Test
	public void Categories_Cable_Machines_Attachments() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Categories.Click_Strength_Equipment(driver);
		
		Categories.Click_Categories_Title();
		
		Categories.Get_All_Categories();
		
		Categories.Click_Cable_Machines_Attachments(driver);
		
//		Categories.Click_Add_To_cart_Button(driver);
//		
//		Categories.Click_On_Cart_Button(driver);
//		
//		Categories.Click_Remove_item_from_Cart(driver);
		
		
			
	}
	
	@Test
	public void Categories_Landmine_Posts_Handles() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Categories.Click_Strength_Equipment(driver);
		
		
		Categories.Click_Landmine_Posts_Handles(driver);
		
//		Categories.Click_Add_To_cart_Button(driver);
//		
//		Categories.Click_On_Cart_Button(driver);
//		
//		Categories.Click_Remove_item_from_Cart(driver);
			
	}
	
	@Test
	public void Categories_Parallel_Bars() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Categories.Click_Strength_Equipment(driver);
		
		
		Categories.Click_Parallel_Bars(driver);
		
//		Categories.Click_Add_To_cart_Button(driver);
//		
//		Categories.Click_On_Cart_Button(driver);
//		
//		Categories.Click_Remove_item_from_Cart(driver);
			
	}
	
	@Test
	public void Categories_Power_Cages_Racks() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Categories.Click_Strength_Equipment(driver);
		
		Categories.Click_Power_Cages_Racks(driver);
		
//		Categories.Click_Add_To_cart_Button(driver);
//		
//		Categories.Click_On_Cart_Button(driver);
//		
//		Categories.Click_Remove_item_from_Cart(driver);
			
	}
	
	@Test
	public void Categories_Pull_Up_Bars() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		login.login();
		
		Categories.Click_Strength_Equipment(driver);
		
		
		Categories.Click_Pull_Up_Bars(driver);
		
//		Categories.Click_Add_To_cart_Button(driver);
//		
//		Categories.Click_On_Cart_Button(driver);
//		
//		Categories.Click_Remove_item_from_Cart(driver);
			
	}
	
	@Test
	public void Categories_Click_Gym_Towers() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Categories.Click_Strength_Equipment(driver);
		
		
		Categories.Click_Gym_Towers(driver);
		
//		Categories.Click_Add_To_cart_Button(driver);
//		
//		Categories.Click_On_Cart_Button(driver);
//		
//		Categories.Click_Remove_item_from_Cart(driver);
			
	}
	
	@Test
	public void Categories_Click_Situp_Benches() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Categories.Click_Strength_Equipment(driver);
		
		Categories.Click_Situp_Benches(driver);
		
//		Categories.Click_Add_To_cart_Button(driver);
//		
//		Categories.Click_On_Cart_Button(driver);
//		
//		Categories.Click_Remove_item_from_Cart(driver);
			
	}
	
	@Test
	public void Categories_Click_Squat_Racks_Stands() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Categories.Click_Strength_Equipment(driver);
		
		Categories.Click_Squat_Racks_Stands(driver);
		
//		Categories.Click_Add_To_cart_Button(driver);
//		
//		Categories.Click_On_Cart_Button(driver);
//		
//		Categories.Click_Remove_item_from_Cart(driver);
			
	}
	
	@Test
	public void Categories_Click_Weight_Benches() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login();
		
		Categories.Click_Strength_Equipment(driver);
		
		Categories.Click_Weight_Benches(driver);
		
//		Categories.Click_Add_To_cart_Button(driver);
//		
//		Categories.Click_On_Cart_Button(driver);
//		
//		Categories.Click_Remove_item_from_Cart(driver);
			
		logout.logout(driver);
	}
	
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}


}

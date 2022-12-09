package POM_Classes;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class Login_page_Validation_Pom 
{

	public Login_page_Validation_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Login_With_Multiple_data(WebDriver driver) throws InterruptedException, IOException 
	{
		driver.findElement(By.xpath("(//a[@href='https://preprod.mirafit.co.uk/customer/account/'])[2]")).click();
		Thread.sleep(2000);
		
		Sheet sh = Utility.getmultipledata("Login_Page");
		
		 String username = null;
		 String password = null;
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			 Row row=sh.getRow(i);
			 for(int j= 0; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==0)
				 {
					 username = cell.getStringCellValue();
				 }
				 if(j==1)
				 {
					 password = cell.getStringCellValue();
				 }
			 }
			 Thread.sleep(2000);
			 driver.findElement(By.id("email")).clear();
			 driver.findElement(By.id("email")).sendKeys(username);
			 
			 driver.findElement(By.id("pass")).clear();
			 driver.findElement(By.id("pass")).sendKeys(password);
			
			 driver.findElement(By.xpath("//button[@class='action login primary']")).click();
			 
			 
			 String result = null;
			 
			 try {
				 boolean emailerror = driver.findElement(By.id("email-error")).isDisplayed();
				 

				 if(emailerror==true)
				 {
					 result="Fail";
					 Reporter.log("User Name : "+username+"--->"+"password : "+password+"--->"+"Login Failed-- Please enter a valid email address. "+"--->"+result, true);
					 Reporter.log(" ", true);
				 }				
				
				 
				 }catch(Exception e)
				 {
					 
				 }
				 try
				 {
					 Boolean islogged = driver.findElement(By.xpath("(//a[@class='action edit'])[3]")).isDisplayed();
					 if(islogged==true)
					 {
						 result= "Pass";
						 Reporter.log("User Name : "+username+"--->"+"password : "+password+"--->"+"Login Success  -- The Email ID & Password Matches "+"--->"+result,true);
						 Reporter.log(" ", true);
					 }

					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@class='header_account_link']")).click();
					 Thread.sleep(2000);
					 
				 }

				 
				 
				 
				 catch(Exception e)
				 {
					 Boolean iserror = driver.findElement(By.xpath("(//div[@class='messages'])[1]")).isDisplayed();
					 
					 if(iserror==true)
					 {
						 result = "Fail";
						 Reporter.log("User Name : "+username+"--->"+"password : "+password+"--->"+"Login Failed -- These credentials do not match our records."+"--->"+result,true);
						 Reporter.log(" ", true);
					 }
					 
					
					 

				 }
		 }
	}

}

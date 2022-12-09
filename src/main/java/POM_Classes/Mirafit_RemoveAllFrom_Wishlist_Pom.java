package POM_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Mirafit_RemoveAllFrom_Wishlist_Pom 
{

	@FindBy(xpath = "//a[text()='Wish List']") private WebElement Wishlist;
	@FindBy(xpath = "//div[@class='message-success success message']") private WebElement wishlist_message;
	@FindBy(xpath = "//span[text()='Remove item']") private WebElement Remove_Item;
	
	
	public Mirafit_RemoveAllFrom_Wishlist_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Wishlist() throws InterruptedException
	{
		Wishlist.click();
		Thread.sleep(2000);
		
	}
	
	public void Get_Wishlist_Message() throws InterruptedException
	{
		String Wishlistmessage = wishlist_message.getText();
		Reporter.log(Wishlistmessage, true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
	}
	
	public void Click_Remove_Item(WebDriver driver) throws InterruptedException
	{
	
		int size = driver.findElements(By.xpath("//ol[@class='product-items']/li")).size();
			
		for(int i=1; i<=size; i++)
		{
			Remove_Item.click();
			Thread.sleep(2000);
			String Wishlistmessage = wishlist_message.getText();
			Reporter.log(Wishlistmessage, true);
			Reporter.log(" ", true);
			
		}
		
	}
	
	public void Clear_wishlist(WebDriver driver) throws InterruptedException
	{
		Click_Wishlist();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Click_Remove_Item(driver);
		
	}
}

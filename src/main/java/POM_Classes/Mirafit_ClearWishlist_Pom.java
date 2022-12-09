package POM_Classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Mirafit_ClearWishlist_Pom 
{
	@FindBy (xpath = "(//span[@class='caret'])[2]") private WebElement strength;
	@FindBy(xpath = "(//ul[@class='level0 nav-submenu nav-panel--dropdown nav-panel']//a)[4]") private WebElement parallelBars;
	@FindBy(xpath = "//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']") private WebElement Allproducts;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//img[@class='product-image-photo']") private WebElement ProductImage;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//span[@class='icon ib ib-hover ic ic-heart ']") private WebElement wishlist;
	@FindBy(xpath = "//div[@class='message-success success message']") private WebElement wishlist_message;
	@FindBy(xpath = "//a[@class='btn-remove action delete']") private WebElement Remove_From_wishlist;
	@FindBy(xpath = "//div[@class='message-success success message']") private WebElement Remove_From_wishlist_Message;
	@FindBy(xpath="//div[@class='message info empty']/span") private WebElement EmptycartMessage;
	
	
	public Mirafit_ClearWishlist_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Moveto_Strength(WebDriver driver) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(strength).perform();
		parallelBars.click();
		
		List<WebElement> allproducts = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // Get all product list
		
		for(WebElement s1:allproducts)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
	}
	
	public void GetProductImage()
	{
		if(ProductImage.isDisplayed())
		{
			Reporter.log("Product Image Displayed", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("Product Image Not Displayed", true);
			Reporter.log(" ", true);
		}
	}
	
	public void click_Wish_List() throws InterruptedException
	{
		wishlist.click();
		Thread.sleep(2000);
	}
	
	public void Get_Wishlist_Message() throws InterruptedException
	{
		String Wishlistmessage = wishlist_message.getText();
		Reporter.log(Wishlistmessage, true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
	}
	
	public void Click_Remove_From_wishlist(WebDriver driver)
	{
		 int size = driver.findElements(By.xpath("//ol[@class='product-items']/li")).size();
		for(int i =0; i<=size; i++)
		{
			Remove_From_wishlist.click();
			String WishlistRemovemessage = Remove_From_wishlist_Message.getText();
			Reporter.log(WishlistRemovemessage, true);
			Reporter.log(" ", true);
		}
//		Remove_From_wishlist.click();
	}
	
	public void Get_Remove_From_wishlist_Message()
	{
		String WishlistRemovemessage = EmptycartMessage.getText();
		Reporter.log(WishlistRemovemessage, true);
	}
	
	public void Clear_wish_list(WebDriver driver) throws InterruptedException
	{
		Moveto_Strength(driver);
		
		GetProductImage();
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");	
			
		click_Wish_List();
		
		Get_Wishlist_Message();
		
		Click_Remove_From_wishlist(driver);
		
//		Get_Remove_From_wishlist_Message();
			
	}
	
	
	
}

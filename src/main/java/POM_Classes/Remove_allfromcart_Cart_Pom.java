package POM_Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Remove_allfromcart_Cart_Pom 
{
	@FindBy (xpath = "(//span[@class='caret'])[2]") private WebElement strength;
	@FindBy(xpath = "(//ul[@class='level0 nav-submenu nav-panel--dropdown nav-panel']//a)[4]") private WebElement parallelBars;
	@FindBy(xpath = "//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']") private WebElement Allproducts;
	
	@FindBy(xpath = "(//span[@class='caret'])[7]") private WebElement Accessories;
	@FindBy (xpath = "(//ul[@class='level0 nav-submenu nav-panel--dropdown nav-panel']//a)[52]") private WebElement ClothingAndApparel;
	
	@FindBy(xpath = "//span[text()='Clear Shopping Cart']") private WebElement Clear_Cart;
	@FindBy(xpath = "(//div[@class='cart-empty']/p)[1]") private WebElement Clear_Cart_Msg;
	
	public Remove_allfromcart_Cart_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Moveto_Strength(WebDriver driver) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(strength).perform();
		parallelBars.click();
		Thread.sleep(2000);
		List<WebElement> allproducts = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // Get all product list
		
		for(WebElement s1:allproducts)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
		Thread.sleep(2000);
	}
	
	
	public void Move_To_Accessories(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='action continue']")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(Accessories).perform();
		Thread.sleep(2000);
		
		ClothingAndApparel.click();
		Thread.sleep(2000);
		List<WebElement> allproducts = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // Get all product list
		
		for(WebElement s1:allproducts)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
		Thread.sleep(2000);
		
	}
	
	public void Clear_cart(WebDriver driver) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='data table totals']/tbody//td)[2]")));
		
		Clear_Cart.click();
		Reporter.log("Clicked on clear shopping cart button", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		String empty_cart_Msg = Clear_Cart_Msg.getText();
		Reporter.log(empty_cart_Msg, true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='here']")).click();
		Thread.sleep(2000);
	}
	
	

}

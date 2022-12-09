package POM_Classes;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Library_Files.Utility;

public class Mirafit_CheckOut_Pre_Production_Pom 
{
	@FindBy(xpath = "(//span[@class='caret'])[7]") private WebElement Accessories;
	@FindBy (xpath = "(//ul[@class='level0 nav-submenu nav-panel--dropdown nav-panel']//a)[52]") private WebElement ClothingAndApparel;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//img[@class='product-image-photo']") private WebElement ProductImage;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//span[@class='icon ib ib-hover ic ic-heart ']") private WebElement wishlist;
	@FindBy(xpath = "//div[@class='message-success success message']") private WebElement wishlist_message;
	@FindBy(xpath = "//a[text()='here']") private WebElement Continue_Shopping;
	@FindBy(xpath = "(//a[@class='product-item-link'])[2]") private WebElement ViewDetails;
	@FindBy(xpath = "//div[@class='stock available']") private WebElement Stock;
	@FindBy(xpath = "//div[@class='reviews-actions']") private WebElement Reviews;
	@FindBy(id = "attribute446") private WebElement Choice;
	@FindBy(id = "product-addtocart-button") private WebElement AddToCart;
	@FindBy(xpath = "(//span[@class='caret'])[1]") private WebElement CartButton;
	@FindBy(xpath = "//a[@class='action viewcart']") private WebElement ViewAndCartButton;
	@FindBy(xpath = "//div[@class='message message-success success']") private WebElement CartMessage;
	@FindBy(xpath = "//a[@class='action action-delete']") private WebElement RemoveItemfromcart;
	@FindBy(xpath = "//div[@class='cart-empty']") private WebElement EmptyCartMessage;
	

	@FindBy(xpath = "//span[@class='price']") private WebElement Cart_Price;
	
	@FindBy(xpath = "//button[@class='action primary checkout']") private WebElement CheckOut_Button;
	@FindBy(xpath = "(//input[@class='radio'])[3]") private WebElement Card_Radio_Button;
	@FindBy(xpath = "//input[@class='number']") private WebElement Card_Number;
	@FindBy(xpath = "//input[@id='expiration']") private WebElement Card_Date_Year;//expirationDate-target-prev
	@FindBy(xpath = "//input[@id='cvv']") private WebElement Card_CVV;//input[@class='cvv']
	@FindBy(xpath = "//button[@class='action primary checkout btn-placeorder']") private WebElement Placeorder;
	
	
	
	
	
	public Mirafit_CheckOut_Pre_Production_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Move_To_Accessories(WebDriver driver) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(Accessories).perform();
		Thread.sleep(2000);
		ClothingAndApparel.click();
		Thread.sleep(2000);
		List<WebElement> allproducts = driver.findElements(By.xpath("//li[@class='item product product-item']//a[@class='product-item-link']"));  // Get all product list
		
		for(WebElement s1:allproducts)
		{
			Reporter.log("The product list on page is "+s1.getText(), true);
			Reporter.log(" ",true);
			
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
	
	public void Click_Continue_shopping() throws InterruptedException
	{
		Continue_Shopping.click();
//		Thread.sleep(2000);
	}
	
	public void Click_View_Details(WebDriver driver) throws InterruptedException
	{
		ViewDetails.click();

	}
	
	public void Get_Stock()
	{
		String stock = Stock.getText();
		Reporter.log(" The Product is "+stock, true);
		Reporter.log(" ", true);
	}
	
	public void Get_Reviews()
	{
		String Reviews1 = Reviews.getText();
		Reporter.log(Reviews1, true);
		Reporter.log(" ", true);
	}
	
	public void Click_Choice()
	{	
		Select choice = new Select(Choice);
		choice.selectByValue("6335");
	}
	
	public void Click_Add_To_Cart(WebDriver driver) throws InterruptedException
	{
		AddToCart.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='minicart-icon-price']")));	
	}
	
	public void Click_On_Cart_Button(WebDriver driver) throws InterruptedException
	{
		String cart_price=Cart_Price.getText();
		Reporter.log("The cart price is "+cart_price, true);
		Reporter.log(" ", true);
		Actions act = new Actions(driver);
		act.moveToElement(CartButton).perform();
		ViewAndCartButton.click();
		Thread.sleep(2000);
	}
	
	
	public void Click_Checkout_button(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='data table totals']/tbody//td)[2]")));
		CheckOut_Button.click();
		Thread.sleep(2000);
	
		String CheckOut_Url = driver.getCurrentUrl();
		Reporter.log("The URL for Checkout is "+CheckOut_Url, true);
		Reporter.log(" ", true);
		
	}
	
	public void Click_Checkout(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='price']/span")));
	
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//li[@id='payment']//form)[1]"))).perform();
		
//		driver.findElement(By.xpath("//button[@class='action primary checkout']")).click();
//		System.out.println("Checkout");
		
		driver.findElement(By.xpath("(//input[@class='radio'])[3]")).click();
		Reporter.log("Selected payment by card ", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
	}
	
	public void Set_Card_Number(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id='braintree-hosted-field-number']")));
	
		
		driver.switchTo().frame("braintree-hosted-field-number");
		Thread.sleep(2000);
		Card_Number.sendKeys("4111 1111 1111 1111");
		Reporter.log("The Card Number is entered", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();

	}
	
	public void Set_Card_Date_Year(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id='braintree-hosted-field-expirationDate']")));

		driver.switchTo().frame("braintree-hosted-field-expirationDate");
		Thread.sleep(2000);
		Card_Date_Year.sendKeys("1123");
		Reporter.log("The Card Expiration date is entered", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
	}
	
	public void Set_Card_CVV(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id='braintree-hosted-field-cvv']")));

		driver.switchTo().frame("braintree-hosted-field-cvv");
		Thread.sleep(2000);
		Card_CVV.sendKeys("123");
		Reporter.log("The Card CVV Number is entered", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
	}
	
	public void Click_Placeorder_Button(WebDriver driver) throws InterruptedException
	{
		
		String[] ordertotal = driver.findElement(By.xpath("(//span[@class='price'])[5]")).getText().split("£");
		
		float ordertotal1 =Float.parseFloat(ordertotal[1]); 
		
		if(ordertotal1>50)
		{
			Placeorder.click();
			Reporter.log("Clicked on Place order button", true);
			Reporter.log(" ", true);
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id='Cardinal-CCA-IFrame']")));

			driver.switchTo().frame("Cardinal-CCA-IFrame");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@class='input-field']")).sendKeys("1234");
			Reporter.log("Password (OTP) Entered ", true);
			Reporter.log(" ", true);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@class='button primary']")).click();
			Reporter.log("Clicked on Submit button", true);
			Reporter.log(" ", true);
			Thread.sleep(2000);
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='checkout-success']/p/a")));

			
			String order_no = driver.findElement(By.xpath("//div[@class='checkout-success']/p/a")).getText();
			Reporter.log("Your order number is: "+order_no, true);
			Reporter.log(" ",true);
			
			String order_mail = driver.findElement(By.xpath("(//div[@class='checkout-success']/p)[2]")).getText();
			Reporter.log(order_mail, true);
			Reporter.log(" ",true);
		}
		else
		{
			Placeorder.click();
			Reporter.log("Clicked on Place order button", true);
			Reporter.log(" ", true);
			
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='checkout-success']/p/a")));
			
			String order_no = driver.findElement(By.xpath("//div[@class='checkout-success']/p/a")).getText();
			Reporter.log("Your order number is: "+order_no, true);
			Reporter.log(" ",true);
			
			String order_mail = driver.findElement(By.xpath("(//div[@class='checkout-success']/p)[2]")).getText();
			Reporter.log(order_mail, true);
			Reporter.log(" ",true);
			
		}
		
	}
	
	
	
	public void Click_Checkoutpropcedure(WebDriver driver) throws InterruptedException
	{
		driver.navigate().to("https://preprod.mirafit.co.uk/onestepcheckout.html");
		String CheckOut_Url = driver.getCurrentUrl();
		Reporter.log("The URL for Checkout is "+CheckOut_Url, true);
		Reporter.log(" ", true);
		Thread.sleep(2000);

	}
	
	public void Checkout_steps(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		Click_Checkout_button(driver);
		
		Click_Checkout(driver);
		
		Set_Card_Number(driver);
		
		Set_Card_Date_Year(driver);
		
		Set_Card_CVV(driver);
		
		Click_Placeorder_Button(driver);
	}
}

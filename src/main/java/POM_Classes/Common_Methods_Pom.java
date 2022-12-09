package POM_Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Common_Methods_Pom 
{
	@FindBy (xpath = "(//nav[@id='mainmenu']//li)[1]") public WebElement Strength;
	@FindBy(xpath = "(//ul[@class='level0 nav-submenu nav-panel--dropdown nav-panel']//a)[1]") public WebElement parallelbar;
	@FindBy(xpath = "//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']") public WebElement Allproducts;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//img[@class='product-image-photo']") public WebElement ProductImage;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//span[@class='icon ib ib-hover ic ic-heart ']") public WebElement wishlist;
	@FindBy(xpath = "//div[@class='message-success success message']") public WebElement wishlist_message;
	@FindBy(xpath = "//a[text()='here']") public WebElement Continue_Shopping;
	@FindBy(xpath = "(//a[@class='product-item-link'])[2]") public WebElement ViewDetails;
	@FindBy(xpath = "//div[@class='product-info-stock-sku']") public WebElement Stock;
	@FindBy(xpath = "//div[@class='reviews-actions']") public WebElement Reviews;
	@FindBy(xpath = "//select[@class='super-attribute-select']") public WebElement Choice;
	@FindBy(id = "attribute465") private WebElement Choice1;
	@FindBy(id = "attribute447") private WebElement Choice2;
	@FindBy(id = "attribute446") private WebElement Choice3;
	
	@FindBy(id = "product-addtocart-button") public WebElement AddToCart;
	@FindBy(xpath = "(//span[@class='caret'])[1]") public WebElement CartButton;
	@FindBy(xpath = "//a[@class='action viewcart']") public WebElement ViewAndCartButton;
	@FindBy(xpath = "//div[@class='message message-success success']") public WebElement CartMessage;
	@FindBy(xpath = "//a[@class='action action-delete']") private WebElement RemoveItemfromcart;
	@FindBy(xpath = "//div[@class='cart-empty']") private WebElement EmptyCartMessage;
	

	public Common_Methods_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
		Reporter.log("Clicked on wishlist Icon", true);
		Reporter.log(" ", true);
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
		Reporter.log("Clicked on continue here link", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
	}
	
	public void Click_View_Details(WebDriver driver) throws InterruptedException
	{
		ViewDetails.click();
		Reporter.log("Clicked on product name link", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='fotorama__img magnify-opaque']")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='price-box price-final_price']//span[@class='price'])[1]")));
		
	}
	
	public void Get_Stock()
	{
		String stock = Stock.getText();
		Reporter.log(" The Product is "+stock, true);	
		Reporter.log(" ", true);
	}
	
	public void Get_Reviews() throws InterruptedException
	{
		if(Reviews.isEnabled())
		{
			String Reviews1 = Reviews.getText();
			Reporter.log(Reviews1, true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("There are no reviews yet", true);
			Reporter.log(" ", true);
		}

		Thread.sleep(2000);
	}
	
	public void Click_Choice_varients(WebDriver driver) throws InterruptedException
	{	
		
		try {

			// For size varient
			if (driver.findElements(By.xpath("//label[@for='attribute446']")).size()>0) 
			{
				Reporter.log("The product is available with size varient", true);
				Reporter.log(" ", true);
				
				Select choice = new Select(Choice);
				String Value = driver.findElement(By.xpath("(//select[@id='attribute446']/option)[2]")).getAttribute("value");
				
				choice.selectByValue(Value);
				Thread.sleep(2000);
				
				String stock = Stock.getText();
				String Exp_stock = "Out of Stock";
				if(stock.equalsIgnoreCase(Exp_stock)==true)
				{
					
					Reporter.log("The product is Out of stock so selected another one", true);
					Reporter.log(" ", true);
					String Value1 = driver.findElement(By.xpath("(//select[@id='attribute446']/option)[3]")).getAttribute("value");
					
					choice.selectByValue(Value1);
					Thread.sleep(2000);
				} 
				
				// For choice varient
				if (driver.findElements(By.xpath("//label[@for='attribute465']")).size()>0) 
				{
					Reporter.log("The product is available with choice varient", true);
					Reporter.log(" ", true);
					
					Select choice1 = new Select(Choice1);
					String Value2 = driver.findElement(By.xpath("(//select[@id='attribute465']/option)[2]")).getAttribute("value");
					choice1.selectByValue(Value2);
					Thread.sleep(2000);
					
					String stock1 = Stock.getText();
					String Exp_stock1 = "Out of Stock";
					if(stock1.equalsIgnoreCase(Exp_stock1)==true)
					{
						
						Reporter.log("The product is Out of stock so selected another one", true);
						Reporter.log(" ", true);
						String Value3 = driver.findElement(By.xpath("(//select[@id='attribute465']/option)[3]")).getAttribute("value");
						choice.selectByValue(Value3);
						Thread.sleep(2000);
					} 
				}
				
				// For color varient
				if(driver.findElements(By.xpath("//label[@for='attribute447']")).size()>0)
				{
					Reporter.log("The product is available with color varient", true);
					Reporter.log(" ", true);
					Select choice1 = new Select(Choice2);
					String Value2 = driver.findElement(By.xpath("(//select[@id='attribute447']/option)[2]")).getAttribute("value");
					choice1.selectByValue(Value2);
					Thread.sleep(2000);
					
					String stock1 = Stock.getText();
					String Exp_stock1 = "Out of Stock";
					if(stock1.equalsIgnoreCase(Exp_stock1)==true)
					{
						Reporter.log("The selected product is Out of stock so selected another one", true);
						Reporter.log(" ", true);
						String Value1 = driver.findElement(By.xpath("(//select[@id='attribute447']/option)[3]")).getAttribute("value");
						choice.selectByValue(Value1);
						Thread.sleep(2000);
					}
				}
				
			} 
			
		} 
		catch (Exception e) 
		{
			Reporter.log("No size varient available", true);
			Reporter.log(" ", true);
		}
/////////////////////////////////////////////////////////////////////////////////////////////

		
		try
		{
			// For color varient
			if(driver.findElements(By.xpath("//label[@for='attribute447']")).size()>0)
			{
				Reporter.log("The product is available with color varient", true);
				Reporter.log(" ", true);
				Select choice = new Select(Choice);
				String Value = driver.findElement(By.xpath("(//select[@id='attribute447']/option)[2]")).getAttribute("value");
				choice.selectByValue(Value);
				Thread.sleep(2000);
				
				String stock = Stock.getText();
				String Exp_stock = "Out of Stock";
				if(stock.equalsIgnoreCase(Exp_stock)==true)
				{
					Reporter.log("The selected product is Out of stock so selected another one", true);
					Reporter.log(" ", true);
					String Value1 = driver.findElement(By.xpath("(//select[@id='attribute447']/option)[3]")).getAttribute("value");
					choice.selectByValue(Value1);
					Thread.sleep(2000);
				}
				
				// For choice varient
				if (driver.findElements(By.xpath("//label[@for='attribute465']")).size()>0) 
				{
					Reporter.log("The product is available with choice varient", true);
					Reporter.log(" ", true);
					
					Select choice1 = new Select(Choice1);
					String Value2 = driver.findElement(By.xpath("(//select[@id='attribute465']/option)[2]")).getAttribute("value");
					choice1.selectByValue(Value2);
					Thread.sleep(2000);
					
					String stock1 = Stock.getText();
					String Exp_stock1 = "Out of Stock";
					if(stock1.equalsIgnoreCase(Exp_stock1)==true)
					{
						
						Reporter.log("The product is Out of stock so selected another one", true);
						Reporter.log(" ", true);
						String Value3 = driver.findElement(By.xpath("(//select[@id='attribute465']/option)[3]")).getAttribute("value");
						choice.selectByValue(Value3);
						Thread.sleep(2000);
					} 
				}
				
				// For size varient
				if (driver.findElements(By.xpath("//label[@for='attribute446']")).size()>0) 
				{
					Reporter.log("The product is available with size varient", true);
					Reporter.log(" ", true);
					
					Select choice2 = new Select(Choice3);
					String Value3 = driver.findElement(By.xpath("(//select[@id='attribute446']/option)[2]")).getAttribute("value");
					
					choice2.selectByValue(Value3);
					Thread.sleep(2000);
					
					String stock1 = Stock.getText();
					String Exp_stock1 = "Out of Stock";
					if(stock1.equalsIgnoreCase(Exp_stock1)==true)
					{
						
						Reporter.log("The product is Out of stock so selected another one", true);
						Reporter.log(" ", true);
						String Value1 = driver.findElement(By.xpath("(//select[@id='attribute446']/option)[3]")).getAttribute("value");
						
						choice.selectByValue(Value1);
						Thread.sleep(2000);
					} 
					
				
			}
				
				
				
			}
			
		}
		
		catch(Exception e)
		{
			
			Reporter.log("No color varient available", true);
			Reporter.log(" ", true);
		}
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		

		try {

			// For Out Of Stock
			String stock = Stock.getText();
			String Exp_stock = "Out of Stock";
			if(stock.equalsIgnoreCase(Exp_stock)==true) 
			{
				Reporter.log("The selected product is Out of stock so selected another one", true);
				Reporter.log(" ", true);
				
				driver.navigate().back();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//a[@class='product-item-link'])[3]")).click();
				Thread.sleep(2000);

				// For size varient
				if (driver.findElements(By.xpath("//label[@for='attribute446']")).size()>0) 
				{
					Reporter.log("The product is available with size varient", true);
					Reporter.log(" ", true);
					
					Select choice = new Select(Choice);
					String Value = driver.findElement(By.xpath("(//select[@id='attribute446']/option)[2]")).getAttribute("value");
					choice.selectByValue(Value);
					Thread.sleep(2000);
					String stock2 = Stock.getText();
					String Exp_stock2 = "Out of Stock";
					if(stock2.equalsIgnoreCase(Exp_stock2)==true)
					{
						Reporter.log("The product is out of stock so selected another one", true);
						Reporter.log(" ", true);
						String Value1 = driver.findElement(By.xpath("(//select[@id='attribute446']/option)[3]")).getAttribute("value");
						choice.selectByValue(Value1);
						Thread.sleep(2000);
					} 
					
					// For choice varient
					if (driver.findElements(By.xpath("//label[@for='attribute465']")).size()>0) 
					{
						Reporter.log("The product is available with choice varient", true);
						Reporter.log(" ", true);
						
						Select choice1 = new Select(Choice1);
						String Value2 = driver.findElement(By.xpath("(//select[@id='attribute465']/option)[2]")).getAttribute("value");
						choice1.selectByValue(Value2);
						Thread.sleep(2000);
						
						String stock1 = Stock.getText();
						String Exp_stock1 = "Out of Stock";
						if(stock1.equalsIgnoreCase(Exp_stock1)==true)
						{
							
							Reporter.log("The product is Out of stock so selected another one", true);
							Reporter.log(" ", true);
							String Value3 = driver.findElement(By.xpath("(//select[@id='attribute465']/option)[3]")).getAttribute("value");
							choice.selectByValue(Value3);
							Thread.sleep(2000);
						} 
					} 
				} 
				
				
				// For color varient
				if (driver.findElements(By.xpath("//label[@for='attribute447']")).size()>0) 
				{
					Reporter.log("The product is available with color varient", true);
					Reporter.log(" ", true);
					Select choice = new Select(Choice);
					String Value = driver.findElement(By.xpath("(//select[@id='attribute447']/option)[2]")).getAttribute("value");
					choice.selectByValue(Value);
					Thread.sleep(2000);
					String stock1 = Stock.getText();
					String Exp_stock1 = "Out of Stock";
					if(stock1.equalsIgnoreCase(Exp_stock1)==true) 
					{
						Reporter.log("The product is out of stock so selected another one", true);
						Reporter.log(" ", true);
						String Value1 = driver.findElement(By.xpath("(//select[@id='attribute447']/option)[3]")).getAttribute("value");
						choice.selectByValue(Value1);
						Thread.sleep(2000);
					} 
					
					// For choice varient
					if (driver.findElements(By.xpath("//label[@for='attribute465']")).size()>0) 
					{
						Reporter.log("The product is available with choice varient", true);
						Reporter.log(" ", true);
						
						Select choice1 = new Select(Choice1);
						String Value2 = driver.findElement(By.xpath("(//select[@id='attribute465']/option)[2]")).getAttribute("value");
						choice1.selectByValue(Value2);
						Thread.sleep(2000);
						
						String stock2 = Stock.getText();
						String Exp_stock2 = "Out of Stock";
						if(stock2.equalsIgnoreCase(Exp_stock2)==true)
						{
							
							Reporter.log("The product is Out of stock so selected another one", true);
							Reporter.log(" ", true);
							String Value3 = driver.findElement(By.xpath("(//select[@id='attribute465']/option)[3]")).getAttribute("value");
							choice.selectByValue(Value3);
							Thread.sleep(2000);
						} 
					} 
					
				} 

				
			} 

		} 
		catch (Exception e) {
			Reporter.log("The Product is in stock", true);
			Reporter.log(" ", true);
		}

	}
	
	public void Click_Add_To_Cart(WebDriver driver) throws InterruptedException
	{
		AddToCart.click();
		Reporter.log("Clicked on Add to cart button", true);
		Reporter.log(" ", true);
		Thread.sleep(4000);
		
	}
	
	public void Click_On_Cart_Button(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(CartButton).perform();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='price'])[3]")));	

		ViewAndCartButton.click();
		Reporter.log("Navigated to cart page", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);

		
		
	}
	
	public void Click_Remove_item_from_Cart(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='data table totals']/tbody//td)[2]")));
		RemoveItemfromcart.click();
		Reporter.log("Clicked on remove item from cart button ", true);
		Reporter.log(" ", true);
		
		Reporter.log("The item has been removed from cart ", true);
		Reporter.log(" ", true);
		
	}
	
	public void Get_EmptyCartMessage()
	{
		String Emptycart = EmptyCartMessage.getText();
		Reporter.log(Emptycart, true);
		Reporter.log(" ", true);
	}
	
	public void Add_product_to_cart(WebDriver driver) throws InterruptedException
	{
		GetProductImage();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		click_Wish_List();
		
		Get_Wishlist_Message();
		
		Click_Continue_shopping();
				
		js.executeScript("window.scrollBy(0,300)");
	
		Click_View_Details(driver);
		
		Get_Stock();
		
		Get_Reviews();
		
		Click_Choice_varients(driver);
		
		Click_Add_To_Cart(driver);
		
		Click_On_Cart_Button(driver);

	}

	
}

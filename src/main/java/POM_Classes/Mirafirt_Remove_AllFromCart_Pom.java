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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Mirafirt_Remove_AllFromCart_Pom {

	@FindBy(xpath = "(//nav[@id='mainmenu']//li)[1]")
	private WebElement Strength;
	@FindBy(xpath = "(//ul[@class='level0 nav-submenu nav-panel--dropdown nav-panel']//a)[1]")
	private WebElement parallelbar;
	@FindBy(xpath = "//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']")
	private WebElement Allproducts;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//img[@class='product-image-photo']")
	private WebElement ProductImage;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//span[@class='icon ib ib-hover ic ic-heart ']")
	private WebElement wishlist;
	@FindBy(xpath = "//div[@class='message-success success message']")
	private WebElement wishlist_message;
	@FindBy(xpath = "//a[text()='here']")
	private WebElement Continue_Shopping;
	@FindBy(xpath = "(//a[@class='product-item-link'])[1]")
	private WebElement ViewDetails;
	@FindBy(xpath = "//div[@class='stock available']")
	private WebElement Stock;
	@FindBy(xpath = "//div[@class='reviews-actions']")
	private WebElement Reviews;
	@FindBy(xpath = "//select[@class='super-attribute-select']")
	private WebElement Choice;
	@FindBy(id = "product-addtocart-button")
	private WebElement AddToCart;
	@FindBy(xpath = "(//span[@class='caret'])[1]")
	private WebElement CartButton;
	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement ViewAndCartButton;
	@FindBy(xpath = "//div[@class='message message-success success']")
	private WebElement CartMessage;

	@FindBy(xpath = "//a[@class='action continue']")
	private WebElement Continue;
	@FindBy(xpath = "//span[text()='POWER RACKS']")
	private WebElement Power_Racks;
	@FindBy(xpath = "(//a[@class='action tocart primary'])[1]")
	private WebElement cart;
	@FindBy(xpath = "//div[@class='stock available']")
	private WebElement Stock1;
	@FindBy(xpath = "//a[@class='action view']")
	private WebElement Reviews1;
	@FindBy(id = "attribute446")
	private WebElement Size;
	@FindBy(id = "attribute447")
	private WebElement Choice1;
	@FindBy(id = "product-addtocart-button")
	private WebElement AddToCart1;
	@FindBy(xpath = "(//span[@class='caret'])[1]")
	private WebElement CartButton1;
	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement ViewAndCartButton1;
	@FindBy(xpath = "//div[@class='message message-success success']")
	private WebElement CartMessage1;
	@FindBy(xpath = "//span[text()='Clear Shopping Cart']")
	private WebElement Clear_Cart;
	@FindBy(xpath = "(//div[@class='cart-empty']/p)[1]")
	private WebElement Clear_Cart_Msg;

	public Mirafirt_Remove_AllFromCart_Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Moveto_Strength(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(Strength).perform();
		parallelbar.click();

		List<WebElement> allproducts = driver.findElements(By.xpath(
				"//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']")); // Get
																																								// all
																																								// product
																																								// list

		for (WebElement s1 : allproducts) {
			Reporter.log("The product list is " + s1.getText(), true);
			Reporter.log(" ");
		}

	}

	public void GetProductImage() {
		if (ProductImage.isDisplayed()) {
			Reporter.log("Product Image Displayed", true);
			Reporter.log(" ");
		} else {
			Reporter.log("Product Image Not Displayed", true);
			Reporter.log(" ");
		}
	}

	public void click_Wish_List() throws InterruptedException {
		wishlist.click();
		Thread.sleep(2000);
	}

	public void Get_Wishlist_Message() throws InterruptedException {
		String Wishlistmessage = wishlist_message.getText();
		Reporter.log(Wishlistmessage, true);
		Reporter.log(" ");
		Thread.sleep(2000);
	}

	public void Click_Continue_shopping() throws InterruptedException {
		Continue_Shopping.click();
		Thread.sleep(2000);
	}

	public void Click_View_Details(WebDriver driver) throws InterruptedException {
		ViewDetails.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//img[@class='fotorama__img magnify-opaque']")));
	}

	public void Get_Stock() {
		String stock = Stock.getText();
		Reporter.log(" The Product is " + stock, true);
		Reporter.log(" ");
	}

	public void Get_Reviews() throws InterruptedException {
		if (Reviews.isEnabled()) {
			String Reviews1 = Reviews.getText();
			Reporter.log(Reviews1, true);
			Reporter.log(" ");
		} else {
			Reporter.log("There are no reviews yet", true);
			Reporter.log(" ");
		}
//		String Reviews1 = Reviews.getText();
//		Reporter.log(Reviews1, true);
		Thread.sleep(2000);
	}

	public void Click_Choice_Color(WebDriver driver) throws InterruptedException
	{	
//		if(Choice.isDisplayed()==true)
//		{
//			Select choice = new Select(Choice);
//			choice.selectByValue("5439");
//			
//		}
//		else
//		{
//			System.out.println("Nothing to choice");
//		}
		
		//https://preprod.mirafit.co.uk/mirafit-m3-rack-mounted-barbell-holder.html
		driver.navigate().to("https://preprod.mirafit.co.uk/mirafit-complete-weight-bench-bar-kit-with-100kg-weights.html");
		try
		{
			// For color varient
			if(driver.findElements(By.xpath("//label[@for='attribute447']")).size()>0)
			{
				Reporter.log("The product is available with color varient", true);
				Reporter.log(" ", true);
				Select choice = new Select(Choice);
				choice.selectByValue("5438");
				
				if(driver.findElements(By.xpath("//div[@class='product alert stock']")).size()>0)
				{
					Reporter.log("The selected product is Out of stock so selected another one", true);
					Reporter.log(" ", true);
					choice.selectByValue("5439");
				}
				
			}
			
		}
		
		catch(Exception e)
		{
			
			Reporter.log("No color varient available", true);
		}
	}

	public void Click_Choice_size(WebDriver driver) throws InterruptedException {

		try {

			// For size varient
			if (driver.findElements(By.xpath("//label[@for='attribute446']")).size()>0) 
			{
				Reporter.log("The product is available with size varient", true);
				Reporter.log(" ", true);
				
				Select choice = new Select(Choice);
				choice.selectByValue("5441");
				Thread.sleep(2000);
				if (driver.findElements(By.xpath("//div[@class='product alert stock']")).size()>0) {
					
					Reporter.log("The product is Out of stock so selected another one", true);
					Reporter.log(" ", true);
					
					choice.selectByValue("6257");
				} 
			} 
			
		} 
		catch (Exception e) 
		{
			Reporter.log("No size varient available", true);
		}
	}

	public void Click_Choice_No_Stock(WebDriver driver) throws InterruptedException {

		try {

			// For Out Of Stock
			if (driver.findElements(By.xpath("//div[@class='product alert stock']")).size()>0) 
			{
				Reporter.log("The selected product is Out of stock so selected another one", true);
				Reporter.log(" ", true);
				
				driver.navigate().back();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//a[@class='product-item-link'])[3]")).click();
				Thread.sleep(2000);

				// For color varient
				if (driver.findElements(By.xpath("//label[@for='attribute447']")).size()>0) 
				{
					Reporter.log("The product is available with color varient", true);
					Reporter.log(" ", true);
					Select choice = new Select(Choice);
					choice.selectByValue("5438");
					Thread.sleep(2000);
					if (driver.findElements(By.xpath("//div[@class='product alert stock']")).size()>0) 
					{
						Reporter.log("The product is out of stock so selected another one", true);
						Reporter.log(" ", true);
						choice.selectByValue("5439");
					} 
				} 

				// For size varient
				if (driver.findElements(By.xpath("//label[@for='attribute446']")).size()>0) 
				{
					Reporter.log("The product is available with size varient", true);
					Reporter.log(" ", true);
					
					Select choice = new Select(Choice);
					choice.selectByValue("5441");
					Thread.sleep(2000);
					if (driver.findElements(By.xpath("//div[@class='product alert stock']")).size()>0) 
					{
						Reporter.log("The product is out of stock so selected another one", true);
						Reporter.log(" ", true);
						choice.selectByValue("6257");
					} 
				} 
			} 

		} catch (Exception e) {
			Reporter.log("Product is out of stock", true);
		}

	}

	public void Click_Add_To_Cart(WebDriver driver) throws InterruptedException {
		AddToCart.click();

		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='minicart-icon-price']")));

	}

	public void Click_On_Cart_Button(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(CartButton).perform();
		ViewAndCartButton.click();
		Thread.sleep(2000);
	}

	public void Click_Continue_Shopping1() {
		Continue.click();
	}

	public void Click_Power_Racks() {
		Power_Racks.click();
	}

	public void Click_View_Details1(WebDriver driver) throws InterruptedException {
		cart.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//img[@class='fotorama__img magnify-opaque']")));
	}

	public void Get_Stock1() {
		String stock = Stock1.getText();
		Reporter.log(" The Product is " + stock, true);
	}

	public void Get_Reviews1() {
		String Reviews2 = Reviews1.getText();
		Reporter.log(Reviews2, true);
	}

	public void Click_Size() {
		Select choice = new Select(Size);
		choice.selectByValue("5566");
	}

	public void Click_Choice1() {
		Select choice = new Select(Choice1);
		choice.selectByValue("5438");
	}

	public void Click_Add_To_Cart1(WebDriver driver) throws InterruptedException {
		AddToCart1.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='minicart-icon-price']")));
	}

	public void Click_On_Cart_Button1(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(CartButton1).perform();
		ViewAndCartButton1.click();
//		Thread.sleep(2000);
//		String cartmessage = CartMessage1.getText();
//		Reporter.log(cartmessage, true);
		Thread.sleep(2000);
	}

	public void Clear_cart(WebDriver driver) throws InterruptedException {
		Clear_Cart.click();
		Reporter.log("Clicked on clear shopping cart button", true);
		Thread.sleep(2000);
		String empty_cart_Msg = Clear_Cart_Msg.getText();
		Reporter.log(empty_cart_Msg, true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='here']")).click();
		Thread.sleep(2000);
	}

}

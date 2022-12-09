package POM_Classes;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Mirafit_CheckOut_PayPalPre_CartPage_Production_Pom 
{
	@FindBy(xpath = "(//span[@class='caret'])[7]") private WebElement Accessories;
	@FindBy (xpath = "(//ul[@class='level0 nav-submenu nav-panel--dropdown nav-panel']//span)[54]") private WebElement ClothingAndApparel;
	
	@FindBy(xpath = "//div[@class='paypal-button-label-container']") private WebElement Paypal_CheckOut_Button;
	@FindBy(id=("email")) private WebElement Email;
	@FindBy(id=("btnNext")) private WebElement Next_Btn;
	@FindBy(id=("password")) private WebElement Password;
	@FindBy(id=("btnLogin")) private WebElement Login_Btn;
	@FindBy(id=("payment-submit-btn")) private WebElement Review_Order_Btn;
	@FindBy(id=("review-button")) private WebElement Place_Order_Btn;
	@FindBy(xpath = "//div[@class='checkout-success']/p/a") private WebElement Order_No;
	@FindBy(xpath = "(//div[@class='checkout-success']/p)[2]") private WebElement Order_Mail;
	
	
	
	
	
	public Mirafit_CheckOut_PayPalPre_CartPage_Production_Pom(WebDriver driver)
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
		
		
	}
	
	
	
	public void Click_Paypal_Checkout_button(WebDriver driver) throws InterruptedException
	{
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='data table totals']/tbody//td)[2]")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='zoid-component-frame zoid-visible']")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Checkout']")));
		
		Paypal_CheckOut_Button.click();
		Reporter.log("Clicked on Paypal Checkout button ", true);
		Reporter.log(" ", true);
		Thread.sleep(4000);
	}
	
	public void Set_Login_Paypal_Account(WebDriver driver) throws InterruptedException
	{
//		
		String parent=driver.getWindowHandle();
		 Set<String> windows = driver.getWindowHandles();
		 Iterator<String> I1= windows.iterator();

		 while(I1.hasNext())
		 {

		 String child_window=I1.next();


		 if(!parent.equals(child_window))
		 {
		 driver.switchTo().window(child_window);

		 Reporter.log(driver.switchTo().window(child_window).getTitle(), true);
		 Reporter.log(" ", true);
		 
		Thread.sleep(2000);
		Email.sendKeys("sb-rljeg6070639@personal.example.com");
		Reporter.log("The mail id is entered", true);
		Reporter.log(" ", true);
		
		Thread.sleep(2000);
		
		Next_Btn.click();
		Thread.sleep(2000);
		
		Password.sendKeys(",Z77m.4/");
		Reporter.log("The password is entered", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		Login_Btn.click();
		Reporter.log("Clicked on Login button", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		Review_Order_Btn.click();
		Reporter.log("Clicked on review order button", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		
		 }
		 }
		
		 driver.switchTo().window(parent);
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,300)");
		 
		 Place_Order_Btn.click();
		 Reporter.log("Clicked on place order button", true);
		 Reporter.log(" ", true);
		 Thread.sleep(2000);
		 
		 String order_no = Order_No.getText();
		Reporter.log("Your order number is: "+order_no, true);
		Reporter.log(" ",true);
			
		String order_mail = Order_Mail.getText();
		Reporter.log(order_mail, true);
		Reporter.log(" ",true);
		 
	}
	
	

}

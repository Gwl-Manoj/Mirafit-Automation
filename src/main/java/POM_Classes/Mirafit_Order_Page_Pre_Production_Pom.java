package POM_Classes;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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

public class Mirafit_Order_Page_Pre_Production_Pom 
{
	@FindBy(xpath = "//a[text()='My Orders']") private WebElement My_Orders;
	@FindBy (xpath = "//td[@class='col id']") private WebElement Order_ID;
	@FindBy(xpath = "//td[@class='col date']") private WebElement Order_Date;
	@FindBy(xpath = "//td[@class='col total']") private WebElement Order_Total;
	@FindBy(xpath = "//td[@class='col status']") private WebElement Order_Status;
	@FindBy(xpath = "//td[@class='col actions']") private WebElement Order_Actions;
	@FindBy(xpath = "(//a[@class='action view'])[1]") private WebElement View_Order_Button;
	@FindBy(xpath = "//span[@class='order-status']") private WebElement Order_Status1;
	@FindBy(xpath = "//tbody/tr/td/strong[@class='product name product-item-name']") private WebElement Product_Name;
	@FindBy(xpath = "//td[@class='col sku']") private WebElement Product_SKU; 
	@FindBy(xpath = "//td[@class='col price']") private WebElement Product_Price; 
	@FindBy(xpath = "(//td[@class='col qty']//span)[2]") private WebElement Product_Quantity;
	@FindBy(xpath = "(//td[@class='col subtotal']//span)[3]") private WebElement Product_Subtotal1;
	@FindBy(xpath = "(//td[@class='amount'])[1]//span") private WebElement Product_Subtotal;
	@FindBy(xpath = "(//td[@class='amount'])[2]//span") private WebElement Product_ShippingCharges;
	@FindBy(xpath = "(//td[@class='amount'])[3]//span") private WebElement Product_total;
	@FindBy(xpath = "//li/strong[text()='Items Ordered']") private WebElement Items_Ordered_Button;

	@FindBy(xpath = "//a[@class='header_account_link']") private WebElement logout;
	
	
	
	public Mirafit_Order_Page_Pre_Production_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_My_Orders(WebDriver driver) throws InterruptedException
	{
		
		My_Orders.click();
		Thread.sleep(2000);
		String Actual_Url = driver.getCurrentUrl();
		String  Expected_Url = "https://preprod.mirafit.co.uk/sales/order/history/";
		if(Expected_Url.equals(Actual_Url))
		{
			Reporter.log("The Actual and Expected URL's are same i.e. "+Actual_Url, true);
			Reporter.log(" ", true);
		}
		
		
	}
	

	
	public void Get_Order_Details() throws InterruptedException
	{
		String orderid = Order_ID.getText();
		String expected_orderID = "101486290";
		if(expected_orderID.equals(orderid))
		{
			Reporter.log("The Order_ID is same i.e. "+orderid, true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The Order_ID is different i.e. "+orderid, true);
			Reporter.log(" ", true);
		}
		
		String order_Date = Order_Date.getText();
		String expected_order_Date = "7/19/22";
		if(expected_order_Date.equals(order_Date))
		{
			Reporter.log("The Order_Date is same i.e. "+order_Date, true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The Order_Date is different i.e. "+order_Date, true);
			Reporter.log(" ", true);
		}
		
		
		String order_Total = Order_Total.getText();
		String expected_order_Total = "£4.95";
		if(expected_order_Total.equals(order_Total))
		{
			Reporter.log("The Order_Total is same i.e. "+order_Total, true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The Order_Total is different i.e. "+order_Total, true);
			Reporter.log(" ", true);
		}
		
		String order_Status = Order_Status.getText();
		String expected_order_Status = "Processing";
		if(expected_order_Status.equals(order_Status))
		{
			Reporter.log("The Order_Status is same i.e. "+order_Status, true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The Order_Status is different i.e. "+order_Status, true);
			Reporter.log(" ", true);
		}
		
		String order_Actions = Order_Actions.getText();
		String expected_order_Actions = "View Order Reorder";
		if(expected_order_Actions.equals(order_Actions))
		{
			Reporter.log("The Order_Actions is same i.e. "+order_Actions, true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The Order_Actions is different i.e. "+order_Actions, true);
			Reporter.log(" ", true);
		}
		
		View_Order_Button.click();
		Thread.sleep(2000);
		String expected_Order_Status = Order_Status1.getText();
		
		if(order_Status.equals(expected_Order_Status))
		{
			Reporter.log("The Order_Status is same i.e. "+order_Status, true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The Order_Status is different i.e. "+order_Status, true);
			Reporter.log(" ", true);
		}
		Thread.sleep(2000);
		
//		Items_Ordered_Button.click();
//		
//		String product_Name = Product_Name.getText();
//		Reporter.log(product_Name);
//		
		
	}
	
	public void Get_Product_Name(WebDriver driver)
	{
		String product_Name = Product_Name.getText();
		Reporter.log("The Product name is "+product_Name, true);
		Reporter.log(" ", true);
	}
	
	public void Get_Product_SKU(WebDriver driver)
	{
		String product_SKU = Product_SKU.getText();
		Reporter.log("The Product SKU is "+product_SKU, true);
		Reporter.log(" ", true);
	}
	
	public void Get_Product_Price()
	{
		String product_Price = Product_Price.getText();
		Reporter.log("The Product price is "+product_Price, true);
		Reporter.log(" ", true);
	}
	
	public void Get_Product_Quantity()
	{
		String product_Quantity = Product_Quantity.getText();
		Reporter.log("The Product Quantity is "+product_Quantity, true);
		Reporter.log(" ", true);
	}
	
	public void Get_Product_Subtotal()
	{
		String product_Subtotal = Product_Subtotal.getText();
		Reporter.log("The Product subtotal is "+product_Subtotal, true);
		Reporter.log(" ", true);
	}
	
	public void Get_Product_ShippingCharges()
	{
		String product_ShippingCharges = Product_ShippingCharges.getText();
		Reporter.log("The Product ShippingCharge is "+product_ShippingCharges, true);
		Reporter.log(" ", true);
	}
	
	public void Get_Product_Total()
	{
		String product_total = Product_total.getText();
		Reporter.log("The Product Total is "+product_total, true);
		Reporter.log(" ", true);
		
	}
	
	public void Verify_Product_Total()
	{
		String[] product_total = Product_total.getText().split("£");
		String[] product_Subtotal = Product_Subtotal.getText().split("£");
		String[] product_Subtotal1 = Product_Subtotal1.getText().split("£");
		String product_Quantity = Product_Quantity.getText();
		String[] product_Price = Product_Price.getText().split("£");
		String[] product_ShippingCharges = Product_ShippingCharges.getText().split("£");
		
		float productprice=Float.parseFloat(product_Price[1]);
		Reporter.log("The product price is "+productprice, true);
		Reporter.log(" ", true);
		
		float quantity=Float.parseFloat(product_Quantity); 
		Reporter.log("The product quantity is "+quantity, true);
		Reporter.log(" ", true);
		
		float Subtotal=Float.parseFloat(product_Subtotal[1]); 
		Reporter.log("The product Subtotal is "+Subtotal, true);
		Reporter.log(" ", true);
		
		float Subtotal1=Float.parseFloat(product_Subtotal1[1]); 
		Reporter.log("The product Subtotal 1 is "+Subtotal1, true);
		Reporter.log(" ", true);
		
		float Shipping_charges = Float.parseFloat(product_ShippingCharges[1]);
		Reporter.log("The product Shipping_charges is "+Shipping_charges, true);
		Reporter.log(" ", true);
		
		float Grand_Total = Float.parseFloat(product_total[1]);
		Reporter.log("The product Grand_Total is "+Grand_Total, true);
		Reporter.log(" ", true);
		
		float subtotal = productprice*quantity;
		
		float Grand_Total_Actual = subtotal + Shipping_charges;
		if(Grand_Total_Actual == Grand_Total)
		{
			Reporter.log("The Expected and actual total is same for the product i.e. "+Grand_Total_Actual, true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The Expected and actual total is different for the product i.e. "+Grand_Total_Actual, true);
			Reporter.log(" ", true);
		}
		
	}//https://prnt.sc/mX0FE2qz2cPG
	
	public void Get_Product_Name()
	{
		String product_Name = Product_Name.getText();
		Reporter.log(product_Name, true);
		Reporter.log(" ", true);
	}
	
	public void Click_View_Order_Button(WebDriver driver) throws InterruptedException
	{
		View_Order_Button.click();
		Thread.sleep(2000);
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='fotorama__stage__frame fotorama__active fotorama_vertical_ratio fotorama__loaded fotorama__loaded--img']")));
		
	}
	
	public void click_logout(WebDriver driver) throws InterruptedException
	{
		
		logout.click();
		Reporter.log("Clicked on log out", true);
		Reporter.log(" ", true);
		Reporter.log("Successfully Logged Out", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
	}
	
	
	

	public void Order_page(WebDriver driver) throws InterruptedException
	{
		Click_My_Orders(driver);
		
		Get_Order_Details();
		
		Get_Product_Name(driver);
		
		Get_Product_SKU(driver);
		
		Get_Product_Price();
		
		Get_Product_Quantity();
		
		Get_Product_Subtotal();
		
		Get_Product_Total();
		
		Verify_Product_Total();
		
		click_logout(driver);
	}
}

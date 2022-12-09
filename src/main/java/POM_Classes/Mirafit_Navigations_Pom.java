package POM_Classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Mirafit_Navigations_Pom 
{
	
	@FindBy(xpath = "//li[@class='nav-item level0 nav-1 level-top first classic']") private WebElement Strength;
	@FindBy(xpath = "(//a[@class='page'])[1]") private WebElement Page2;
	@FindBy(xpath = "(//a[@class='page'])[2]") private WebElement Page3;
	@FindBy(xpath = "(//a[@class='page'])[3]") private WebElement Page4;
	@FindBy(xpath = "(//a[@class='page'])[4]") private WebElement Page5;
	@FindBy(xpath = "(//a[@class='page'])[5]") private WebElement Page6;
	@FindBy(xpath = "(//a[@class='page'])[6]") private WebElement Page7;
	@FindBy(xpath = "(//a[@class='page'])[7]") private WebElement Page8;
	@FindBy(xpath = "(//a[@class='page'])[8]") private WebElement Page9;
	
	
	
	public Mirafit_Navigations_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Strength_Equipements(WebDriver driver) throws InterruptedException
	{
		Strength.click();
		Thread.sleep(2000);
		System.out.println("----------------< Result before Navigation (Page 1) >--------------------");
		List<WebElement> Options = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // For to get 24 products list
		
		
		for(WebElement s1:Options)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}

	}
	
	public void Click_Page2(WebDriver driver) throws InterruptedException
	{
		Page2.click();
		Thread.sleep(2000);
		String Expectedurl = "https://preprod.mirafit.co.uk/strength-equipment.html?p=2";
		String actualurl=driver.getCurrentUrl();
		
		if(Expectedurl.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The both URL's are same for page 2", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The both URL's are different for page 2", true);
			Reporter.log(" ", true);
		}
		System.out.println("----------------< Result after Navigation (Page 2) >--------------------");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // For to get 24 products list
		
		for(WebElement s1:options)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
		
	}
	
	public void Click_Page3(WebDriver driver) throws InterruptedException
	{
		Page3.click();
		Thread.sleep(2000);
		String Expectedurl = "https://preprod.mirafit.co.uk/strength-equipment.html?p=3";
		String actualurl=driver.getCurrentUrl();
		
		if(Expectedurl.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The both URL's are same for page 3", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The both URL's are different for page 3", true);
			Reporter.log(" ", true);
		}
		System.out.println("----------------< Result after Navigation (Page 3) >--------------------");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // For to get 24 products list
		
		for(WebElement s1:options)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
		
	}
	
	public void Click_Page4(WebDriver driver) throws InterruptedException
	{
		Page4.click();
		Thread.sleep(2000);
		
		String Expectedurl = "https://preprod.mirafit.co.uk/strength-equipment.html?p=4";
		String actualurl=driver.getCurrentUrl();
		
		if(Expectedurl.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The both URL's are same for page 4", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The both URL's are different for page 4", true);
			Reporter.log(" ", true);
		}
		
		System.out.println("----------------< Result after Navigation (Page 4) >--------------------");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // For to get 24 products list
		
		for(WebElement s1:options)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
		
	}
	
	public void Click_Page5(WebDriver driver) throws InterruptedException
	{
		Page5.click();
		Thread.sleep(2000);
		String Expectedurl = "https://preprod.mirafit.co.uk/strength-equipment.html?p=2";
		String actualurl=driver.getCurrentUrl();
		
		if(Expectedurl.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The both URL's are same for page 5", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The both URL's are different for page 5", true);
			Reporter.log(" ", true);
		}
		
		System.out.println("----------------< Result after Navigation (Page 5) >--------------------");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // For to get 24 products list
		
		for(WebElement s1:options)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
		
	}
	
	public void Click_Page6(WebDriver driver) throws InterruptedException
	{
		Page6.click();
		Thread.sleep(2000);
		
		String Expectedurl = "https://preprod.mirafit.co.uk/strength-equipment.html?p=6";
		String actualurl=driver.getCurrentUrl();
		
		if(Expectedurl.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The both URL's are same for page 6", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The both URL's are different for page 6", true);
			Reporter.log(" ", true);
		}
		
		
		System.out.println("----------------< Result after Navigation (Page 6) >--------------------");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // For to get 24 products list
		
		for(WebElement s1:options)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
		
	}
	
	public void Click_Page7(WebDriver driver) throws InterruptedException
	{
		Page7.click();
		Thread.sleep(2000);
		
		String Expectedurl = "https://preprod.mirafit.co.uk/strength-equipment.html?p=7";
		String actualurl=driver.getCurrentUrl();
		
		if(Expectedurl.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The both URL's are same for page 7", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The both URL's are different for page 7", true);
			Reporter.log(" ", true);
		}
		
		
		System.out.println("----------------< Result after Navigation (Page 7) >--------------------");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // For to get 24 products list
		
		for(WebElement s1:options)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
		
	}
	
	public void Click_Page8(WebDriver driver) throws InterruptedException
	{
		Page8.click();
		Thread.sleep(2000);
		String Expectedurl = "https://preprod.mirafit.co.uk/strength-equipment.html?p=8";
		String actualurl=driver.getCurrentUrl();
		
		if(Expectedurl.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The both URL's are same for page 8", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The both URL's are different for page 8", true);
			Reporter.log(" ", true);
		}
		
		System.out.println("----------------< Result after Navigation (Page 8) >--------------------");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // For to get 24 products list
		
		for(WebElement s1:options)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
		
	}
	
	public void Click_Page9(WebDriver driver) throws InterruptedException
	{
		Page9.click();
		Thread.sleep(2000);
		
		String Expectedurl = "https://preprod.mirafit.co.uk/strength-equipment.html?p=9";
		String actualurl=driver.getCurrentUrl();
		
		if(Expectedurl.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The both URL's are same for page 9", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The both URL's are different for page 9", true);
			Reporter.log(" ", true);
		}
		
		System.out.println("----------------< Result after Navigation (Page 9) >--------------------");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // For to get 24 products list
		
		for(WebElement s1:options)
		{
			Reporter.log("The list of products on page are as follows : ", true);
			Reporter.log(" ", true);
			Reporter.log(s1.getText(), true);
			Reporter.log(" ", true);
			
		}
		
	}
	
	public void Page_Navigations(WebDriver driver) throws InterruptedException
	{
		
		
		Click_Strength_Equipements(driver);
		
		Click_Page2(driver);
		
		Click_Page3(driver);
		
		Click_Page4(driver);
		
		Click_Page5(driver);
		
		Click_Page6(driver);
		
		Click_Page7(driver);
		
		Click_Page8(driver);
		
		Click_Page9(driver);
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

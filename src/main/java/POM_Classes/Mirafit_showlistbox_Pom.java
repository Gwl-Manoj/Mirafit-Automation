package POM_Classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Mirafit_showlistbox_Pom
{

	@FindBy(xpath = "//li[@class='nav-item level0 nav-1 level-top first nav-item--parent classic nav-item--only-subcategories parent']") private WebElement Strength_Equipement;
	@FindBy(xpath = "(//select[@class='limiter-options'])[1]") private WebElement Showlistbox;
	
	
	public Mirafit_showlistbox_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Click_Strength_Equipement()
	{
		Strength_Equipement.click();
	}
	
	public void Click_Show_List_Box(WebDriver driver) throws InterruptedException
	{
		WebElement showlistbox = Showlistbox;
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']//li"));
		Reporter.log("Selected 12 option", true);
		Reporter.log(" ", true);
		Reporter.log("The selected option is "+list.size(), true);
		Reporter.log(" ", true);
		Select ss = new Select(showlistbox);
		ss.selectByValue("24");// 24 results will be displayed per page
		Reporter.log("Selected 24 option", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		Reporter.log("The selected option is "+list.size(), true);
		Reporter.log(" ", true);
		
		List<WebElement> Options = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // For to get 24 products list
//		int Size = Options.size();
//		System.out.println(Size);
		
		
		for(WebElement s1:Options)
		{
			Reporter.log(s1.getText(),true);
			Reporter.log(" ", true);
		}
		
		
	
	}
	
	
	
}

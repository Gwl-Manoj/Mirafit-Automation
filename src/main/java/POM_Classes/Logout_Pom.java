package POM_Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Logout_Pom 
{

	
	@FindBy(xpath = "(//div[@class='custom_sigin_header'])[2]/a") private WebElement Profile;
	@FindBy(xpath = "(//div[@class='custom_sigin_header'])/a") private WebElement Profile1;
	@FindBy(xpath = "//a[@class='header_account_link']") private WebElement logout;
	@FindBy(xpath="//div[@class='column main']/p") private WebElement logout_message;
	
	
	public Logout_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void click_login_btn(WebDriver driver)
	{
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='custom_sigin_header'])[2]/a")));
		
		if(driver.findElements(By.xpath("(//div[@class='custom_sigin_header'])[2]/a")).size()>0)
		{
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='custom_sigin_header'])[2]/a")));
			Profile.click();
		}
		else
		{
//			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='custom_sigin_header'])/a")));
			
			Profile1.click();
		}
	}
	
	public void click_logout(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='header_account_link']")));
		
		logout.click();
		Reporter.log("Clicked on log out", true);
		Reporter.log(" ", true);
		Reporter.log("Successfully Logged Out", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
	}
	
	public void get_logout_message()
	{
		String SignOut = logout_message.getText();
		Reporter.log(SignOut, true);
	}
	
	public void logout(WebDriver driver) throws InterruptedException
	{
		click_login_btn(driver);
		click_logout(driver);
//		get_logout_message();
	}
	
	
}

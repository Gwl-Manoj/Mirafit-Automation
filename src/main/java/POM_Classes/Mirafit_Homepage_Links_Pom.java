package POM_Classes;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Mirafit_Homepage_Links_Pom 
{

	@FindBy(xpath = "(//a[@class='logo'])[2]") private WebElement logo;
	@FindBy(xpath = "(//div[@class='gym-content']//a//span)[1]") private WebElement Weight_Benches;
	@FindBy(xpath = "(//div[@class='gym-content']//a//span)[2]") private WebElement Weight_Bars;
	@FindBy(xpath = "(//div[@class='gym-content']//a//span)[3]") private WebElement Power_Racks;
	@FindBy(xpath = "(//div[@class='gym-content']//a//span)[4]") private WebElement Squat_Racks;
	@FindBy(xpath = "(//div[@class='gym-content']//a//span)[5]") private WebElement Medicine_Balls;
	@FindBy(xpath = "(//div[@class='gym-content']//a//span)[6]") private WebElement Dumbbells;
	@FindBy(xpath = "(//div[@class='gym-content']//a//span)[7]") private WebElement Battle_Ropes;
	@FindBy(xpath = "(//div[@class='gym-content']//a//span)[8]") private WebElement Weighted_Vests;
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "(//div[@class='col-md-4 col-sm-4 text-center'])[2]") private WebElement Image_Squat_Racks;

	@FindBy(xpath = "(//div[@class='col-md-4 col-sm-4 text-center'])[3]") private WebElement Image_Power_Racks;
	@FindBy(xpath = "(//div[@class='col-md-4 col-sm-4 text-center'])[4]") private WebElement Conditioning;
	@FindBy(xpath = "(//div[@class='col-md-4 col-sm-4 text-center'])[4]") private WebElement Image_Conditioning;
	@FindBy(xpath = "(//div[@class='col-md-4 col-sm-4 text-center'])[5]") private WebElement Bars;
	@FindBy(xpath = "(//div[@class='col-md-4 col-sm-4 text-center'])[5]") private WebElement Image_Bars;
	@FindBy(xpath = "(//div[@class='col-md-4 col-sm-4 text-center'])[6]") private WebElement Bumper_Plates;
	@FindBy(xpath = "(//div[@class='col-md-4 col-sm-4 text-center'])[6]") private WebElement Image_Bumper_Plates;
	
	
	public Mirafit_Homepage_Links_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Weight_Benches(WebDriver driver) throws InterruptedException
	{
		logo.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		
		String text = Weight_Benches.getText();
		Reporter.log(Weight_Benches.getText(), true);
		Reporter.log(" ", true);

		Weight_Benches.click();
		Thread.sleep(2000);

		String exp = "https://preprod.mirafit.co.uk/strength-equipment/weight-benches.html";
		String actual = driver.getCurrentUrl();
		Reporter.log("The URL for " + text + " is -- " + driver.getCurrentUrl(), true);
		Reporter.log(" ", true);
		if (actual.equals(exp)) {
			Reporter.log("The both URL's for " + text + " are same ", true);
			Reporter.log(" ", true);
		} else {
			Reporter.log("The both URL's for " + text + " are Different ", true);
			Reporter.log(" ", true);
		}
		
	}
	
	public void Click_Squat_Racks(WebDriver driver) throws InterruptedException
	{
		logo.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		
		String text = Squat_Racks.getText();
		Reporter.log(Squat_Racks.getText(), true);
		Reporter.log(" ", true);

		Squat_Racks.click();
		Thread.sleep(2000);

		String exp = "https://preprod.mirafit.co.uk/strength-equipment/squat-racks-stands.html";
		String actual = driver.getCurrentUrl();
		Reporter.log("The URL for " + text + " is -- " + driver.getCurrentUrl(), true);
		Reporter.log(" ", true);
		if (actual.equals(exp)) {
			Reporter.log("The both URL's for " + text + " are same ", true);
			Reporter.log(" ", true);
		} else {
			Reporter.log("The both URL's for " + text + " are Different ", true);
			Reporter.log(" ", true);
		}
		
	}
	
	
	
	public void Click_Power_Racks(WebDriver driver) throws InterruptedException
	{
		logo.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		
		String text = Power_Racks.getText();
		Reporter.log(Power_Racks.getText(), true);
		Reporter.log(" ", true);

		Power_Racks.click();
		Thread.sleep(2000);

		String exp = "https://preprod.mirafit.co.uk/strength-equipment/power-cages-racks.html";
		String actual = driver.getCurrentUrl();
		Reporter.log("The URL for " + text + " is -- " + driver.getCurrentUrl(), true);
		Reporter.log(" ", true);
		if (actual.equals(exp)) {
			Reporter.log("The both URL's for " + text + " are same ", true);
			Reporter.log(" ", true);
		} else {
			Reporter.log("The both URL's for " + text + " are Different ", true);
			Reporter.log(" ", true);
		}
		
	}
	
	public void Click_Weight_Bars(WebDriver driver) throws InterruptedException
	{
		logo.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		
		String text = Weight_Bars.getText();
		Reporter.log(Weight_Bars.getText(), true);
		Reporter.log(" ", true);

		Weight_Bars.click();
		Thread.sleep(2000);

		String exp = "https://preprod.mirafit.co.uk/weights-and-bars.html";
		String actual = driver.getCurrentUrl();
		Reporter.log("The URL for " + text + " is -- " + driver.getCurrentUrl(), true);
		Reporter.log(" ", true);
		if (actual.equals(exp)) {
			Reporter.log("The both URL's for " + text + " are same ", true);
			Reporter.log(" ", true);
		} else {
			Reporter.log("The both URL's for " + text + " are Different ", true);
			Reporter.log(" ", true);
		}
		
	}
	
	public void Click_Medicine_Balls(WebDriver driver) throws InterruptedException
	{
		
		logo.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		
		String text = Medicine_Balls.getText();
		Reporter.log(Medicine_Balls.getText(), true);
		Reporter.log(" ", true);

		Medicine_Balls.click();
		Thread.sleep(2000);

		String exp = "https://preprod.mirafit.co.uk/weights-and-bars/medicine-balls.html";
		String actual = driver.getCurrentUrl();
		Reporter.log("The URL for " + text + " is -- " + driver.getCurrentUrl(), true);
		Reporter.log(" ", true);
		if (actual.equals(exp)) {
			Reporter.log("The both URL's for " + text + " are same ", true);
			Reporter.log(" ", true);
		} else {
			Reporter.log("The both URL's for " + text + " are Different ", true);
			Reporter.log(" ", true);
		}
		
	}
	
	public void Click_Dumbbells(WebDriver driver) throws InterruptedException
	{
		logo.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		
		String text = Dumbbells.getText();
		Reporter.log(Dumbbells.getText(), true);
		Reporter.log(" ", true);

		Dumbbells.click();
		Thread.sleep(2000);

		String exp = "https://preprod.mirafit.co.uk/weights-and-bars/dumbbells.html";
		String actual = driver.getCurrentUrl();
		Reporter.log("The URL for " + text + " is -- " + driver.getCurrentUrl(), true);
		Reporter.log(" ", true);
		if (actual.equals(exp)) {
			Reporter.log("The both URL's for " + text + " are same ", true);
			Reporter.log(" ", true);
		} else {
			Reporter.log("The both URL's for " + text + " are Different ", true);
			Reporter.log(" ", true);
		}
		
		
		
	}
	
	public void Click_Battle_Ropes(WebDriver driver) throws InterruptedException
	{
		logo.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		
		String text = Battle_Ropes.getText();
		Reporter.log(Battle_Ropes.getText(), true);
		Reporter.log(" ", true);

		Battle_Ropes.click();
		Thread.sleep(2000);

		String exp = "https://preprod.mirafit.co.uk/conditioning/battle-ropes.html";
		String actual = driver.getCurrentUrl();
		Reporter.log("The URL for " + text + " is -- " + driver.getCurrentUrl(), true);
		Reporter.log(" ", true);
		if (actual.equals(exp)) {
			Reporter.log("The both URL's for " + text + " are same ", true);
			Reporter.log(" ", true);
		} else {
			Reporter.log("The both URL's for " + text + " are Different ", true);
			Reporter.log(" ", true);
		}
		
		
		
	}
	
	public void Click_Weighted_Vests(WebDriver driver) throws InterruptedException
	{
		logo.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		
		String text = Weighted_Vests.getText();
		Reporter.log(Weighted_Vests.getText(), true);
		Reporter.log(" ", true);

		Weighted_Vests.click();
		Thread.sleep(2000);

		String exp = "https://preprod.mirafit.co.uk/weights-and-bars/wearable-weights/weighted-vests.html";
		String actual = driver.getCurrentUrl();
		Reporter.log("The URL for " + text + " is -- " + driver.getCurrentUrl(), true);
		Reporter.log(" ", true);
		if (actual.equals(exp)) {
			Reporter.log("The both URL's for " + text + " are same ", true);
			Reporter.log(" ", true);
		} else {
			Reporter.log("The both URL's for " + text + " are Different ", true);
			Reporter.log(" ", true);
		}
		
		
		
	}
	
	
	
	
}

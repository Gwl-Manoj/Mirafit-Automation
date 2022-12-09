package POM_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class Login_Pre_Production_Pom
{

	@FindBy(xpath="(//a[@href='https://preprod.mirafit.co.uk/customer/account/'])[2]") private WebElement profile;
	
	@FindBy(xpath="(//input[@class='input-text'])[2]") private WebElement UN;
	@FindBy (xpath="(//input[@class='input-text'])[3]") private WebElement PWD;
	@FindBy(xpath="//button[@class='action login primary']") private WebElement Loginbtn;
	@FindBy (xpath="(//div[@class='box-content'])[1]") private WebElement profilename;
	public Login_Pre_Production_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickprofile()
	{
		profile.click();
	}
	
	public void setLogin_PomUsername() throws EncryptedDocumentException, IOException
	{
//		UN.sendKeys("adb@mailinator.com");
		UN.sendKeys(Utility.getdata(0, 1));
	}
	
	public void setLogin_Pompassword() throws EncryptedDocumentException, IOException
	{
//		PWD.sendKeys("Galaxy@123");
		PWD.sendKeys(Utility.getdata(1, 1));
	}
	
	public void clickLogin_Pombtn() throws InterruptedException
	{
		Loginbtn.click();
		Thread.sleep(2000);
		String Name = profilename.getText();
		Reporter.log(Name, true);
		Reporter.log(" ", true);
		
		
	}
	
	
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		clickprofile();

		setLogin_PomUsername();
		
		setLogin_Pompassword();

		clickLogin_Pombtn();
	}
	
	
	
}

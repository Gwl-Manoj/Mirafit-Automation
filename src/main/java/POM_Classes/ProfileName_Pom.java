package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProfileName_Pom 
{

	@FindBy (xpath="(//div[@class='box-content'])/p") private WebElement profilename;
	
	
	
	public ProfileName_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Get_Profile_Name()
	{
		String Name = profilename.getText();
		String name="Manoj Sirsat";
		if(Name.contains(name))
		{
			Reporter.log("The Profile name is Verified", true);
			Reporter.log(" ", true);
		}
		else
		{
			Reporter.log("The Profile name is Not Verified", true);
			Reporter.log(" ", true);
		}
		Reporter.log("The Profile Name is as : "+Name, true);
		Reporter.log(" ", true);
		
	}
	
	
}

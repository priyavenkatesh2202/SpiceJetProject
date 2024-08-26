package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;


public class LoginInPage extends ProjectSpecificationMethods
{
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement mob;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	

	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement LogIn;

	
	
	@FindBy(xpath="//div[text()='Hi Priya']") WebElement verify;
	@FindBy(xpath="//div[text()='Invalid Username/Password']") WebElement verify2;
	
	
	
	public LoginInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 public LoginInPage enterPhNum(String number)
	 {
	        
	      mob.sendKeys(number);
	        return this;
	    }
	 public LoginInPage enterPwd(String p)
	 {
	        
	      pwd.sendKeys(p);
	        return this;
	    }
	 public LoginInPage cic()
	 {
		 LogIn.click();
		 
		 return this;
	 }
	 public LoginInPage verify() throws Exception
	 {
		 	String actualText = "Hi Priya";
			String expectedText = verify.getText();
			screenShot("validLoginIn");
			soft_assert(actualText, expectedText);
			return this;
	 }
	 
	 public LoginInPage verify2() throws Exception
	 {
		 	String actualText = "Hi Priya";
			String expectedText = verify2.getText();
			screenShot("InvalidLoginIn");
			soft_assert(actualText, expectedText);
			return this;
	 }
	 
	 
	
	
	
	
	
}



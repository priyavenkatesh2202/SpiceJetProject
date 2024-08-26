package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods {

	public static WebDriver driver;
	
	@FindBy(xpath="//div[contains(text(),'Signup')]")
	WebElement signUp;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']")
	WebElement loginn;
	
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public HomePage clickSign()
	{
		signUp.click();
		return this;
	}
		
	public HomePage clickLogin()
	{
		loginn.click();
		return this;
	}
	
	
	
	
	
	
	
	
}

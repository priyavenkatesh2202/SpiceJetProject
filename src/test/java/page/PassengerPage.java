package page;

import java.io.Console;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethods;

public class PassengerPage extends ProjectSpecificationMethods {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']") WebElement FirstName;
	
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']") WebElement lastName;
	
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']") WebElement PhNum;
	
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']") WebElement email;
	
	
	@FindBy(xpath="//div[text()='I am flying as the primary passenger']") WebElement checkBox;
	
	
	@FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']") WebElement pasName;
	
	@FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']") WebElement passName;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[9]") WebElement idCarNum;
	

	@FindBy(xpath="//div[@id='pax-item-MSFBRFQ-']") WebElement pass2;
	
	@FindBy(xpath="//div[text()='Mrs']") WebElement selectTitle;
	
	@FindBy(xpath="//input[@data-testid='traveller-1-first-traveller-info-input-box']") WebElement pass2Name;
	
	@FindBy(xpath="//input[@data-testid='traveller-1-last-traveller-info-input-box']") WebElement pass2LName;
	
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[9]") WebElement idcardNum2;

	
	
	
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']") WebElement continue1;
	

	@FindBy(id="at_addon_close_icon") WebElement DismisAlert;
	
	
	@FindBy(xpath="//div[normalize-space()='Investors']") WebElement findtxt;
	
	
	@FindBy(xpath="(//div[@data-testid='add-ons-continue-footer-button'])[3]") WebElement addOnPageConti;

	
	@FindBy(id="skipfrompopup") WebElement clickpop;
	
	@FindBy(xpath="//div[text()='Done']") WebElement clickdone;
	
	public PassengerPage (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public PassengerPage firstName(String name)
	{
		FirstName.sendKeys(name);
		return this;
	}
	
	public PassengerPage LastName(String nam)
	{
		lastName.sendKeys(nam);
		return this;
	}
	
	public PassengerPage phNum(String ph)
	{
		PhNum.sendKeys(ph);
		return this;
	}
	
	public PassengerPage email(String e)
	{
		email.sendKeys(e);
		return this;
	}
	public PassengerPage clickcheckBox()
	{
		checkBox.click();
		return this;
	}

	
	public PassengerPage studentID(String Num)
	{
		idCarNum.sendKeys(Num);
		return this;
	}
	
	public PassengerPage clickpas2()
	{
		pass2.click();
		return this;
	}
	
	public PassengerPage selectTitle()
	{
		Actions act = new Actions(driver);
		act.moveToElement(selectTitle).click().perform();
		return this;
	}
	
	public PassengerPage pass2Name (String F)
	{
		pass2Name.sendKeys(F);
		return this;
	}
	public PassengerPage pass2LName (String F)
	{
		pass2LName.sendKeys(F);
		return this;
	}
	public PassengerPage studentID2(String Num2)
	{
		idcardNum2.sendKeys(Num2);
		return this;
	}
	
	public PassengerPage CLContinue()
	{
		Actions Act = new Actions(driver);
		Act.moveToElement(continue1).click().perform();
		
		return this;
	}
	
	public PassengerPage DismisAlrt()
	{
//		Alert alert = driver.switchTo().alert();
//
//	   alert.dismiss();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(DismisAlert));	

		DismisAlert.click();
		return this;
	}
	
	public PassengerPage findtxt()
	{
		
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-poiln3 r-adyw6z r-1kfrs79'])[1]"));

		return this;
	}
	
	public PassengerPage addonPageConti()
	{
		//(//div[@data-testid='add-ons-continue-footer-button'])[3]

	    WebElement element = driver.findElement(By.xpath("(//div[@data-testid='add-ons-continue-footer-button'])[3]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	Actions act = new Actions(driver);
		act.moveToElement(addOnPageConti).click().perform();
// try {
//		addOnPageConti.click();
// }
// catch(Exception e)
// {
//	 e.printStackTrace();
// }
		return this;
	}
	
	public PassengerPage skipPop()
	{
		
		try {
			Actions act = new Actions(driver);
			act.moveToElement(clickpop).click().perform();
			  
			} catch (Exception e) {
			  e.printStackTrace();
			}
		
		return this;
	}
	
	public PassengerPage clickContinue()
	{
//		WebElement element = driver.findElement(By.xpath("(//div[@data-testid='add-ons-continue-footer-button'])[3]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//	
//		Actions act = new Actions(driver);
//		act.moveToElement(addOnPageConti).click().perform();
		
		try {
			addOnPageConti.click();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
		
		
	
	
	
		return this;
	}
	
	
	
	
	
	
}

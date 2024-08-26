package page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethods;

public class PaymentPage extends ProjectSpecificationMethods {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//div[text()='UPI']") WebElement clickUPI;
	
	@FindBy(xpath="//div[@data-testid='select-upiOptions-1']") WebElement option;
	
	@FindBy(xpath="//div[text()='GPay']") WebElement selectOpt;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")WebElement moreUpi;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[1]") WebElement upiID;
	
	@FindBy(xpath="//div[text()='Failed to verify VPA.']") WebElement verifyPayment;
	
	
	@FindBy(xpath="//div[text()='Proceed to pay']") WebElement Pay;
	
	
	public PaymentPage (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public PaymentPage clickUPI()
	
	{
		try
		{
			clickUPI.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return this;
	}
	
	
   public PaymentPage clickOpt()
	
	{
		option.click();
		return this;
	}
   public PaymentPage moreOpt()
	
  	{
  		moreUpi.click();
  		return this;
  	}
   
   public PaymentPage selectOpt()
	
 	{
	   Actions act = new Actions(driver);
		act.moveToElement(selectOpt).click().perform();
 		
 		return this;
 	}
	
	public PaymentPage enterUPIid(String cNum)
	{
		
		
		upiID.sendKeys(cNum);
		return this;
	}

	public PaymentPage clicPay()
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Pay).click().perform();

		
		return this;
	}
	
	public PaymentPage verify()throws Exception
    { 
      
		String actualText = "Failed to verify VPA.";
		String expectedText =  verifyPayment.getText();
		//screenShot("PaymentOneWay");
		soft_assert(actualText, expectedText);
		return this;
 		
	}
	public PaymentPage verify2()throws Exception
    { 

	 	String actualText = "Failed to verify VPA.";
		String expectedText =  verifyPayment.getText();
		//screenShot("Payment");
		soft_assert(actualText, expectedText);
		return this;
    }

}

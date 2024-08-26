package page;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethods;

public class FlightBooking extends ProjectSpecificationMethods{

	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[1]")
	WebElement fromm;
	
	@FindBy(xpath="(//div[contains(text(),'India')])[2]")
	WebElement SelectIndia;
	
	
	@FindBy(xpath="//div[text()='Bengaluru']")
	WebElement frmDes;
	
	
	@FindBy(xpath="//div[text()='Mumbai']")
	WebElement to;
	

	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[1]")
	WebElement Date;
	
	@FindBy(xpath="(//div[text()='26'])[6]")
	WebElement clickDepatureDate;
	

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement SelectPassengerClick;
	
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement IncrementAdultPas;
	

	@FindBy(xpath="//div[text()='INR']")
	WebElement SelectCurrency;
	
	
	@FindBy(xpath="//div[text()='Students']") WebElement family;
	
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement SearchFlight;
	
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']") WebElement clickcheckbox;
	
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']") WebElement clickContinue;
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement ContinueBooking;
	
	@FindBy(xpath="//div[text()='DISMISS']") WebElement dismiss;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73 r-1wgg2b2 r-1wn9b5e']")
	WebElement ContiBooking2;
	
	
	
	
	
	
	
	private WebDriver driver;
	
	public FlightBooking(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public FlightBooking ClicFrom()
	{
	fromm.click();
	return this;
	}
	

	public FlightBooking SelectIndia()
	{
		SelectIndia.click();
		return this;
		
	}
	
	public FlightBooking SelectFrom()
	{
		Actions act = new Actions(driver);
		act.moveToElement(frmDes).click().perform();
		return this;
		
	}
	
	public FlightBooking SelectTo()
	{
		Actions act = new Actions(driver);
		act.moveToElement(to).click().perform();
		return this;
	}
	public FlightBooking ClicDate()
	{
	Date.click();
	return this;
	}
	public FlightBooking ClicDepDate()
	{
	clickDepatureDate.click();
	return this;
	}
	public FlightBooking Clicpassenger()
	{
	SelectPassengerClick.click();
	return this;
	}
	public FlightBooking IncPassanger()
	{
	IncrementAdultPas.click();
	return this;
	}
	public FlightBooking ClicCurrency()
	{
	Actions act = new Actions(driver);
	act.moveToElement(SelectCurrency).click().perform();
	return this;
	}
	
	public FlightBooking clicFamily()
	{
		family.click();
		return this;
	}
	public FlightBooking searchFlight()
	{
		try {
		 SearchFlight.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return this;
	}
	public FlightBooking clickCheqBox()
	{
		clickcheckbox.click();
		return this;
	}
	
	public FlightBooking clickConti()
	{
		clickContinue.click();
		return this;
	}
	public FlightBooking clickDismiss()
	{
		dismiss.click();
		return this;
	}
	
	public FlightBooking conti()
	{
		ContinueBooking.click();
		return this;
	}
	
	
  	
}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class RoundBooking extends ProjectSpecificationMethods
{
	@FindBy(xpath="//div[text()='round trip']") WebElement roundTrip;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[1]")
	WebElement fromm;
	
	@FindBy(xpath="(//div[contains(text(),'India')])[2]")
	WebElement SelectIndia;
	
	
	@FindBy(xpath="//div[text()='Ahmedabad']")
	WebElement frmDes;
	
	
	@FindBy(xpath="//div[text()='Delhi']")
	WebElement to;
	
	
	
	@FindBy(xpath="(//div[text()='22'])[2]")
	WebElement clickDepatureDate;
	
	
	
	@FindBy(xpath="//div[text()='Select Date']")
	WebElement Date;

	@FindBy(xpath="(//div[text()='1'])[5]")
	WebElement clickReturnDate;	
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement SelectPassengerClick;
	
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement IncrementAdultPas;
	

	@FindBy(xpath="//div[text()='INR']")
	WebElement SelectCurrency;
	
	
	@FindBy(xpath="//div[text()='Students']") WebElement student;
	
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement SearchFlight;
	
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']") WebElement clickcheckbox;
	
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']") WebElement clickContinue;
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement ContinueBooking;
	
	@FindBy(xpath="//div[text()='DISMISS']") WebElement dismiss;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73 r-1wgg2b2 r-1wn9b5e']")
	WebElement ContiBooking2;
	
	
	
	
	
	
	
	private WebDriver driver;
	
	public RoundBooking(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public RoundBooking ClickRoundWay()
	{
	roundTrip.click();
	return this;
	}
	
	
	
	
	public RoundBooking ClicFrom()
	{
	fromm.click();
	return this;
	}
	

	public RoundBooking SelectIndia()
	{
		SelectIndia.click();
		return this;
		
	}
	
	public RoundBooking SelectFrom()
	{
		Actions act = new Actions(driver);
		act.moveToElement(frmDes).click().perform();
		return this;
		
	}
	
	public RoundBooking SelectTo()
	{
		Actions act = new Actions(driver);
		act.moveToElement(to).click().perform();
		return this;
	}
	
	public RoundBooking ClicDepDate()
	{
	clickDepatureDate.click();
	return this;
	}
	public RoundBooking ClicDate()
	{
		Actions act= new Actions(driver);
		act.moveToElement(Date).click().perform();
		Date.click();
		return this;
	}
	public RoundBooking ClicReturnDate()
	{
	clickReturnDate.click();
	return this;
	}
	
	public RoundBooking Clicpassenger()
	{
	SelectPassengerClick.click();
	return this;
	}
	public RoundBooking IncPassanger()
	{
	IncrementAdultPas.click();
	return this;
	}
	public RoundBooking ClicCurrency()
	{
	Actions act = new Actions(driver);
	act.moveToElement(SelectCurrency).click().perform();
	return this;
	}
	
	public RoundBooking clicStudent()
	{
		student.click();
		return this;
	}
	public RoundBooking searchFlight()
	{
		Actions act = new Actions(driver);
		act.moveToElement(SearchFlight).click().perform();
		// SearchFlight.click();
		 return this;
	}
	public RoundBooking clickCheqBox()
	{
		clickcheckbox.click();
		return this;
	}
	
	public RoundBooking clickConti()
	{
		clickContinue.click();
		return this;
	}

	
	public RoundBooking conti()
	{
		ContinueBooking.click();
		return this;
	}
}


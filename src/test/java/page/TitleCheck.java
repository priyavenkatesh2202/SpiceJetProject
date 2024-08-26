package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class TitleCheck extends ProjectSpecificationMethods{
	
	
	@FindBy(xpath="//div[text()='check-in']") WebElement checkIn;
	
	@FindBy(xpath="//div[text()='Web Check-In']") WebElement verifyCheckin;
	
	@FindBy(xpath="//div[text()='flight status']") WebElement Fstatus;

	@FindBy(xpath="//div[text()='Get up-to-date flight status.']") WebElement verifyFStatus;
	
	@FindBy(xpath="//div[text()='manage booking']") WebElement ManageBooking;

	@FindBy(xpath="//div[text()='View / Manage Booking']") WebElement verifyManageBok;
	 public TitleCheck(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	 
	public TitleCheck  clickCheckIn()
	{
		checkIn.click();
		return this;
	}
	
	public TitleCheck verify()throws Exception
    { 
      
 		
 		String txt = verifyCheckin.getText();
 		System.out.println(txt);
 		
 		screenShot("ValidateCheckIn");
		
 		return this;
	}

	
	public TitleCheck  clickFStatus()
	{
		Fstatus.click();
		return this;
	}
	public TitleCheck verify2()throws Exception
    { 
      
 		
 		String txt = verifyFStatus.getText();
 		System.out.println(txt);
 		
 		screenShot("ValidateFlightStatus");
		
 		return this;
	}
	public TitleCheck  clickmanageBooking()
	{
		ManageBooking.click();
		return this;
	}
	public TitleCheck verify3()throws Exception
    { 
      
 		
 		String txt = verifyManageBok.getText();
 		System.out.println(txt);
 		
 		screenShot("ValidateBooking");
		
 		return this;
	}
}

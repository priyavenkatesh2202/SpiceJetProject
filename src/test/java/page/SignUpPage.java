package page;

import java.awt.Checkbox;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethods;


public class SignUpPage extends ProjectSpecificationMethods{

	



	public void switchToNewWindow() 
	{
	    String winHandleBefore = driver.getWindowHandle();
	    for(String winHandle : driver.getWindowHandles())
	    {
	        if(!winHandle.equals(winHandleBefore))
	        {
	            driver.switchTo().window(winHandle);
	            break;
	        }
	    }
	}
	
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement title;
	
	
	@FindBy(xpath="//option[text()='Ms']") WebElement clickMS;


	@FindBy(id="first_name")
	WebElement firstName;
	
	
	@FindBy(id="last_name")
	WebElement lastName;
	
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(id="dobDate")
	WebElement dOB;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement year;
	
	@FindBy(xpath="//option[text()='1997']") WebElement yr;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement month;
	
	@FindBy(xpath="//option[text()='July']") WebElement mon;
	
	
	@FindBy(xpath="//div[text()='11']")WebElement date;
	
	@FindBy(xpath="//input[@placeholder='+91 01234 56789']")
	WebElement number;
	
	@FindBy(id="email_id")
	WebElement emailId;
	
	@FindBy(id="new-password")
	WebElement paswrd;
	
	@FindBy(id="c-password")
	WebElement cPaswrd;
	
	@FindBy(id="defaultCheck1")
	WebElement check;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement submit;
	
	
	@FindBy(xpath="//div[text()='Member account exists with given mobile number']") WebElement verify;
	
	
	@FindBy(xpath="//div[text()='Please enter valid mobile number']") WebElement verify2;
	
	public SignUpPage (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public SignUpPage clicTitle()
	{
		title.click();
		try {
			
		
		clickMS.click();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return this;
	}
	
	public SignUpPage clicTitleMs()
	{
		Actions act = new Actions(driver);
		act.moveToElement(clickMS).click().perform();
		return this;
	}
	
	 public SignUpPage Fname(String Fname)
	 {
	        
	      firstName.sendKeys(Fname);
	        return this;
	    }
	 
	 public SignUpPage Lname(String Lname)
	 {
	        
	      lastName.sendKeys(Lname);
	        return this;
	    }
	 

	public SignUpPage num(String  numb)
	 {
	        
	      number.sendKeys(numb);
	        return this;
	    }
	
	 
	 public SignUpPage emailid(String email)
	 {
	        
	      emailId.sendKeys( email);
	        return this;
	    }
	 
	 public SignUpPage password( String pass) 
	 {
		paswrd.sendKeys(pass);
		return this;
		
	}
	 
	 public SignUpPage cpassword( String passw) 
	 {
		cPaswrd.sendKeys(passw);
		return this;
		
	}
	 public SignUpPage clicDob()
		{
		 try {
			 Actions at = new Actions(driver);
			 at.moveToElement(dOB).click().perform();
			
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
			
			return this;
		}
	 
	 public SignUpPage clicYear()
		{
		try {
			year.click();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		
		try {
			yr.click();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			return this;
		}
	 
	 
	 public SignUpPage clicMonth()
		{
		 try {
				month.click();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			
			
			try {
				mon.click();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}


			return this;
		}
	 
	 public SignUpPage selectDate()
	 {
		 date.click();
		 return this;
	 }
	 
	 
	 
	 public SignUpPage checkCheckbox() 
	  {
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(check).click().perform();
		   
		    return this;
		}
	 
	 public SignUpPage sub()
	 {
		 Actions act = new Actions(driver);
		 act.moveToElement(submit).click().perform();
		
		return this;
	 }

	 public SignUpPage verify() throws Exception
	 {
		 	String actualText = "Member account exists with given mobile number";
			String expectedText = verify.getText();
			screenShot("validSignUp");
			soft_assert(actualText, expectedText);
			return this;
	 }
	 
	 public SignUpPage verify2() throws Exception
	 {
		 	String actualText = "Member account exists with given mobile number";
			String expectedText = verify2.getText();
			screenShot("InvalidSignUp");
			soft_assert(actualText, expectedText);
			return this;
	 }
	
	 
	
}


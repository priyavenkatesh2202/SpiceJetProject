package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.HomePage;
import page.SignUpPage;

public class SignUpTC_002 extends ProjectSpecificationMethods{
@Test
	public  void  signUpInvalid() throws Exception
	{
		// TODO Auto-generated method stub
		SignUpPage obj = new SignUpPage(driver);
		HomePage ob = new HomePage(driver);
		
		 ob.clickSign();
		obj.switchToNewWindow();
		obj.clicTitle()
		.Fname("Priya").Lname("Venkat").clicDob().clicYear().clicMonth().selectDate();
		obj.num("95667").emailid("priyavenk123@gmail.com")
		.password("Abc@12345678").cpassword("Abc@12345678").checkCheckbox().sub().verify2();

	}

	}



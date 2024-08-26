package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.HomePage;
import page.LoginInPage;

public class LogInTC_002 extends ProjectSpecificationMethods {
@Test
	public  void LogTeInvalid() throws Exception {
		HomePage obj1= new HomePage(driver);
		LoginInPage obj2= new LoginInPage(driver);

			obj1.clickLogin();
			obj2.enterPhNum("9566732450");
			obj2.enterPwd("Priya@113");
			obj2.cic().verify2();
			

	}

}

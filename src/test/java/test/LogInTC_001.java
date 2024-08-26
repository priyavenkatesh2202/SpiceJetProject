package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.HomePage;
import page.LoginInPage;

public class LogInTC_001  extends ProjectSpecificationMethods {
	
@Test
	public  void  LogTe() throws Exception{
		// TODO Auto-generated method stub
HomePage obj1= new HomePage(driver);
LoginInPage obj2= new LoginInPage(driver);

	obj1.clickLogin();
	obj2.enterPhNum("9566700270");
	obj2.enterPwd("Priya@143");
	obj2.cic().verify();
	
	
	


	}

}

package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.TitleCheck;

public class VerifyTitle extends ProjectSpecificationMethods{
@Test
	public void verifyTitle() throws Exception
	{
		
		TitleCheck ob = new TitleCheck(driver);
		
		ob.clickCheckIn().verify().clickFStatus().verify2().clickmanageBooking().verify3();
		
	}

}

package base;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass{
	
	@Parameters({"Url","browser"})
	@BeforeMethod
	public void launchingBrowser(String Url , String browser)
	{
		browserLaunch(Url,browser);
	}
	
	@AfterMethod
	public void closingBrowser()
	{
		browserClose();
	}

}

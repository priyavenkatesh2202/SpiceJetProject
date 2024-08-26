package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class UtilityClass {

	
	public static WebDriver driver;
	
//	public static Properties prop;
	
	@Parameters({"Url","browser"})
	
	
	public void browserLaunch(String Url, String browser) 
	
	{ 		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			
		
	    driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}

	public void browserClose()
	{
		driver.close();
	}
	
public String screenShot(String name) throws IOException {
//	C:\\Users\\HP\\eclipse-workspace\\ProjectSpiceJets\\snapp\\"+name+".png
//	C:\Users\HP\eclipse-workspace\ProjectSpiceJet\snapp
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\eclipse-workspace\\ProjectSpiceJet\\snapp\\"+name+".png");
		FileUtils.copyFile(src, dest);
		return name;
	}
	
	public void soft_assert(String actualText,String expectedText) 
	{
	SoftAssert obj = new SoftAssert();
	obj.assertEquals(actualText,expectedText);
	obj.assertAll();
	}
}

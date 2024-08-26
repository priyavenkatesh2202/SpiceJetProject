package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReportSpiceJet {
	
	
	public static ExtentReports getReport() {
		
		
		
		String path="C:\\Users\\HP\\eclipse-workspace\\ProjectSpiceJet\\report\\SpiceJetReport.html";
		
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("SpiceJet Reporter");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
	}

}

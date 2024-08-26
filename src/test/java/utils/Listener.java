package utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import base.ProjectSpecificationMethods;

public class Listener  extends ProjectSpecificationMethods implements ITestListener{
	
	ExtentTest test;
	ExtentReports extent = ExtendsReportSpiceJet.getReport();

	@Override
	public void onTestStart(ITestResult result) {
		
		
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		test.fail(result.getThrowable());
		
		String filepath = null;
		try {
			filepath = screenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test skipped");
	}


	@Override
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
	
	
}

package com.crm.justdial.genericutility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener{

	ExtentReports report;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		//Create test name in report
		
		test = report.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		//Log for pass test method
			test.log(Status.PASS, result.getMethod().getMethodName()+" is passed");
	}

	
	public void onTestFailure(ITestResult result) {
				
		//Capture Method Name
		String methodName=result.getMethod().getMethodName();
		
		test.log(Status.FAIL, result.getMethod().getMethodName()+" is failed");
		test.log(Status.FAIL, result.getThrowable());

		//Capture Current Date
		String currentdate= new JavaUtility().dateInFormatDDMMMYYYY();
		
		//Concatenate For ScreenShot Name
		String screenshotName=methodName+"_"+currentdate;
		
		try {
			new WebDriverUtility().takesScreenshot(BaseClass.sdriver, screenshotName);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	
	public void onTestSkipped(ITestResult result) {
		//log for skipped methods
				test.log(Status.SKIP, result.getMethod().getMethodName()+" is skipped");
				test.log(Status.SKIP, result.getThrowable());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onStart(ITestContext context) {
		//Report configuration
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./ExtentReport.html");
		spark.config().setDocumentTitle("JustDial Web App");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Automation Execution report"); 
		
		//Attaching the configuration to extent report and also System info
		report=new ExtentReports();
		report.attachReporter(spark);
	
		//Write system info
		FileUtility fLib = new FileUtility();
		report.setSystemInfo("OS", System.getProperty("os.name"));
		report.setSystemInfo("Platform", "WINDOWS");
		report.setSystemInfo("Reporter Name", "Amitabha");
		try {
			report.setSystemInfo("url",  fLib.propertyKeyValue("url"));
		} catch (Throwable e) {

			e.printStackTrace();
		}
	
	}

	
	
	public void onFinish(ITestContext context) {
		//Flush report
			report.flush();
		
	}
	
}

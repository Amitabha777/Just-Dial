package com.crm.justdial.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * 
 * @author AMITABHA
 *
 */

public class BaseClass {

	//Objects of Utility Classes

	public DataBaseUtility dLib= new DataBaseUtility();
	public FileUtility fLib= new FileUtility();
	public WebDriverUtility wLib= new WebDriverUtility();
	public JavaUtility jLib = new JavaUtility();
	
	
	//Declaring Object of WebDriver
	
	public WebDriver driver=null;
	public static WebDriver sdriver;
	
	@BeforeSuite
	public void dbConnectionOpen()
	{
		dLib.databaseOpen();
		Reporter.log("Database Connection is Successful",true);
	}
	
	@AfterSuite
	public void dbConnectionClose()
	{
		dLib.databaseClose();
		Reporter.log("Database Connection is Closed",true);
	}
	
	@BeforeTest
	public void openBrowser() throws IOException
	{
		Reporter.log("Before Test Running",true);
	
	}
	
	@AfterTest
	public void closeBrowser()
	{
		//driver.quit();
		Reporter.log("Browser Closed Successfully",true);
	}
	
	@BeforeClass
	public void openUrl() throws IOException
	{
		String browser=fLib.propertyKeyValue("webBrowser");
		driver=wLib.crossBrowserHandling(browser);
		
		sdriver=driver;
		
		Reporter.log("Browser Opened Successfully",true);
		
		String url=fLib.propertyKeyValue("url");
		driver.get(url);
		wLib.deleteCookies(driver);							//Delete All Cookies
		wLib.maximize(driver);								//Maximize
		wLib.implicitWait(driver);							//Implicit Wait
		
		Reporter.log("URL Opened Successfully",true);
	}
	
	@AfterClass
	public void closeUrl()
	{
		//driver.close();
		Reporter.log("URL Closed Successfully",true);
	}
	
	@BeforeMethod
	public void login()
	{
		//In Production Environment Login can't happen due to OTP
		Reporter.log("Login Skipped Successfully",true);
	}
	
	
	@AfterMethod
	public void logoff()
	{
		//In Production Environment LogOff can't Happen as Login didn't happen
		Reporter.log("LogOff Skipped Successfully",true);
	}
	
	
	
	
}

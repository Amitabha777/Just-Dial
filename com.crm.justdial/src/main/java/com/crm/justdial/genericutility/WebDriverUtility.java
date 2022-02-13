package com.crm.justdial.genericutility;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

/**
 * 
 * @author AMITABHA
 *
 */

public class WebDriverUtility {

	/**
	 * To Maximize The Browser
	 * @param driver
	 */
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	/**
	 * For Implicit Wait
	 * @param driver
	 */
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	
	/**
	 * To Handle Cross-Browser Executions
	 */
	public WebDriver crossBrowserHandling(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		}
	}
	
	
	/**
	 * Delete All Cookies																		//OverLoaded
	 */
	public void deleteCookies(WebDriver driver)
	{
		driver.manage().deleteAllCookies();
	}
	
	
	/**
	 * Delete Specific Cookie																	//OverLoaded
	 */
	public void deleteCookies(WebDriver driver, String cookieName)
	{
		driver.manage().deleteCookieNamed(cookieName);
	}
	
	
	/**
	 * Handle Explicit Wait
	 */
	public WebDriverWait ExplicitWait(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		return wait;
		
	}

	
	/**
	 * Mouse Over Actions															//OverLoaded
	 */
	public void moveMouseToElement(WebDriver driver, WebElement element)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	
	/**
	 * Mouse Over Actions By Specifying Cordinates									//OverLoaded
	 * @param driver
	 * @param element
	 * @param xCordinate
	 * @param yCordinate
	 */
	public void moveMouseToElement(WebDriver driver, WebElement element, int xCordinate, int yCordinate)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element,xCordinate,yCordinate).perform();
	}
	
	
	/**
	 * Mouse Over To Element then Perform Click Action								//Overloaded
	 * @param element
	 * @param driver
	 */
	public void moveMouseToElement(WebElement element,WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}
	
	/**
	 * To Switch to the Desired Window or Tab
	 * @param driver
	 * @param allIds
	 * @param requiredWindowTitle
	 */
	public void handleWindowsOrTabs(WebDriver driver, Set<String> allIds, String requiredWindowTitle)
	{
		Iterator<String> it=allIds.iterator();
		
		while(it.hasNext())
		{
			String currentId=it.next();
			driver.switchTo().window(currentId);
			if(currentId.contains(requiredWindowTitle))
			{
				break;
			}
		}
	}
	
	
	/**
	 * To Handle Any Auto-Suggestion By Providing the Xpath as String		(By EqualsIgnoreCase)
	 * @param driver
	 * @param xpath
	 * @param location
	 */
	public void autoSuggestionHandling(WebDriver driver, String xpath, String location)
	{
		List<WebElement> lst= driver.findElements(By.xpath(xpath));
		
		for(WebElement wb:lst)
		{
			String loc=wb.getText();
			System.out.println(loc);
			
			if(loc.equalsIgnoreCase(location))
			{
				wb.click();
			}
		}
	}
	
	/**
	 * To Handle Any Auto-Suggestion By Providing the Xpath as String		(By .contains)
	 * @param text
	 * @param driver
	 * @param xpath
	 */
	public void autoSuggestionHandling(String text, WebDriver driver, String xpath )
	{
		List<WebElement> lst= driver.findElements(By.xpath(xpath));
		
		for(WebElement wb:lst)
		{
			String txt=wb.getText();
			System.out.println(txt);
			
			if(txt.contains(text))
			{
				wb.click();
			}
		}
	}
	
	/**
	 * Handle DropDowns Of Select Class By 'selectByVisibleText'				//OverLoaded
	 * @param element
	 * @param text
	 */
	public void handleDropDownsBySelect(WebElement element,String visibleText)
	{
		Select s= new Select(element);
		s.selectByVisibleText(visibleText);
		
	}
	
	
	/**
	 * Handle DropDowns Of Select Class By 'selectByValue'						//OverLoaded
	 * @param text
	 * @param element
	 */
	public void handleDropDownsBySelect(String value,WebElement element)
	{
		Select s= new Select(element);
		s.selectByValue(value);
		
	}
	
	
	/**
	 * Get All The Options Present in Select Class Drop Down					//OverLoaded
	 * @param element
	 * @return
	 */
	public List<WebElement> handleDropDownsBySelect(WebElement element)
	{
		Select s= new Select(element);
		return s.getOptions();
		
	}

	public void handleDropDownOrMultipleElements(List<WebElement> lst, String text)
	{
		
		for(WebElement wb: lst)
		{
			String st=wb.getText();
			System.out.println(st);
			
			if(st.equalsIgnoreCase(text))
			{
				
				wb.click();
				
			}
		}
		
	}
}

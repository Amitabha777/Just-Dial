package com.crm.justdial.automobiletest;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.justdial.genericutility.BaseClass;
import com.crm.justdial.objectrepository.AutomobilePage;
import com.crm.justdial.objectrepository.HomePage;
import com.crm.justdial.objectrepository.NewCarsPage;
/**
 * 
 * @author AMITABHA
 *
 */

public class SelectAutomobileTest extends BaseClass{

	@Test
	public void TC_01Test() throws InterruptedException
	{
		
		//Objects of POM Classes
		HomePage homePage = new HomePage(driver);
		AutomobilePage automobilePage= new AutomobilePage(driver);
		NewCarsPage newCarsPage= new NewCarsPage(driver);
		
		
		//Going Into Automobile
		homePage.clickOnAutomobileLnk();
		Reporter.log("Entered into Automobile Link",true);
		
		
		//Going Into NewCars
		automobilePage.clickOnNewCars();
		Reporter.log("Entered into NewCars Link",true);
		
		
		//Clicking on Price Range Rs 1000000 to Rs 2000000
		newCarsPage.selectRange(1850000);
		Reporter.log("Clicked on Rs 1000000 to Rs 2000000 Price Range",true);
		
		
		//Handling Stale Element Exception By Try Catch Block
		
		try {
		
		//Click on Brand Mahindra
		newCarsPage.selectBrand("mahindra");
		}
		catch(StaleElementReferenceException e)
		{
			newCarsPage.selectBrand("mahindra");
		}
		Reporter.log("Mahindra Brand is Selected",true);
		
		
		try {
		//Clicking on Mahindra XUV700
		driver.findElement(By.xpath("//span[text()='Mahindra XUV700 MX BS6 - Diesel (Bl...']")).click();
		}
		catch(StaleElementReferenceException e)
		{
			driver.findElement(By.xpath("//span[text()='Mahindra XUV700 MX BS6 - Diesel (Bl...']")).click();
		}
		
		Reporter.log("Mahindra XUV700 got selected",true);
		
		
		//Clicking on Add To Compare Button
		driver.findElement(By.xpath("//span[text()='Add to Compare']")).click();
		Reporter.log("Add to compare Button got clicked",true);
		
		
		//Going Back by pressing Browser Back Button
		driver.navigate().back();
		Reporter.log("Went Back to previous Page That is: New Cars Page",true);
		
		
		//Clicking On Mahindra Thar
		driver.findElement(By.xpath("//span[text()='Mahindra Thar 2020 AX Std 6-Seater ...']")).click();
		Reporter.log("Mahindra Thar got Selected",true);
		
		
		//Clicking on Add To Compare Button
		driver.findElement(By.xpath("//span[text()='Add to Compare']")).click();
		Reporter.log("Add to compare Button got clicked",true);
		
		
		//Click on Below Compare button
		driver.findElement(By.xpath("//b[text()='COMPARE']")).click();
		Reporter.log("Compare Button at the Below got clicked",true);
		
		
		//Getting Price of XUV700
		String XUV=driver.findElement(By.xpath("//table[@class='bordered-table compare-table']/tbody/tr[1]/td[2]")).getText();
		Reporter.log("XUV Price= "+XUV,true);
		
		
		//Getting Price of Thar
		String Thar=driver.findElement(By.xpath("//table[@class='bordered-table compare-table']/tbody/tr[1]/td[3]")).getText();
		Reporter.log("Thar Price= "+Thar,true);
		
	}
}

package com.crm.justdial.chemisttest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.justdial.genericutility.BaseClass;
import com.crm.justdial.objectrepository.ChemistsPage;
import com.crm.justdial.objectrepository.HomePage;

public class ChooseChemist extends BaseClass{

	@Test
	public void chemist_TC_004() throws InterruptedException
	{
		//Objects Of POM Classes
		HomePage homePage= new HomePage(driver);
		ChemistsPage chemistsPage= new ChemistsPage(driver);
		
	
		//Click on Chemists Module
		homePage.clickOnChemists();
		
		//Click on Distance DropDown
		chemistsPage.clickOnDistance();
		
		//Select Location as BTM Layout
		chemistsPage.enterLocation("BTM layout",driver);
		
		//chemistsPage.selectDistance();
		
//		List<WebElement> lst=driver.findElements(By.xpath("//a[contains(@id,'dst')]"));
//		
//		
//		for(WebElement wb: lst)
//		{
//			String dis=wb.getAttribute("id");
//			System.out.println(dis);
//			
//			if(dis.contains("dst3"))
//			{
//				try {
//							
//				wb.click();
//				}
//				catch(StaleElementReferenceException e)
//				{
//					wb.click();
//				}
//			}
//		}
		
		WebElement dis=driver.findElement(By.xpath("//a[.='3 km']"));
		try {
			dis.click();
		}
		catch(StaleElementReferenceException e)
		{
			
			WebElement dis1=driver.findElement(By.xpath("//a[.='3 km']"));
			dis1.click();
		}
		
//		Actions ac = new Actions(driver);
//				{
//			ac.moveToElement(ele).click().build().perform();
//				}
//		
//		WebElement ele=driver.findElement(By.id("dst5"));
//		ele.click();
		
	}
}

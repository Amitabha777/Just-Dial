package com.crm.restaurant.headingtest;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.justdial.genericutility.BaseClass;
import com.crm.justdial.objectrepository.BookTablePage;
import com.crm.justdial.objectrepository.HomePage;
import com.crm.justdial.objectrepository.RestaurantsPage;

public class BookDiner extends BaseClass{

	
	@Test
	public void diner_TC_04()
	{
		
	
	//Objects Of POM Class
	HomePage homePage= new HomePage(driver);
	//RestaurantsPage restaurantsPage= new RestaurantsPage(driver);
	BookTablePage bookTablePage= new BookTablePage(driver);
	
	
	//Click on Restaurant Header in JustDial Site Body
	homePage.clickOnRestaurantHeader();
	
	
	driver.findElement(By.xpath("//h4[text()=' Book a Table']")).click();
	
	
	
	//Click On Book A Table
	//restaurantsPage.clickOnBookATable();
	
	//Click on Book A Table of Copacabana Pub
	bookTablePage.clickOnBookOrderOfCopacabanaPub();

////	String mainId=driver.getWindowHandle();
////	
////	Set<String> allIds=driver.getWindowHandles();
////	
////	wLib.handleWindowsOrTabs(driver, allIds, "eazydiner");
////	
////	System.out.println(driver.getTitle());
//	
//	//Alert alt=driver.switchTo().alert();
//	
//	//alt.accept();
//	
//	//System.out.println(driver.getCurrentUrl());
//	
//	
//	//driver.findElement(By.xpath("//input[@aria-label='Use the arrow keys to pick a date']")).click();
//	
//	//driver.findElement(By.xpath("//span[@class='text-blue pointer review_tab']")).click();
//	
//	//driver.findElement(By.xpath("//span[.='Login']")).click();
	}
}

package com.crm.justdial.airticketstest;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.justdial.genericutility.BaseClass;
import com.crm.justdial.objectrepository.HomePage;

public class BookTicket extends BaseClass{

	@Test
	public void Bookticket_TC_07()
	{
		
		//Objects Of POM Class
		HomePage homePage= new HomePage(driver);
		
		
		//Click on AirTickets Module
		homePage.clickOnAirTickets();
		
		//Click On Departure
		WebElement departurePlace= driver.findElement(By.cssSelector("[placeholder='Type Departure City']"));
		
		departurePlace.click();
		
		//Clear the Departure Text Box 
		departurePlace.clear();
		
		//Write Kolkata in the Box
		departurePlace.sendKeys("Kolkata");
		
		//Select The Kolkata Airport From Auto Suggestions
		wLib.autoSuggestionHandling("Kolkata",driver,"//ul[contains(@class,'jsx-') and contains(@class,'flgtagst')]/li");
		
		//Click On Destination Text Box
		WebElement destination=driver.findElement(By.xpath("//input[@placeholder='Type Destination City']"));
		
		try {
		destination.click();
		
		//Clear The Destination Field
				destination.clear();
				
				//Send Destination as Delhi
				destination.sendKeys("Delhi");
				
				//Select The Delhi Airport From Auto Suggestions
				wLib.autoSuggestionHandling("Delhi",driver,"//ul[contains(@class,'jsx-') and contains(@class,'flgtagst')]/li");
				
		}
		catch(StaleElementReferenceException e)
		{
			destination=driver.findElement(By.xpath("//input[@placeholder='Type Destination City']"));
		
			destination.click();
			
		//Clear The Destination Field
		destination.clear();
		
		//Send Destination as Delhi
		destination.sendKeys("Delhi");
		
		//Select The Delhi Airport From Auto Suggestions
		wLib.autoSuggestionHandling("Delhi",driver,"//ul[contains(@class,'jsx-') and contains(@class,'flgtagst')]/li");
		}
		
		
		//Clicking on Date 
		WebElement date=driver.findElement(By.xpath("//input[@placeholder='Select Date']"));
		
		try {
				date.click();
		}
		catch(StaleElementReferenceException e)
		{
			date=driver.findElement(By.xpath("//input[@placeholder='Select Date']"));
			date.click();
		}
		
		
		//Choosing date as March 15, 2022
		
		WebElement boardingDate= driver.findElement(By.xpath("//div[@id='dvcalendar']/div/div/div/div[text()='Mar 2022']/../following-sibling::div[contains(@class,' days')]/ul/li[text()='15']"));
		
		try {
		boardingDate.click();
		}
		catch(StaleElementReferenceException e)
		{
			boardingDate=driver.findElement(By.xpath("//div[@id='dvcalendar']/div/div/div/div[text()='Mar 2022']/../following-sibling::div[contains(@class,' days')]/ul/li[text()='15']"));
			boardingDate.click();
		}
		
		
		//Increasing Adults count to 2
		WebElement adultsadd=driver.findElement(By.xpath("//div[.='Adult 12+']/../div/span[.='+']"));
		
		try {
			adultsadd.click();
		}
		catch(StaleElementReferenceException e)
		{
			adultsadd=driver.findElement(By.xpath("//div[.='Adult 12+']/../div/span[.='+']"));
			adultsadd.click();
		}
		
		//Clicking on Search Button
		driver.findElement(By.cssSelector("[value='SEARCH']")).click();
		
		
	}
}

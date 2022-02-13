package com.crm.justdial.objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.justdial.genericutility.WebDriverUtility;

public class ChemistsPage extends WebDriverUtility{

	//Locators
			@FindBy(xpath="//span[text()='Distance ']")
			private WebElement distanceDropDown;
			
			@FindBy(xpath="//input[@id='sortbydist']")
			private WebElement locationBox;
			
			@FindBy(xpath="//a[.='3 km']")
			private WebElement km3Lnk;
			
			//Constructor
			public ChemistsPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

			//Getters
			public WebElement getDistanceDropDown() {
				return distanceDropDown;
			}
			
			
			public WebElement getLocationBox() {
				return locationBox;
			}
			
			
			public WebElement getKm3Lnk() {
				return km3Lnk;
			}

			
			//Business Libraries
			public void clickOnDistance()
			{
				distanceDropDown.click();
			}
			
			public void enterLocation(String location, WebDriver driver)
			{
				locationBox.sendKeys(location);
				
				autoSuggestionHandling(driver, "//span[@id='sbd']/ul/li", location);
			}

			public void selectDistance()
			{
				km3Lnk.click();
			}
			
}

package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomobilePage {

	//Locate Web Elements & Declare them as Private
	@FindBy(xpath = "(//span[@title='New Cars'])[1]")
	private WebElement newCarsLnk;
	
	
	//Initializing using Constructors
	public AutomobilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Generating Getters Method
	
	public WebElement getNewCarsLnk() {
		return newCarsLnk;
	}
	
	
	//Business Libraries
	
	public void clickOnNewCars()
	{
		newCarsLnk.click();
	}
}

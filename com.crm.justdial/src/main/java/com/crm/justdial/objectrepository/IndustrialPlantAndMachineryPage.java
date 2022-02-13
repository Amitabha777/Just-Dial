package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndustrialPlantAndMachineryPage {

	//Locators
	@FindBy(xpath="//a[text()='Furnaces']")
	private WebElement furnaces;
	
	//Constructor
	public IndustrialPlantAndMachineryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Getters Methods
	public WebElement getFurnaces() {
		return furnaces;
	}
	
	
	//Business Libraries
	public void clickOnFurnaceLnk()
	{
		furnaces.click();
	}
	
	
}

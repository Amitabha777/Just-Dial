package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B2BPage {

	//Locate the Elements & Declare them as Private
	@FindBy(xpath="//div[text()='Industrial Plants & Machinery']")
	private WebElement indusLnk;
	
	
	//Initializing using Constructor
	public B2BPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Generating Getters Methods
	
	public WebElement getIndusLnk() {
		return indusLnk;
	}
	
	
	//Business Libraries
	
	public void clickOnIndustriesAndPlants()
	{
		indusLnk.click();
	}
}

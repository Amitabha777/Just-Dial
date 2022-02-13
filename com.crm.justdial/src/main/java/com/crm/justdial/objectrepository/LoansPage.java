package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoansPage {

	//Locate the Elements & Declare them as Private
		@FindBy(xpath="//span[text()='Home Loans']")
		private WebElement homeLoansLnk;
		
		
		
		//Initializing using Constructor
		public LoansPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}


		//Generating Getters Methods
		
		public WebElement getHomeLoansLnk() {
			return homeLoansLnk;
		}
		
		
		//Business Libraries
		
		public void clickOnHomeLoans()
		{
			homeLoansLnk.click();
		}
}

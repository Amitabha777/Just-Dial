package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.justdial.genericutility.WebDriverUtility;

public class FurnacePage extends WebDriverUtility{

		//Locators
		@FindBy(xpath="//a[text()='Apparel & Fashion']")
		private WebElement apparel;
		
		//Constructor
		public FurnacePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//Getters Methods
		public WebElement getApparel() {
			return apparel;
		}
		
		
		//Business Libraries
		public void mouseOverToApparelAndFashionLnk(WebDriver driver)
		{
			moveMouseToElement(driver, apparel);
		}
		
		

}

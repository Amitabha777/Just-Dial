package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class RestaurantsPage {

	//Locators
			@FindBys({@FindBy(xpath="//h4[text()=' Book a Table']"), @FindBy(xpath="//span[.='Make Reservations']")})
			private WebElement bookTable;
			
			//Constructor
			public RestaurantsPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

			//Getters Method
			public WebElement getBookTable() {
				return bookTable;
			}

			//Business Libraries
			
			public void clickOnBookATable()
			{
				bookTable.click();
			}
			
}

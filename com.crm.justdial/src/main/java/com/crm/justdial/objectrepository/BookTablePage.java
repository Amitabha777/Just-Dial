package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookTablePage {

	//Locators
			@FindBy(xpath="//span[text()='Copacabana Pub & Restaurant']/ancestor::section/div[contains(@class,'btn-grp')]/ul/li/a[1]")
			private WebElement bookOrdercopacabanaPubLnk;
			
			//Constructor
			public BookTablePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

			//Getters
		
			public WebElement getBookOrdercopacabanaPubLnk() {
				return bookOrdercopacabanaPubLnk;
			}

			
			//Business Libraries
			public void clickOnBookOrderOfCopacabanaPub()
			{
				bookOrdercopacabanaPubLnk.click();
			}

}

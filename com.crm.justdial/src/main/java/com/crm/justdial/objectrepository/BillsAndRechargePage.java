package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillsAndRechargePage {

		//Locators
			@FindBy(id="rc_mob_radio")
			private WebElement prepaidBtn;
			
			@FindBy(id="num_rc_mob")
			private WebElement numberBx;
			
			//Constructor
			public BillsAndRechargePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

			//Getters
			public WebElement getPrepaidBtn() {
				return prepaidBtn;
			}

			
			public WebElement getNumberBx() {
				return numberBx;
			}

			//Business Libraries
			public void clickPrepaidButton()
			{
				prepaidBtn.click();
			}

			public void enterMobileNumbr(String num)
			{
				numberBx.sendKeys(num);
			}
			
}

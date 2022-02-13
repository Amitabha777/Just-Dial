package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CovidHelpLinePage {

	//Locators
			@FindBy(xpath="//a[.='Live Status']")
			private WebElement liveStatLnk;
			
			@FindBy(xpath="//a[.='Vaccination Centers']")
			private WebElement vaccinationCentreLnk;
			
			
			//Constructor
			public CovidHelpLinePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

			
			//Getters
			public WebElement getLiveStatLnk() {
				return liveStatLnk;
			}
			
			public WebElement getVaccinationCentreLnk() {
				return vaccinationCentreLnk;
			}


			//Business Libraries
			public void liveStatus()
			{
				liveStatLnk.click();
			}
			
			public void vaccinactionCenters()
			{
				vaccinationCentreLnk.click();
			}
}

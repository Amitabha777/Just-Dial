package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.justdial.genericutility.WebDriverUtility;

public class VaccinationCentersPage extends WebDriverUtility{

	//Locators
	@FindBy(id="stateid")
	private WebElement stateDropDwn;
	
	@FindBy(id="district_id")
	private WebElement districtDrpDwn;
	
	
	//Constructor
	public VaccinationCentersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Getters
	public WebElement getStateDropDwn() {
		return stateDropDwn;
	}


	public WebElement getDistrictDrpDwn() {
		return districtDrpDwn;
	}

	
	//Business Libraries
	public void stateSelect(String text)
	{
		handleDropDownsBySelect(stateDropDwn, text);
	}
	
	public void districtSelect(String text)
	{
		handleDropDownsBySelect(districtDrpDwn, text);
	}
	
}

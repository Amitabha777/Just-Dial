package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author AMITABHA
 *
 */

public class HomePage {

	//Locate Web Elements & Declare Them as Private
	
	@FindBy(xpath="//span[text()='Automobile']")
	private WebElement automobileLnk;
	
	@FindBy(xpath="//span[.='COVID-19 Helpline']")
	private WebElement covidHelpLnk;
	
	@FindBy(xpath="//span[contains(text(),'Baby Care')]")
	private WebElement babyCareLnk;
	
	@FindBy(xpath="//span[text()='B2B']")
	private WebElement b2bLnk;
	
	@FindBy(xpath="//span[text()='Chemists']")
	private WebElement chemistLnk;
	
	@FindBy(xpath="//ul[@id='sidebarnavleft']/li[5]//span[text()='Loans']")
	private WebElement loanLnk;
	
	@FindBy(xpath="//span[text()='Restaurants' and @class='heading wrapper']")
	private WebElement restaurantHeader;
	
	@FindBy(xpath="//span[text()='Air Tickets ']")
	private WebElement airTicktlnk;
	
	
	@FindBy(xpath="//span[.='Bills & Recharge']")
	private WebElement rechargeLnk;
	
	
	//Initialize The WebElements using Constructor
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Utilization: Generating Getters Methods 
	public WebElement getAutomobileLnk() {
		return automobileLnk;
	}


	public WebElement getBabyCareLnk() {
		return babyCareLnk;
	}
	
			
	public WebElement getAirTicktlnk() {
		return airTicktlnk;
	}


	public WebElement getCovidHelpLnk() {
		return covidHelpLnk;
	}


	public WebElement getLoanLnk() {
		return loanLnk;
	}
	

	public WebElement getRechargeLnk() {
		return rechargeLnk;
	}


	public WebElement getChemistLnk() {
		return chemistLnk;
	}


	public WebElement getRestaurantHeader() {
		return restaurantHeader;
	}


	public WebElement getB2bLnk() {
		return b2bLnk;
	}


	//Business Libraries
	public void clickOnAutomobileLnk()
	{
		automobileLnk.click();
	}
	
	public void clickOnBabycareLnk()
	{
		babyCareLnk.click();
	}
	
	public void clickOnB2bLnk()
	{
		b2bLnk.click();
	}
	
	public void clickOnLoans()
	{
		loanLnk.click();
	}
	
	public void clickOnChemists()
	{
		chemistLnk.click();
	}
	
	public void clickOnCovidHelpLine()
	{
		covidHelpLnk.click();
	}
	
	public void clickOnRestaurantHeader()
	{
		restaurantHeader.click();
	}
	
	public void clickOnBillsAndRecharge()
	{
		rechargeLnk.click();
	}

	public void clickOnAirTickets()
	{
		airTicktlnk.click();
	}
	
}

package com.crm.justdial.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.justdial.genericutility.WebDriverUtility;

public class NewCarsPage extends WebDriverUtility{

	//Locate the Web Elements & declare them as private
	
	@FindBy(xpath="//input[@value='100000-500000']")
	private WebElement priceRangeBx0;
	
	@FindBy(xpath="//input[@value='500000-1000000']")
	private WebElement priceRangeBx1;
	
	@FindBy(xpath="//input[@value='1000000-2000000']")
	private WebElement priceRangeBx2;
	
	@FindBy(xpath="//input[@value='2000000-5000000']")
	private WebElement priceRangeBx3;
	
	@FindBy(xpath="//input[@value='5000000-10000000']")
	private WebElement priceRangeBx4;
	
	@FindBy(xpath="//input[@value='10000000-999999999']")
	private WebElement priceRangeBx5;
	
	
	@FindBy(xpath="//input[@value='Mahindra']")
	private WebElement mahindraBx;
	
	@FindBy(xpath="//input[@value='Hyundai']")
	private WebElement hyundaiBx;
	
	@FindBy(xpath="//input[@value='Tata']")
	private WebElement tataBx;
	
	@FindBy(xpath="//input[@value='Ford']")
	private WebElement fordBx;
	
	@FindBy(xpath="//a[@title='Justdial - Shop Online']")
	private WebElement header;
	
	
	
	//Initialize using Constructor
	public NewCarsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	//Generate Getter Method

	public WebElement getPriceRangeBx0() {
		return priceRangeBx0;
	}


	public WebElement getHeader() {
		return header;
	}

	public WebElement getPriceRangeBx1() {
		return priceRangeBx1;
	}


	public WebElement getPriceRangeBx2() {
		return priceRangeBx2;
	}


	public WebElement getPriceRangeBx3() {
		return priceRangeBx3;
	}


	public WebElement getPriceRangeBx4() {
		return priceRangeBx4;
	}


	public WebElement getPriceRangeBx5() {
		return priceRangeBx5;
	}
		
	public WebElement getMahindraBx() {
		return mahindraBx;
	}

	public WebElement getHyundaiBx() {
		return hyundaiBx;
	}

	public WebElement getTataBx() {
		return tataBx;
	}

	public WebElement getFordBx() {
		return fordBx;
	}

	
	
	//Business Library

	public void selectRange(long priceRange) {
		if(priceRange>= 100000 && priceRange<500000)
		{
			priceRangeBx0.click();
		}
		else if(priceRange>= 500000 && priceRange<1000000)
		{
			priceRangeBx1.click();
		}
		else if(priceRange>= 1000000 && priceRange<2000000)
		{
			priceRangeBx2.click();
		}
		else if(priceRange>= 2000000 && priceRange<5000000)
		{
			priceRangeBx3.click();
		}
		else if(priceRange>= 5000000 && priceRange<10000000)
		{
			priceRangeBx4.click();
		}
		else if(priceRange>= 10000000)
		{
			priceRangeBx5.click();
		}
	}
	
	public void selectBrand(String brand)
	{
		if(brand.equalsIgnoreCase("mahindra"))
		{
			mahindraBx.click();
		}
		if(brand.equalsIgnoreCase("ford"))
		{
			fordBx.click();
		}
		if(brand.equalsIgnoreCase("tata"))
		{
			tataBx.click();
		}
		if(brand.equalsIgnoreCase("hyundai"))
		{
			hyundaiBx.click();
		}
	}
	
}

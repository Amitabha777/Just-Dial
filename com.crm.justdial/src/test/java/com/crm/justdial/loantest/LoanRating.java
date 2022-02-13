package com.crm.justdial.loantest;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.justdial.genericutility.BaseClass;
import com.crm.justdial.objectrepository.HomePage;
import com.crm.justdial.objectrepository.LoansPage;

public class LoanRating extends BaseClass{

	
	@Test
	public void loan_TC_03()
	{
	//Objects Of POM Classes
	HomePage homePage= new HomePage(driver);
	LoansPage loansPage= new LoansPage(driver);
	
	
	//Clicking on Loans Link
	homePage.clickOnLoans();
	Reporter.log("Loan Page Opens Successfully",true);
	
	//Click on Home Loans
	loansPage.clickOnHomeLoans();
	Reporter.log("Home Loan Page Opens Successfully",true);
	
//	driver.findElement(By.xpath("//span[text()='Car Loans']")).click();
	
	//			//ul[@id='sidebarnavleft']/li[5]//span[text()='Loans']
	
	}
}
	

package com.crm.justdial.billsandrechargetest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.justdial.genericutility.BaseClass;
import com.crm.justdial.objectrepository.BillsAndRechargePage;
import com.crm.justdial.objectrepository.HomePage;

@Listeners(com.crm.justdial.genericutility.ListenerImplementation.class)
public class PrepaidRechargeTest extends BaseClass{

	@Test
	public void rechrg_TC_06() throws InterruptedException
	{
		
		//Objects Of POM Class
		
		HomePage homePage= new HomePage(driver);
		BillsAndRechargePage billsAndRechargePage= new BillsAndRechargePage(driver);
		
		
		//Click On Bills & Recharge Link
		homePage.clickOnBillsAndRecharge();
		
		//Click On Prepaid button
		billsAndRechargePage.clickPrepaidButton();
		
	
		//Select Network Provider as BSNL
		driver.findElement(By.id("shwlnk_optr_rc_mob")).click();	
		
		List<WebElement> lst=driver.findElements(By.xpath("//ul[@id='optr_lst_rc_mob']/descendant::span[@class='brndtxt']"));
		
		System.out.println("List size="+lst.size());
		
		wLib.handleDropDownOrMultipleElements(lst, "bsnl");
		
		//Thread.sleep(5000);
		
		//Select (Validity/Special) Radio Button under Bsnl
		driver.findElement(By.xpath("//label[.='BSNL (Validity / Special)']")).click();
		
		
		//Select Special Recharge
		driver.findElement(By.xpath("//a[.='Special Recharge']")).click();
		
		
		//Select Region As Haryana
		driver.findElement(By.id("region_rc_mob")).click();
		
		List <WebElement> states=driver.findElements(By.xpath("//span[@id='trs_rc_mob']/div[@class='sct']/ul/li/a"));
		
		wLib.handleDropDownOrMultipleElements(states, "Haryana");
		
		
		//Again Select 'Special Recharge'
		driver.findElement(By.xpath("//a[.='Special Recharge']")).click();
		
		
		//From Price Table, Select Rs 24 Offer
		List <WebElement> price=driver.findElements(By.xpath("//table[@id='tpup1']/tbody/tr/td[3]/div/span/span[2]"));
		System.out.println("List of Price= "+price.size());
		
		wLib.handleDropDownOrMultipleElements(price, "24");
		
		
		//Click On Continue
		driver.findElement(By.id("button_rc_mob")).click();
	}
}

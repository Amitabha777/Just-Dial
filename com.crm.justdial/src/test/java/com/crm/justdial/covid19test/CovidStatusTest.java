package com.crm.justdial.covid19test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.justdial.genericutility.BaseClass;
import com.crm.justdial.objectrepository.CovidHelpLinePage;
import com.crm.justdial.objectrepository.HomePage;
import com.crm.justdial.objectrepository.VaccinationCentersPage;

public class CovidStatusTest extends BaseClass{

	@Test
	public void covidStat_TC_05() throws InterruptedException
	{
		//Objects Of POM Classes
		HomePage homePage= new HomePage(driver);
		CovidHelpLinePage covidHelpLinePage= new CovidHelpLinePage(driver);
		VaccinationCentersPage vaccinationCentersPage= new VaccinationCentersPage(driver);
		
		
		//Clicking On Covid HelpLine
		homePage.clickOnCovidHelpLine();
		
		//Clicking On Live Status
		covidHelpLinePage.liveStatus();
		
		//Getting Confirmed Cases Of India
		String confirmedCases=driver.findElement(By.xpath("//span[.='🇮🇳']/ancestor::li/ul/li[1]/div[2]")).getText();
		
		System.out.println("India Confirmed Cases="+confirmedCases);
		
		//Getting Active Cases Of India
		String activeCases=driver.findElement(By.xpath("//span[.='🇮🇳']/ancestor::li/ul/li[2]/div[2]")).getText();
		
		System.out.println("India Active Cases="+activeCases);
		
		//Getting Recovered Of India
		String recovered=driver.findElement(By.xpath("//span[.='🇮🇳']/ancestor::li/ul/li[3]/div[2]")).getText();
		
		System.out.println("India Recovered="+recovered);
		
		//Getting No of Deceased from India
		String deceased=driver.findElement(By.xpath("//span[.='🇮🇳']/ancestor::li/ul/li[4]/div[2]")).getText();
		
		System.out.println("India Deceased= "+deceased);
		
		
		//Going to Vaccination Centers
		covidHelpLinePage.vaccinactionCenters();
		
		
		//Selecting State as Karnataka
//		vaccinationCentersPage.stateSelect("Karnataka");
		
		WebElement state=driver.findElement(By.id("stateid"));
		
		List<WebElement> lst=wLib.handleDropDownsBySelect(state);
		
		for(WebElement wb: lst)
		{
			String st=wb.getText();
			//System.out.println(st);
			
			if(st.equals("Bihar"))
			{
				
				wb.click();
			}
		}
				
		//Thread.sleep(3000);
		
		WebElement dis=driver.findElement(By.id("district_id"));
		
		List<WebElement> dists=wLib.handleDropDownsBySelect(dis);
		
		for(WebElement wb: dists)
		{
			String dst=wb.getText();
			System.out.println(dst);
			
			if(dst.equals("Buxar"))
			{

				wb.click();
			}
		}
		
		
		
		
		//Select District
	//	vaccinationCentersPage.districtSelect("Bidar");
		
		
	}
	
}

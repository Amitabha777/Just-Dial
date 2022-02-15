package com.crm.justdial.b2btest;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.justdial.genericutility.BaseClass;
import com.crm.justdial.objectrepository.B2BPage;
import com.crm.justdial.objectrepository.FurnacePage;
import com.crm.justdial.objectrepository.HomePage;
import com.crm.justdial.objectrepository.IndustrialPlantAndMachineryPage;

@Listeners(com.crm.justdial.genericutility.ListenerImplementation.class)
public class AskPriceTest extends BaseClass{

	@Test
	public void b2b_TC_002Test()
	{
		
		//Objects of POM Classes
		HomePage homePage= new HomePage(driver);
		B2BPage b2bPage= new B2BPage(driver);
		IndustrialPlantAndMachineryPage industrialPlantAndMachineryPage = new IndustrialPlantAndMachineryPage(driver);
		FurnacePage furnacePage= new FurnacePage(driver);
		
		
		//Click B2B Link
		homePage.clickOnB2bLnk();
		Reporter.log("Clicked & Entered B2B link",true);
		
		
		//Click on Industrial Plants & Machinery
		b2bPage.clickOnIndustriesAndPlants();
		Reporter.log("Clicked & Entered Industrial Plants & Machinery link",true);
		
		//Click On Furnace
		industrialPlantAndMachineryPage.clickOnFurnaceLnk();
		Reporter.log("Clicked & Entered Furnace link",true);
		
		
		//Move Mouse to Apparel & Fashion
		furnacePage.mouseOverToApparelAndFashionLnk(driver);
		Reporter.log("Mouse over to Apparel & Fashion Link",true);
		
		
		//Clicking on Gloves
		driver.findElement(By.xpath("//a[text()='Glove']")).click();
		Reporter.log("Gloves Linked got Clicked",true);
		
		//Handling Gloves Tab
		
		String mainId=driver.getWindowHandle();
		
		Set<String> allIds=driver.getWindowHandles();

		wLib.handleWindowsOrTabs(driver, allIds, "gloves");
		Reporter.log("Switched to Gloves tab",true);
		
		
		//Clicking on 'Gloves For Kitchen'
		driver.findElement(By.xpath("//div[text()='gloves for the kitchen']")).click();
		Reporter.log("Clicked Gloves for Kitchen",true);
		
		
		//Handling Kitchen Glove Tab
		allIds=driver.getWindowHandles();
		
		wLib.handleWindowsOrTabs(driver, allIds, "for the kitchen");
		Reporter.log("Switched to Gloves for Kitchen Tab",true);
		
		
		//Clicking on Ask For Price
		driver.findElement(By.xpath("//div[text()='Ask for price']")).click();
		Reporter.log("Ask For Price button got clicked",true);
		
		//Entering Name
		driver.findElement(By.name("name")).sendKeys("Amitabha");
		Reporter.log("Name Entered Successfully",true);
		
		//Entering Mobile No
		driver.findElement(By.name("mobile")).sendKeys("4546547568");
		Reporter.log("Mobile No Enetred Successfully",true);
		
	}
}

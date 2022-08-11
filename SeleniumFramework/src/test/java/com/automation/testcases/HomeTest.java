package com.automation.testcases;


import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.automation.pages.HomePage;
import com.automation.utility.BaseClass;
import com.automation.utility.Helper;





public class HomeTest extends BaseClass {
	
	
	
	
	
	@Test
	public void loginApp()
	{
		
		
		System.out.println(driver.getTitle());
		
		logger = report.createTest("Home navigation on CIMB");
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		
		logger.info("Starting the CIMB application");
		
		homePage.navigateToCIMB_Deals();
		
		logger.pass("Navigation successful");
		
		
	
	}

}

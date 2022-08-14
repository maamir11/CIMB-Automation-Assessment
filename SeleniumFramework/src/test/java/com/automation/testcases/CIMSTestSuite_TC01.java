package com.automation.testcases;


import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.automation.pages.CalculatorPage;
import com.automation.pages.HomePage;
import com.automation.utility.BaseClass;
import com.automation.utility.Helper;





public class CIMSTestSuite_TC01 extends BaseClass {
	
	
	
	
	
	@Test(priority=1,description="This is test case for exploring OctoTravel Visa Flights",enabled=true)
	public void OctoTravelVisaFlightsDeals()
	{
		
		
		System.out.println(driver.getTitle());
		
		logger = report.createTest("View Octo Travel Visa Flights Deals");
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		
		//logger.info("Starting the CIMB application");
		
		homePage.navigateToCIMB_Deals();
		
		logger.pass("Details of Octo Travel Visa Flights Deals shown successfully");
		
	}
	


}

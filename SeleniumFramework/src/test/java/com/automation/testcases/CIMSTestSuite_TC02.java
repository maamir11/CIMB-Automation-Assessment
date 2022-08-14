package com.automation.testcases;


import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.automation.pages.CalculatorPage;
import com.automation.pages.HomePage;
import com.automation.utility.BaseClass;
import com.automation.utility.Helper;





public class CIMSTestSuite_TC02 extends BaseClass {
	
	
	

	@Test(priority=1,description="This is test case for calculating Property Loan Repayment",enabled=true)
	public void PropertyLoanRepaymentCalculator () throws InterruptedException
	{
		
		System.out.println(driver.getTitle());
		
		logger = report.createTest("Loan repayment table display");
		
		CalculatorPage calculatorPage = PageFactory.initElements(driver, CalculatorPage.class);
		
		//logger.info("Starting the CIMB application");
		
		calculatorPage.navigateToPropertyLoanRepaymentCalculator();
		
		logger.pass("loan repayment table displayed successfully");
		
	}

}

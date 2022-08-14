//This class contains method for report generation in the framework. It also includes methods such as launching and closing the browser.

package com.automation.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static ExtentReports report;
	
	public static ExtentTest logger;
	
	@BeforeSuite
	
	public void setUpSuite() {
		ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/CIMS+"+Helper.getCurrentDateTime()+".html"));
		report=new ExtentReports();
		report.attachReporter(extent);
		
	}
	
	@BeforeMethod
	public void setUp()
	{
	driver = BrowserFactory.startApp(driver, "Chrome", "https://www.cimb.com.my/en/personal/home.html");
	}
	

   
	@AfterMethod

	public void tearDownMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//Helper.captureScreenshot(driver);
			logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			//logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
			System.out.println("Test passed");
		}
		
	}
	
	
	
	@AfterClass
	
	public void tearDown()
	{
		BrowserFactory.quitApp(driver); 
	}
	
	
	
	
	@AfterSuite
	public void close_report() {
		report.flush();
	}
	
	
}

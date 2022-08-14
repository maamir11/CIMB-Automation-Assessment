//This class includes the implementation methods of launching and closing the web browser.

package com.automation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	
	public static WebDriver startApp(WebDriver driver,String browserName,String appUrl)
	{
		
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
					
		}
		else if(browserName.equals("Firefox"))
		{
			
		}
		else if(browserName.equals("Edge"))
		{
			
		}
		else
		{
			System.out.println("We do not support this browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		}
		
		public static void quitApp(WebDriver driver) 
		{
			driver.quit();
		}
	
}

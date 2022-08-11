package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	
	
	private WebDriver driver;

	public HomePage(WebDriver localdriver)
	{
		this.driver=localdriver;
		
	}
	
		
	By popup_close=By.xpath("//*[@class='btn-overlay-close icon-bytesize absolute top-0 right-0 mt-3 mr-2 md:mt-6 md:mr-6 text-red-500 cursor-pointer z-100']");
	
	By burger_menu=By.xpath("//*[@class='btn-burger-menu cursor-pointer hover:drop-shadow-5']");
	
	By cimb_deals=By.xpath("//a[contains(@href,'/en/personal/cimb-deals') and @class='btn-nav block py-2 my-3 text-sm']");
	
	
	public void navigateToCIMB_Deals()
	{
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		try 
		{
			Thread.sleep(40000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		
		
		driver.findElement(popup_close).click();
		
			
		try 
		{
			Thread.sleep(40000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		
		driver.findElement(burger_menu).click();
		
		
		try 
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		driver.findElement(cimb_deals).click();
		
		
		try 
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			
		}
				
	}
	

}

package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	
	
	private WebDriver driver;
	
	
	
	

	public HomePage(WebDriver localdriver)
	{
		this.driver=localdriver;
		
	}
	
		
	By popup_close=By.xpath("//*[@class='btn-overlay-close icon-bytesize absolute top-0 right-0 mt-3 mr-2 md:mt-6 md:mr-6 text-red-500 cursor-pointer z-100']");
	
	By burger_menu=By.xpath("//*[@class='btn-burger-menu cursor-pointer hover:drop-shadow-5']");
	
	By cimb_deals=By.xpath("//a[contains(@href,'/en/personal/cimb-deals') and @class='btn-nav block py-2 my-3 text-sm']");
	
	By county_selection=By.xpath("//p[text()='Malaysia']");
	
	By travel_btn=By.xpath("//p[text()='TRAVEL & LIFESTYLE']");
	
	By viewAll_btn=By.xpath("(//div[@class='pb-xs-2 pb-md-2 col-xs-12 col-md-6 px-4 d-flex justify-content-between sub-border'])[3]");
	
	By octaTravel_card=By.xpath("//p[text()='travel & lifestyle • OCTOTRAVEL']");
	
	By discountHeader=By.xpath("//*[@class='nav nav-tabs justify-content-start']");
	
	By discountDescription=By.xpath("//p[text()='Enjoy 30% discount on your domestic flights when you book only on OctoTravel website or mobile app!']");
	
	By similarDeals_header=By.xpath("//p[text()='Similar Deals']");
	
	
	
	
	public void navigateToCIMB_Deals()
	{
		/*
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		try 
		{
			Thread.sleep(40000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		
		*/
		// Create object of WebDriverWait class

		WebDriverWait wait=new WebDriverWait(driver,40);



		// Wait till the element is not visible

		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(popup_close));
		
		driver.findElement(popup_close).click();
		
		/*
		try 
		{
			Thread.sleep(40000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		*/
		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(burger_menu));
		
		//WebDriverWait wait1=new WebDriverWait(driver,50);
		
		//WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(burger_menu));
		
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		try 
		{
			Thread.sleep(40000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		driver.findElement(burger_menu).click();
		
		/*
		try 
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		*/
		
		//wait=new WebDriverWait(driver,20);
		//element=wait.until(ExpectedConditions.visibilityOfElementLocated(cimb_deals));
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		try 
		{
			Thread.sleep(40000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		driver.findElement(cimb_deals).click();
		
		//wait=new WebDriverWait(driver,20);
		//element=wait.until(ExpectedConditions.visibilityOfElementLocated(county_selection));
		try 
		{
			Thread.sleep(40000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		driver.findElement(county_selection).click();
		
		//wait=new WebDriverWait(driver,20);
		//element=wait.until(ExpectedConditions.visibilityOfElementLocated(travel_btn));
		try 
		{
			Thread.sleep(40000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		driver.findElement(travel_btn).click();
		
		//wait=new WebDriverWait(driver,20);
		//element=wait.until(ExpectedConditions.visibilityOfElementLocated(viewAll_btn));
		driver.findElement(viewAll_btn).click();
		
		//wait=new WebDriverWait(driver,20);
		//element=wait.until(ExpectedConditions.visibilityOfElementLocated(octaTravel_card));
		driver.findElement(octaTravel_card).click();
		
		//wait=new WebDriverWait(driver,20);
		//element=wait.until(ExpectedConditions.visibilityOfElementLocated(discountHeader));
		driver.findElement(discountHeader).getText().contains("Highlights");
		driver.findElement(discountDescription).getText().contains("Enjoy 30% discount on your domestic flights when you book only on OctoTravel website or mobile app!");		
		driver.findElement(similarDeals_header).getText().contains("Similar Deals");
		
		
		/*
		try 
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		*/		
	}
	

}

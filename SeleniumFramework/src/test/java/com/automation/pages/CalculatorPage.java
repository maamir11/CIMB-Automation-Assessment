package com.automation.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CalculatorPage {	
		
		private WebDriver driver;	
		

		public CalculatorPage(WebDriver localdriver)
		{
			this.driver=localdriver;
			
		}
		
			
		By popup_close=By.xpath("//*[@class='btn-overlay-close icon-bytesize absolute top-0 right-0 mt-3 mr-2 md:mt-6 md:mr-6 text-red-500 cursor-pointer z-100']");
		
		By burger_menu=By.xpath("//*[@class='btn-burger-menu cursor-pointer hover:drop-shadow-5']");
		
		By tools=By.xpath("//a[contains(@href,'/en/personal/day-to-day-banking/tools.html') and @class='text-sm mb-4 block']");
		
		By cookies=By.xpath("//*[@Class='btn-consent-accept variant-bg-white body-text-3 ml-auto']");
		
		By profit_affordability_calculator=By.xpath("(//*[@class='label text-sm sm:text-base pr-5'])[4]");
		
		/*By gross_monthly_income=By.xpath("(//*[@class='input-container'])[1]");
		
		By monthly_net_income=By.xpath("(//*[@class='input-container'])[2]");
		
		By total_monthly_expenses=By.xpath("(//*[@class='input-container'])[3]");
		
		By loan_period=By.xpath("(//*[@class='input-container'])[4]");
		
		By rate_per_annum=By.xpath("(//*[@class='input-container'])[5]");
			*/
		
		By estimated_monthly_payment_header=By.xpath("//span[text()='Your Estimated Monthly Payment']");
		
		By estimated_monthly_payment=By.xpath("//span[text()='3,094.74']");
		
		By max_loan_amount_header=By.xpath("//span[text()='Maximum Loan Amount']");
		
		By max_loan_amount=By.xpath("//span[text()='166,000.00']");
	

		
		public void navigateToPropertyLoanRepaymentCalculator() throws InterruptedException
		{
			
			WebDriverWait wait=new WebDriverWait(driver,40);

			// Wait till the element is not visible

			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(popup_close));
			
			driver.findElement(popup_close).click();
			try 
			{
				Thread.sleep(20000);
			} 
			catch (InterruptedException e) 
			{
				
			}
			driver.findElement(cookies).click();
			
			driver.findElement(burger_menu).click();
			
			driver.findElement(tools).click();
			//driver.findElement(cookies).click();
			
			String parent_window=driver.getWindowHandle();
			
			System.out.println("Parent window id is "+parent_window);
			
			
			driver.findElement(profit_affordability_calculator).click();	
			
			Set<String> all_Windows=driver.getWindowHandles();
			int countOfWindows=all_Windows.size();
			System.out.println("Total window tabs opened are "+countOfWindows);
			
			for(String child:all_Windows)
			{
				if(!parent_window.equalsIgnoreCase(child))
				{
					driver.switchTo().window(child);
					System.out.println("Switched to new tab");
					
					//driver.findElement(cookies).click();
					//driver.findElement(gross_monthly_income).click();
					
					WebElement gross_monthly_income=driver.findElement(By.xpath("(//*[@class='input-container'])[1]"));
					Actions gmiAct=new Actions(driver);				
					gmiAct.sendKeys(gross_monthly_income, "1000000").build().perform();
					
					//driver.findElement(gross_monthly_income).sendKeys("100000");
					
					WebElement monthly_net_income=driver.findElement(By.xpath("(//*[@class='input-container'])[2]"));
					Actions mniAct=new Actions(driver);				
					mniAct.sendKeys(monthly_net_income, "900000").build().perform();
					
					WebElement total_monthly_expenses=driver.findElement(By.xpath("(//*[@class='input-container'])[3]"));
					Actions tmeAct=new Actions(driver);				
					tmeAct.sendKeys(total_monthly_expenses, "500000").build().perform();
					
					WebElement loan_period=driver.findElement(By.xpath("(//*[@class='input-container'])[4]"));
					Actions lpAct=new Actions(driver);				
					lpAct.sendKeys(loan_period, "5").build().perform();
					
					WebElement rate_per_annum=driver.findElement(By.xpath("(//*[@class='input-container'])[5]"));
					Actions performAct=new Actions(driver);				
					performAct.sendKeys(rate_per_annum, "4.50").build().perform();					
					
					Assert.assertEquals(true, driver.findElement(estimated_monthly_payment_header).isDisplayed()); 
					Assert.assertEquals(true, driver.findElement(estimated_monthly_payment).isDisplayed());
					//driver.findElement(estimated_monthly_payment).isDisplayed();
					//String expected_estimated_monthly_payment_value= "3,094.74";
			
					Assert.assertEquals(true, driver.findElement(max_loan_amount_header).isDisplayed()); 
					Assert.assertEquals(true, driver.findElement(max_loan_amount).isDisplayed());
					
					Thread.sleep(5000);		
					driver.close();
				}
			}
			
			driver.switchTo().window(parent_window);
			System.out.println("returned to parent previous tab");
		}
		

	}



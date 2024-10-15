package com.project.SeleniumTutorialsByVARSHA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.project.SampleSeleniumProject.alerts;

public class Example {
	@Test
	public void Ex() throws InterruptedException {
		
		WebDriver driver  = new FirefoxDriver();
		String str = "https://demo.opencart.com/";
		driver.get(str);
		driver.manage().window().maximize();
//		
		 WebElement Element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
//		 
//		 
	 
		 Thread.sleep(2000);
		 Element.click();
		 Element.sendKeys("Mac Book");
		 Element.sendKeys(Keys.ARROW_DOWN);
         Element.sendKeys(Keys.ENTER);
//		 
		 
//		 WebElement Element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
//		 Actions action = new Actions(driver); 
//		 action.moveToElement(Element).perform();
//		 action.click().perform();
//		 action.sendKeys("Mac BOOk").perform();
//		 action.sendKeys(Keys.ARROW_DOWN).perform();
//		 action.sendKeys(Keys.ENTER).perform();
//		 
//		 driver.navigate().refresh();
		 
		

		 
		 //action.click();
		
	
//			
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[normalize-space()='MacBook']"));
		
		
		//driver.close();
		
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}

}

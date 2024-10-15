package com.project.SeleniumTutorialsByVARSHA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoSuggetions {
	@Test
	public void autoSug() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String str = "https://www.redbus.com/";
		driver.get(str);
		driver.manage().window().maximize();
		
//		WebElement source = driver.findElement(By.id("src"));
//		source.click();
//		source.sendKeys("Hyderabad");
//		source.sendKeys(Keys.ARROW_DOWN);
//		source.sendKeys(Keys.ENTER);
		
		WebElement Element = driver.findElement(By.id("src"));
		 Actions action = new Actions(driver); 
		 action.moveToElement(Element).perform();
		 action.click().perform();
		 action.sendKeys("Hyderabad").perform();
		 action.sendKeys(Keys.ARROW_DOWN).perform();
		 action.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(2000);
		 
		WebElement destination = driver.findElement(By.id("dest"));
		Actions action1 = new Actions(driver);
		action1.click().perform();
		Thread.sleep(2000);
		action1.sendKeys("Bangalore");
		action1.sendKeys(Keys.ARROW_DOWN);
		action1.sendKeys(Keys.ENTER);
		
		
		WebElement date = driver.findElement(By.id("onward_cal"));
		date.click();
		Thread.sleep(2000);
		date.sendKeys("04/sep/2024");
		date.sendKeys(Keys.ENTER);
		//driver.close();
		
	
	}

}

package com.project.SampleSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DropdownTesting {
	
	@Test
	public void dropdownW() throws InterruptedException {
		
	       WebDriver driver = new ChromeDriver();
		   String str = "https://iamsandesh23.github.io/selenium.github.io/";
		   driver.get(str);
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		   
		   
		   driver.findElement(By.className("dropbtn")).click();
		   
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		   
		   WebElement facebookElement = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
		   facebookElement.click();
		    
	 
	        
		    
		    
		    
		
	 
	    
	        driver.close();
	}
	
	

}

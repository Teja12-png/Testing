package com.project.SeleniumTutorialsByVARSHA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpath_Axes_Practice1 {
	@Test
	
	public void practice1()
	{
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.ebay.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Self node
		//driver.findElement(By.xpath("//input[@name='_nkw']/self::input")).sendKeys("Computers");
		
		
		// Parent node
        driver.findElement(By.xpath("//input[@name='_nkw']/parent::div")).sendKeys("shirts");
        
        //
//	   
		
		
	}

}

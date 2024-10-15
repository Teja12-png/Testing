package com.project.SampleSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContainsXpath {
	@Test
	public void Contains() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String str = "https://www.facebook.com/";
		System.out.println(str);
		driver.get(str);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("*");
		System.out.println("Enter An Email id");
		Thread.sleep(5000);
		
		driver.findElement(By.name("pass")).sendKeys("*");
		System.out.println("Enter a Password");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[contains(@name,'login')]"));
		Thread.sleep(5000);
		
		driver.close();
		
	}
	
	
	
	
	
	//driver.findElement(By.xpath("//*[contains(@id,'u_0_5_aP')]"));

}

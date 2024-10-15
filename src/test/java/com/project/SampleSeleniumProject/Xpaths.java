package com.project.SampleSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpaths {
	@Test
	
	public void xpath() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://iamsandesh23.github.io/selenium.github.io/";
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='PracticeAutomationHere']"));
		Thread.sleep(5000);
		driver.close();
		
		
	}

}

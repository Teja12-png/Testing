package com.project.SampleSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Eecommerce {
	@Test
	
	
	
	public void Amazon() {
		WebDriver driver = new FirefoxDriver();
		String str = "https://www.amazon.in/";
		driver.get(str);
		driver.close();
		
		
		
		System.out.println("Success");
		
		
		
	}

}

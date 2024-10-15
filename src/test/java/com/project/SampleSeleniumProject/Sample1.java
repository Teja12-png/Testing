package com.project.SampleSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {
	
	@Test
	public void Samp() {
	WebDriver driver = new ChromeDriver();
	String test = "https://www.flipkart.com/";
	driver.get(test);
	driver.close();
	System.out.println("Success");
	
	
	}
	
            
	
	

}

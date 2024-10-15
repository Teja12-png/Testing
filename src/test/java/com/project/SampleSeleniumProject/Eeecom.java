package com.project.SampleSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Eeecom {
	@Test
	
	

	public void Eee() {
		
		WebDriver driver = new ChromeDriver();
		
		String str = "https://www.amazon.in/";
		
		driver.get(str);
		
		driver.manage().window().maximize();
		// TODO Auto-generated method stub

	}

}

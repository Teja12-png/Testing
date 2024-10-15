package com.project.SampleSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {
	@Test
	public void Ex () {
		WebDriver driver = new ChromeDriver();
		String str = "https://www.guru99.com/junit-vs-testng.html#:~:text=Comparing%20TestNG%20Vs%20JUnit%2C%20TestNG,tests%20together%20is%20not%20possible.";
		driver.get(str);
		driver.manage().window().maximize();
		
		
		String s=driver.findElement(By.id("-what-is-testng")).getText();
	    System.out.println(s);
	    driver.close();
	}

}

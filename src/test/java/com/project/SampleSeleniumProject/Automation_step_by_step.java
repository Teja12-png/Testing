package com.project.SampleSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Automation_step_by_step {
	@Test
	
	public void Automation() {
		
		WebDriver driver = new ChromeDriver();
		String str = "https://automationstepbystep.com/";
		driver.get(str);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@class='pum-close popmake-close']")).click();
		driver.close();
		
	}

}

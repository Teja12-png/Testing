package com.project.SampleSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Iframes {
	@Test
	public void frames () {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.hyrtutorials.com/p/frames-practice.html";
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("name")).sendKeys("iframes");
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		Select dropdown = new Select(driver.findElement(By.id("selectnav1")));
		dropdown.selectByVisibleText("-- Selenium Java");
		
	    Select select = new Select(driver.findElement(By.id("course")));
		select.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("End of Frames");
		
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		Select frame = new Select(driver.findElement(By.id("selectnav1")));
		frame.selectByVisibleText("Contact");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		//driver.switchTo().frame(driver.findElement(By.id("frm3")));
		//Select course = new Select(driver.findElement(By.id("selectnav1")));
		//course.selectByVisibleText("-- Selenium Java");
		
		driver.close();
		
		}

}

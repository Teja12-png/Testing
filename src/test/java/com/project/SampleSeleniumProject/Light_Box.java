package com.project.SampleSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Light_Box {
	@Test
	
	public void Light () {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		System.out.println(url);
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("//*[@class='_30XB9F']")).click();
		driver.findElements(By.xpath("//*[@class='wsejfv']"));
		driver.close();
		
		
	}

}

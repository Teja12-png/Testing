package com.project.SampleSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alerts {
	@Test
	
	public void alert() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		String url = "https://iamsandesh23.github.io/selenium.github.io/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("alert1")).click();
		Alert alert = driver.switchTo().alert();	
		String alertText = alert.getText();
		System.out.println(alertText);
		Thread.sleep(3000);
		alert.accept();
		driver.close();
		
		
		}

}

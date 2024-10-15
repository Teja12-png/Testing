package com.project.SampleSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_and_Drop {
	@Test
	
	public void Drag_Drop () throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String url = "http://omayo.blogspot.com/p/page3.html";
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drag = driver.findElement(By.xpath("//*[@aria-labelledby='price-min-label']"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDropBy(drag, -100, 0).perform();
		
		driver.close();
		
		
		
		
	}

}

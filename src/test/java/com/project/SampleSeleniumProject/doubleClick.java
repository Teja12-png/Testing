package com.project.SampleSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class doubleClick {
	@Test
	public void double_click() {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://iamsandesh23.github.io/selenium.github.io/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("kodnest");
		
		Actions action = new Actions(driver);
		action.doubleClick(search).perform();
		
		driver.close();
	}

}

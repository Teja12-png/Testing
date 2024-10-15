package com.project.SampleSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Context_Click {
	@Test
	public void ContextClick() {
		
		WebDriver driver = new ChromeDriver();
		String str = "https://iamsandesh23.github.io/selenium.github.io/";
		System.out.println(str);
		driver.get(str);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement click = driver.findElement(By.xpath("//*[@id='sidebar-right-1']/descendant::img"));
		
		Actions action = new Actions(driver);
		action.contextClick(click).perform();
		driver.close();
		
	}

}

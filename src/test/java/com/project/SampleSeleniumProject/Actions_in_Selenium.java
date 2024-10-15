package com.project.SampleSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_in_Selenium {
	@Test
	public void action () {
		
		WebDriver driver = new ChromeDriver();
		String str = "https://iamsandesh23.github.io/selenium.github.io/";
		System.out.println(str);
		driver.get(str);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement BlocksMenu = driver.findElement(By.xpath("//*[@id='cssmenu']/descendant::span[@id='blogsmenu']"));
		Actions action = new Actions(driver);
		action.moveToElement(BlocksMenu).perform();
		WebElement Sel143 = driver.findElement(By.xpath("//*[@id='cssmenu']/descendant::span[3]"));
		action.moveToElement(Sel143).click().perform();		
		
		
		
				
	}

}

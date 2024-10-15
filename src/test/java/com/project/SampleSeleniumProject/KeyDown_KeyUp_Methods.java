package com.project.SampleSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyDown_KeyUp_Methods {
	@Test
	public void Down_Up () {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://iamsandesh23.github.io/selenium.github.io/";
		driver.get(url);
		System.out.println(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement keyclick = driver.findElement(By.linkText("onlytestingblog"));
	    Actions action = new Actions(driver);
	    action.keyDown(keyclick, Keys.CONTROL).click().keyUp(keyclick, Keys.CONTROL).perform();
	    
	    driver.close();
	    
	    
	    
	  
	    
	}

}

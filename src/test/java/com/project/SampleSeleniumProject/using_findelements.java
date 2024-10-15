package com.project.SampleSeleniumProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class using_findelements {
	@Test
	public void elements() {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com/";
		driver.get(url);
		System.out.println(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		List<WebElement> tagName = driver.findElements(By.tagName("a"));
		System.out.println(tagName.size());
		
		for (WebElement element: tagName)
		{
			System.out.println(element.getText());
		}
		
		driver.close();
		
		
	}

}

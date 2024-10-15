package com.project.SeleniumTutorialsByVARSHA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
	@Test
	public void commands() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/browser-windows";
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Current URL
		String current_url = driver.getCurrentUrl();
		System.out.println(current_url);
		
	
	if(current_url.equals("https://demoqa.com/browser-windows"))
	{
		System.out.println("URL is verified");
	}
	else
	{
		System.out.println("URL is not verified");
	}
	
	// Title
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals("DEMOQA"))
	{
		System.out.println("Title is passed");
	}
	else
	{
		System.out.println("Title is not passed");
	}
	// length of the title
	int length = driver.getTitle().length();
	System.out.println(length);
	
	//pageSource
	String ps = driver.getPageSource();
	System.out.println(ps);
	
	int ps1 = driver.getPageSource().length();
	System.out.println(ps1);
	
	//new tab
	driver.findElement(By.id("tabButton")).click();
	Thread.sleep(3000);
	driver.close();
	driver.quit();
	
	
	
	
	}
}
	



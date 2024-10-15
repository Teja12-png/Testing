package com.project.SeleniumTutorialsByVARSHA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationalCommands {
	@Test
	public void navigation() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.ebay.com/");
		System.out.println("Navigated to ebay");
		driver.findElement(By.name("_nkw")).sendKeys("Speakers");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
	    System.out.println("Navigated back to the Amazon");
	    Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Navigated forward to the ebay");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}

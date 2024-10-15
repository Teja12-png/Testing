package com.project.SeleniumTutorialsByVARSHA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpath_Scenarios {
	@Test
	public void xpath() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://petstore.octoperf.com/actions/Catalog.action";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@alt='Dogs']")).click();
		driver.findElement(By.xpath("//*[normalize-space()='K9-BD-01']")).click();
		driver.findElement(By.xpath("(//a[@class='Button'][normalize-space()='Add to Cart'])[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']")).click();
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Teja");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Password@12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Login']")).submit();
		Thread.sleep(2000);
		
		
	}
	

}

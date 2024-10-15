package com.project.SeleniumTutorialsByVARSHA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OR_And_Operators {
	@Test
	

	public void oprators() {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String url = "https://www.ebay.com/";
		driver.get(url);
		System.out.println(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();;
		
		//OR Operator
		//driver.findElement(By.xpath("//input[@id='gh-ac' or @name='_nkw']")).sendKeys("Smart Tv's");
		// And Operator
		//driver.findElement(By.xpath("//input[@id='gh-ac' and @name='_nkw']")).sendKeys("Smatr Tv's");
		
		// Contains method
		//driver.findElement(By.xpath("//*[contains(@name,'_nkw')]")).sendKeys("Mobiles");
		
		//Starts-with
		//driver.findElement(By.xpath("//*[starts-with(@name,'_nkw')]")).sendKeys("Speakers");
		
		//text() method
		driver.findElement(By.xpath("//*[text()='Sell']")).click();
		
		//normalize-space()
		driver.findElement(By.xpath("//a[normalize-space()='DLF Ltd.']/self::a"));
		
		
		

	}

}

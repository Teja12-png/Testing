package com.project.SeleniumTutorialsByVARSHA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Enb_Disb_Sele {
	@Test
	public void EDS() {
		WebDriver driver = new ChromeDriver();
		String str = "https://wordpress.com/";
		driver.get(str);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='x-nav-link x-nav-link--primary x-nav-link--primary-button-fill x-link']")).click();
	}

}

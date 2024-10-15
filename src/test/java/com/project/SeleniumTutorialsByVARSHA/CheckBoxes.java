package com.project.SeleniumTutorialsByVARSHA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxes {
	@Test
	public void checkBox() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String str = "https://iamsandesh23.github.io/selenium.github.io/";
		driver.get(str);
		driver.manage().window().maximize();
		
		//Handle check boxes
		WebElement sports = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		sports.click();
		Thread.sleep(2000);
		
		WebElement blue = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		blue.click();
		
		Thread.sleep(2000);
		sports.click();
		
		Thread.sleep(2000);
		blue.click();
		
		Thread.sleep(2000);
		sports.click();
		
		//Validation for True or False
		//isDisplYED
		boolean bool1 = sports.isDisplayed();
		System.out.println(bool1);
		
		if(bool1==true)
		{
			sports.click();
		}
		
		//IsSelected
		boolean bool2 = blue.isSelected();
		System.out.println(bool2);
		
		if(bool2 == false)
		{
			blue.isSelected();
		}
		
		driver.close();
		}

}

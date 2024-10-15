package com.project.SeleniumTutorialsByVARSHA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMethods {
	@Test
	public void DropD() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String str = "https://iamsandesh23.github.io/selenium.github.io/";
		driver.get(str);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Find the options present in the dropdown menu
		Select select = new Select(driver.findElement(By.id("drop1")));
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		
		//print all options present in the drop down menu
		for(WebElement element: options)
		{
			System.out.println(element.getText());
		}
		Thread.sleep(2000);
		
		//selectbyvalue
		select.selectByValue("def");
		//selectbyindex
		select.selectByIndex(3);
		Thread.sleep(2000);
		//selectbyvisibletext
		select.selectByVisibleText("doc 3");
		
		driver.close();
		
	}

}

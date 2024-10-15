package com.project.SeleniumTutorialsByVARSHA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelectDropdowns {
	@Test
	
	public void MultiSelection() {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://iamsandesh23.github.io/selenium.github.io/";
		driver.get(url);
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.id("multiselect1")));
		List<WebElement> options = select.getOptions();
		System.out.println("The No.of options present are:"+options.size());
		
		for(WebElement element: options)
		{
		  System.out.println(element.getText());	
		}
		
		//selectbyvalue
		select.selectByValue("Hyundaix");
		
		//selectbyindex
		select.selectByIndex(3);
		
		//selectbyvisibletext
		select.selectByVisibleText("Swift");
		
		//disselectbyvisibletext
		select.deselectByVisibleText("Swift");
		
		//disselectbyindex
		select.deselectByIndex(3);
		//selectbyvalue
		select.deselectByValue("Hyundaix");
	}

}

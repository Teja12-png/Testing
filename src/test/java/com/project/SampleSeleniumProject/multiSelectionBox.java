package com.project.SampleSeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class multiSelectionBox {
	@Test
	
	public void multi() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://iamsandesh23.github.io/selenium.github.io/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("drop1"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		select.selectByVisibleText("doc 2");
		
		Select select_3 = new Select( driver.findElement(By.id("multiselect1")));
		List<WebElement> multi_options = select_3.getOptions();
		System.out.println("The no.of multiple options are:"+multi_options.size());
		
		//print the text for size
		for(WebElement ele:multi_options)
		{
			System.out.println("The size of text's is:"+ele.getText());
		}
		
		
		//WebElement multi = driver.findElement(By.id("multiselect1"));
		//Select select2 = new Select(multi);
		
		//select2.selectByIndex(1);
		//select2.selectByIndex(0);
		//select2.selectByIndex(3);
		//select2.selectByVisibleText("Volvo");
		//Thread.sleep(3000);
		//select2.selectByVisibleText("Audi");
		//Thread.sleep(3000);
		
		//select2.deselectByVisibleText("Audi");
		
		driver.close();
		driver.quit();
		
		
		
		
		
	}

}

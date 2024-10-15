package com.project.SampleSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {
	@Test
	
	 public void test() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 
		 String str = "https://iamsandesh23.github.io/selenium.github.io/";
		 
		 driver.get(str);
		 driver.manage().window().fullscreen();
		 //driver.manage().window().maximize();
		 
		//WebElement element = driver.findElement(By.name("q"));
		 
		//Thread.sleep(5000);
		 
		//element.sendKeys("abc");
		 
		//WebElement link = driver.findElement(By.linkText("onlytestingblog"));
		 
		//link.click();
		 
		//WebElement id = driver.findElement(By.id("textbox1"));
		//Thread.sleep(5000);
		 
		//id.sendKeys("SeleniumWebdriver");
		 
		//String text = driver.findElement(By.id("pah")).getText();
		//System.out.println(text);
		 
		//String title = driver.getTitle();
		//System.out.println(title);
		 
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		 
		//driver.findElement(By.partialLinkText("jquery")).click();
		 
		//driver.findElement(By.xpath(""))
		 
		 boolean displayed = driver.findElement(By.id("but2")).isDisplayed();
		 System.out.println(displayed);
		 boolean enabled = driver.findElement(By.id("but1")).isEnabled();
	     System.out.println(enabled);
	     boolean selected = driver.findElement(By.id("radio1")).isSelected();
	     System.out.println(selected);
	     boolean checked = driver.findElement(By.id("checkbox1")).isSelected();
	     System.out.println(checked);
	     
	     Thread.sleep(5000);
	     
	     
	     
		 
		driver.close();
		System.out.println("Success");
		 
		 
		 
		 
		 
		 

		 
		
		
	}

}

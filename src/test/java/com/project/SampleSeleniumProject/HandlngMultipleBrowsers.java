package com.project.SampleSeleniumProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlngMultipleBrowsers {
	
	@Test
	public void browsers() {
		
		ChromeDriver driver = new ChromeDriver();
		
		String str = "https://iamsandesh23.github.io/selenium.github.io/";
		driver.manage().window().maximize();
		driver.get(str);
		driver.findElement(By.linkText("Open a popup window")).click();
	    Set<String> windows = driver.getWindowHandles();
	    Iterator<String> itr = windows.iterator();
	   // while(itr.hasNext()) {
	    //	String win = itr.next();
	    	//System.out.println(win);
	    	
	   // }
	    
	    String mainWindow = itr.next();	
	    String childwindow = itr.next();
	    driver.switchTo().window(childwindow);
	    String text = driver.findElement(By.xpath("//body/h2")).getText();
	    System.out.println(text);
	    driver.quit();
		
			
		}
		
	}



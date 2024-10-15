package com.project.SeleniumTutorialsByVARSHA;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_Elements_Commands {
	@Test
	public void WebElemena() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String str = "https://www.google.com/";
		driver.get(str);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		//clear
		driver.findElement(By.name("q")).clear();
		
		
		
		//get location
		WebElement lo = driver.findElement(By.name("q"));
		Point point = lo.getLocation();
		System.out.println("X-cordibates are:"+point.x);
		System.out.println("Y-cordinates are:"+point.y);
		
		//GetSize
		WebElement size = driver.findElement(By.name("q"));
		Dimension dimension = size.getSize();
		System.out.println("The height is:"+dimension.height);
		System.out.println("The width is:"+dimension.width);
		
		//Get Tagname
		String tagname = driver.findElement(By.name("q")).getTagName();
		System.out.println("The taganme is:"+tagname);
		
		//To print the NO.of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The No.of links present in the webpage is:"+links.size());
		
		for(WebElement element: links)
		{
			System.out.println(element.getText());
		}
		
		//is Displayed
		boolean displayed = driver.findElement(By.xpath("//*[@aria-label='Sign in']")).isDisplayed();
		System.out.println(displayed);
		
		driver.close();
		
		//is enabled
//		boolean enabled = driver.findElement(By.xpath("//*[@aria-label='Sign in']")).isEnabled();
//		System.out.println(enabled);
		Thread.sleep(2000);
		
		
		
		//is selected
//		boolean selected = driver.findElement(By.xpath("//*[@aria-label='Sign in']")).isSelected();
//		System.out.println(selected);
		
		
		
	}

}

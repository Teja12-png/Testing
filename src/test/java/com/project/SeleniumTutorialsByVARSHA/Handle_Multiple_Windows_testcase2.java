package com.project.SeleniumTutorialsByVARSHA;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Handle_Multiple_Windows_testcase2 {
	@Test
	public void testcase2() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String str = "https://demoqa.com/browser-windows";
		driver.get(str);
		driver.manage().window().maximize();
		
		//parent window
		String parentWindow = driver.getWindowHandle();
		System.out.println("The parent window is:"+parentWindow);
		
		//Click newWindow 3 times
		for(int i = 1; i<=3; i++)
		{
			driver.findElement(By.xpath("//button[normalize-space()='New Window']")).click();
			Thread.sleep(2000);
		}
		
		//print the window handles
		Set<String> windowhandles = driver.getWindowHandles();
		for(String handles:windowhandles)
		{
			System.out.println("The window handles are:"+handles);
			
			//Switching
			driver.switchTo().window(handles);
			driver.navigate().to("https://www.google.com/");
			driver.manage().window().maximize();
		}
		
		   driver.close();
		
		
   }
}

package com.project.SeleniumTutorialsByVARSHA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle_URL {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		String str = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(str);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		
		String act_title = driver.getTitle();
		System.out.println(act_title);
		
		String desired_title = "OrangeHRM";
		
		if(act_title.equals(desired_title))
		{
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
		String act_current_url = driver.getCurrentUrl();
		System.out.println(act_current_url);
		
		String desired_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		if(act_current_url.equals(desired_url))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		String page_source = driver.getPageSource();
		System.out.println(page_source);
		
		driver.close();
		driver.quit();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

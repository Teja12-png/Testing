package com.project.SeleniumTutorialsByVARSHA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOftagNames {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("The No.of tagnames are:"+elements.size());
		// TODO Auto-generated method stub

		for(WebElement ele: elements)
		{
			System.out.print(ele.getText());
		}
	}

}

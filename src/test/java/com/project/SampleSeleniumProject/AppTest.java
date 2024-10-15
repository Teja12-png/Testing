
package com.project.SampleSeleniumProject;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




/**
 * Unit test for simple App.
 */


public class AppTest{
	
	@Test
	public void TestCamel() {
	
		WebDriver driver = new ChromeDriver();
//		Scanner scan = new Scanner(System.in);
		String url = "https://demo.nopcommerce.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		 
	
	}
	
}

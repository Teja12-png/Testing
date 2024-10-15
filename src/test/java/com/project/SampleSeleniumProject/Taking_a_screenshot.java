package com.project.SampleSeleniumProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Taking_a_screenshot {
	@Test
	public void screenshot() throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		String url = "https://iamsandesh23.github.io/selenium.github.io/";
		driver.get(url);
		System.out.println(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenShot, new File("D:\\Automation_testing_Java\\SampleSeleniumProject\\ScreenShot//screenShot1"));
	    
	}

}

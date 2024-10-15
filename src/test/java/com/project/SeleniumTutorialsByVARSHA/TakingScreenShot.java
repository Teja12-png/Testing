package com.project.SeleniumTutorialsByVARSHA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenShot {
	@Test
	public void screenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File trg = new File("HomePage.png");
//		FileUtils.copyFile(src, trg);
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src  = ts.getScreenshotAs(OutputType.FILE);
//		File trg = new File("HomePage.png");
//		FileUtils.copyFile(src, trg);
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File trg = new File(".\\ScreenShot\\Homepage.png");
//		FileUtils.copyFile(src, trg);
//		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\ScreenShot\\Homepage.png");
		FileUtils.copyFile(src, trg);
		
		driver.close();
		
		
	}

}

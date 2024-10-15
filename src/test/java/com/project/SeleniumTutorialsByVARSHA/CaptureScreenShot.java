package com.project.SeleniumTutorialsByVARSHA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenShot {
	@Test
	public void ScreenShot() throws IOException {
		WebDriver driver = new ChromeDriver();
		String str = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(str);
		driver.manage().window().maximize();
		
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\ScreenShot\\Homepage.png");
		FileUtils.copyFile(src, trg);
		
		driver.close();
		
	}

}

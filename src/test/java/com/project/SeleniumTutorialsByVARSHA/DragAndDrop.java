package com.project.SeleniumTutorialsByVARSHA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	

	private WebElement drag;
	@Test

	public void DragDrop() {
	
	
		WebDriver driver = new ChromeDriver();
		String url = "http://omayo.blogspot.com/p/page3.html";
		driver.get((url));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='ui-slider-bg ui-btn-active']"));
		Actions action = new Actions(driver);
		
	
		action.dragAndDropBy(drag, +100, 0).perform();
		
		
	}

}

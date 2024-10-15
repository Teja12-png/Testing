package SeleniumByPavan;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//gettitle
		//getcuurenturl
		//geturl
		//getpagesource
		//getwindowhandle
		//getwindowhandles
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String windowid = driver.getWindowHandle();//returns single ID of the browser
		System.out.println("Window ID is:"+windowid);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowHandles = driver.getWindowHandles();//returns multiple ID's of the browser
		System.out.println(windowHandles);
		driver.quit();
	

	}

}

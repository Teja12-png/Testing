package com.project.SeleniumTutorialsByVARSHA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpath_Axes {
	@Test
	public void adv_xpath() {

		
		WebDriver driver = new ChromeDriver();
		String url = "https://money.rediff.com/gainers/bse/daily/groupa";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		//Self Node
		
		 String self_node = driver.findElement(By.xpath("//a[normalize-space()='DLF Ltd.']/self::a")).getText();
		 System.out.println("The self node elements are:"+self_node);
		 
	     
		 //parent node
		 String parent_node= driver.findElement(By.xpath("//a[normalize-space()='DLF Ltd.']/parent::td")).getText();
		 System.out.println("The parent node is"+parent_node);
		 
		 //Child_node
		 List<WebElement> child_node = driver.findElements(By.xpath("//a[normalize-space()='DLF Ltd.']/ancestor::tr/child::td"));
		 System.out.println("The child nodes are"+child_node.size());
		 
		 for(WebElement ele: child_node)
		 {
			 System.out.println(ele.getText());
		 }
		 
		 //Ancestor node
		String ancestor_node = driver.findElement(By.xpath("//a[normalize-space()='DLF Ltd.']/ancestor::tr")).getText();
		System.out.println("The Ancestor  node is:"+ancestor_node);
		
		//Following nodes
		List<WebElement> following_nodes = driver.findElements(By.xpath("//a[normalize-space()='DLF Ltd.']/following::*"));
		System.out.println("THe following nodes are:"+following_nodes.size());
		
		//following sibling
		List<WebElement> following_sibling = driver.findElements(By.xpath("//a[normalize-space()='DLF Ltd.']/ancestor::tr/following-sibling::*"));
		System.out.println("The no.of following sibling present on the current HTML tag is:"+following_sibling.size());
		
		// Preceding node
		List<WebElement> preceding_node = driver.findElements(By.xpath("//a[normalize-space()='DLF Ltd.']/preceding::*"));
		System.out.println("The preceding nodes are:"+preceding_node.size());
		
		//preceding sibling
		List<WebElement> preceding_sibling = driver.findElements(By.xpath("//a[normalize-space()='DLF Ltd.']/ancestor::tr/preceding-sibling::*"));
		System.out.println("The preceding sibling are:"+preceding_sibling);
		
		//Descendant nodes
		List<WebElement> descendant_node = driver.findElements(By.xpath("//a[normalize-space()='DLF Ltd.']/ancestor::tr/descendant::*"));
		System.out.println("The descendant nodes are:"+descendant_node.size());
		
		for(WebElement des: descendant_node)
		{
			System.out.println(des.getText());
		}
		
		
		
		
		driver.close();
	}

}

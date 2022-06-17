package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/HTML30May2022/CSSSelector.html");
		driver.manage().window().maximize();
		
		//First Name
		
		driver.findElement(By.cssSelector("input[id='A']")).sendKeys("Manual");

		//Middle Name
		
		driver.findElement(By.cssSelector("input[class='mname']")).sendKeys("Automation");
		//Last name
		
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Testing");
		
		
		
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/HTML30May2022/TagName2.html");
		
		driver.manage().window().maximize();
		
		//First name
		
		
		driver.findElement(By.tagName("input")).sendKeys("Sachin");
		
		//Middle Name
		
		driver.findElement(By.tagName("input")).sendKeys("Ramesh");
		
		
		
		
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/HTML30May2022/Name.html");
		
		driver.manage().window().maximize();
		
		//First Name
		
		driver.findElement(By.tagName("input")).sendKeys("Akshay");
		
		//Middle Name
		
		driver.findElement(By.id("mname")).sendKeys("Aakash");
		
		//Last Name
		
		driver.findElement(By.name("lname")).sendKeys("Kumar");
		
		
		
	}

}

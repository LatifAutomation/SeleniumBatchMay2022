package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/HTML30May2022/ClassName.html");
		driver.manage().window().maximize();
		
		//First Name
		
		driver.findElement(By.tagName("input")).sendKeys("Manual");
		
		//Middle Name
		
		driver.findElement(By.id("mname")).sendKeys("Automation");
		
		//Last Name
		driver.findElement(By.name("lname")).sendKeys("Testing");
		
		//Email
		
		driver.findElement(By.className("email")).sendKeys("abc@gmail.com");
		
		//Mobile
		driver.findElement(By.className("phone")).sendKeys("75567789809");
		

	}

}

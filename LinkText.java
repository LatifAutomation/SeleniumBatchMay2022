package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/HTML30May2022/Link.html");
		
		driver.manage().window().maximize();
		
		
		//Register Link
		
		driver.findElement(By.linkText("Register")).click();
		
		
	}

}

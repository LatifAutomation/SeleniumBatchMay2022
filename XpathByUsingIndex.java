package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByUsingIndex {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///D:/HTML30May2022/XpathByIndex.html");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//input[1]")).getText());

	}

}

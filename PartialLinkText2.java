package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText2 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/HTML30May2022/PartialLinkText.html");
		
		driver.manage().window().maximize();
		
		//Link2
		
		String txt = driver.findElement(By.partialLinkText("2")).getText();
		
		System.out.println(txt);
		
		
		
		
	}

}

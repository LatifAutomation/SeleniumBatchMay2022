package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/HTML30May2022/Absolutexpath.html");
		driver.manage().window().maximize();
		
		//First Name
		
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("Manual");
		
		//Help
		
		driver.findElement(By.xpath("html/body/div[3]/a[2]")).click();
		
		
		

	}

}

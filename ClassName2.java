package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Email
		driver.findElement(By.className("inputtext")).sendKeys("abc@gmail.com");
		
		//Password
		driver.findElement(By.className("_9npi")).sendKeys("Test@1234");
		
		
	}

}

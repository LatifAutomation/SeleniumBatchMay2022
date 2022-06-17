package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Email
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@gmail.com");
		
		//Password
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Test@12345");
		
		//Login
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorByClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Email
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcdfg@gmail.com");
		
		//Login by using class
		
		driver.findElement(By.cssSelector("button._6lth")).click();
	
	}

}

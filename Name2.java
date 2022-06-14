package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Email Id 
		
		
		driver.findElement(By.name("email")).sendKeys("xfas@gmail.com");
		
		//Passsword
		
		driver.findElement(By.name("pass")).sendKeys("Tes@1234");
		
		//Login
		driver.findElement(By.name("login")).click();
		
		
		
		
	}

}

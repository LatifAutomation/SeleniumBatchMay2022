package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//Maximize the window
		
		//driver.manage().window().maximize();
		
		
		int ht = driver.manage().window().getSize().getHeight();
		
		System.out.println(ht);
		
		int wdt = driver.manage().window().getSize().getWidth();
		System.out.println(wdt);
		
		
		int xco = driver.manage().window().getPosition().getX();
		System.out.println(xco);
		
		int yco = driver.manage().window().getPosition().getY();
		System.out.println(yco);
		
		
		
		
	}

}

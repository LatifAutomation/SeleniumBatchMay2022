package Basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Point p=new Point(90,50);
		
		driver.manage().window().setPosition(p);
		
		
		
	}

}

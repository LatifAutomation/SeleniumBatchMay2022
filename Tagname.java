package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/HTML30May2022/TagName.html");
		
		//Locate Firstname
		
		
	/*WebElement ele = driver.findElement(By.tagName("input"));
	
	ele.sendKeys("Ramesh");*/
		
		/*By ab = By.tagName("input");
		WebElement bc = driver.findElement(ab);
		bc.sendKeys("Suresh");*/
		
		
		driver.findElement(By.tagName("input")).sendKeys("Ganesh");
		
		

	}

}

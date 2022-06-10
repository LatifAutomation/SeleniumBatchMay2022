package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURL {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.educative.io/");
		
		
		System.out.println(driver.getTitle());
		
		
		System.out.println(driver.getCurrentUrl());
	}
}

package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApplication {

	public static void main(String[] args) 
	{
		ChromeDriver abc=new ChromeDriver();
		
		abc.get("https://www.amazon.in/");

	}

}

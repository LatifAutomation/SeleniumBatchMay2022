package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String acttitle = driver.getTitle();
		
		System.out.println(acttitle);
		
	}

}

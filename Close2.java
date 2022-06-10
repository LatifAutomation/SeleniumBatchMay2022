package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.Naukri.com");
		
		driver.close();

	}

}

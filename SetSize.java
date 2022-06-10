package Basics;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//Set size
		
		Dimension d=new Dimension(240,300);
		
		
		driver.manage().window().setSize(d);
		

	}

}

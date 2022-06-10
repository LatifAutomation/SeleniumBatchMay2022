package Naviagation;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigaetBack {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		Thread.sleep(3000);
		
		//open Amazon Application
		
		driver.get("https://www.amazon.in/");
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		Thread.sleep(3000);
		
		//Navigate  backward 
		
		
		driver.navigate().back();
		
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		
	}

}

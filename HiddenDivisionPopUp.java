package AlertsAndpopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Forgotten password?")).click();

		
		driver.findElement(By.xpath("//input[@class='inputtext _9o1w']")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//button[@id='did_submit']")).click();
	}

}

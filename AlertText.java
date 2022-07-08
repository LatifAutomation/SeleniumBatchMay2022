package AlertsAndpopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertText {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/popups#");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("alert")).click();
		
		Alert al=driver.switchTo().alert();
		
		String tx = al.getText();
		System.out.println(tx);

	}

}

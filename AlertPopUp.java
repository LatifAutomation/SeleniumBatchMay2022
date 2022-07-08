package AlertsAndpopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/popups#");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("confirmation")).click();
		
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(300);
		
		
		//Alert Text
		
		String text = al.getText();
		System.out.println(text);
		
		//Click on Ok
		//al.accept();
		
		//cancel
		
		al.dismiss();
		

	}

}

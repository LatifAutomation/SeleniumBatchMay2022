package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement signIn = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		
		
		Actions act=new Actions(driver);
		
		//Mouse movement
		
		act.moveToElement(signIn).perform();
		
		
		
		
		

	}

}

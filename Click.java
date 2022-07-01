package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify the elemnet on which you need to perform the action
		
		WebElement srch = driver.findElement(By.id("twotabsearchtextbox"));
		
		//Create a object of Actions class
		
		Actions act=new Actions(driver);
		
		//Perform the action
		
		act.sendKeys(srch, "Mobile").perform();
		
		WebElement srbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		act.click(srbtn).perform();
		
		
		
		
		

	}

}

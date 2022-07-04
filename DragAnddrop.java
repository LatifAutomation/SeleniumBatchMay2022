package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnddrop {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.id("column-a"));
		
		WebElement dest = driver.findElement(By.id("column-b"));
		
		
		Actions act=new Actions(driver);
		
		//act.dragAndDrop(src, dest).build().perform();
		
		act.clickAndHold(src).moveToElement(dest).release(src).build().perform();
		
		
		
		

	}

}

package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@class='gb_d']"));
		
		Actions act=new Actions(driver);
		
		//act.moveByOffset(ele.getLocation().getX()+1, ele.getLocation().getY()+1).perform();
	}	

}

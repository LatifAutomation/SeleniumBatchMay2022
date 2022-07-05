package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop6 {

	public static void main(String[] args)
	{
		
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		
		
		WebDriver driver=new ChromeDriver(opt);
        driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		
        Actions at=new Actions(driver);
        
        at.dragAndDrop(src, dest).perform();     
        
		
		
		
	}

}

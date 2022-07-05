package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldRelease {

	public static void main(String[] args) 
	{
		//Handling the certificate
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		
		
		WebDriver driver=new ChromeDriver(opt);
        driver.get("https://demoqa.com/droppable/");
		//driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		
        Actions at=new Actions(driver);
        
       
        
      /* at.clickAndHold(src).perform();
       
       at.moveToElement(dest).perform();
       
       at.release(src).perform();*/
        
      //  at.clickAndHold(src).moveToElement(dest).release(src).build().perform();
       
       //at.dragAndDropBy(src, 80, 100).build().perform();
        
       at.moveByOffset(40, 60).perform();
        
        
       
      
        
		
		

	}

}

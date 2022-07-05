package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop5 {

	public static void main(String[] args) throws InterruptedException 
	{

     WebDriver driver=new ChromeDriver();
     driver.get("file:///D:/HTML30May2022/DragAnddrop.html");
     driver.manage().window().maximize();
     Thread.sleep(300);
     
     //
     
    WebElement src = driver.findElement(By.xpath("//img[@id='dragData']"));
    
    WebElement dest = driver.findElement(By.xpath("//div[@id='getData']"));
     
    
    Actions act=new Actions(driver);
    
    //Action
    
    
    act.dragAndDrop(src, dest).build().perform();
     

	}

}

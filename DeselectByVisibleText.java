package HandLingList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		
		driver.manage().window().maximize();
		
		WebElement drp = driver.findElement(By.id("cars"));
		
		Select sel=new Select(drp);
		
		sel.selectByIndex(2);
		sel.selectByValue("saab");
		sel.selectByValue("maruti");
		sel.selectByVisibleText("Audi");
		
		Thread.sleep(300);

		sel.deselectByVisibleText("Saab");
		
	}

}

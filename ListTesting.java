package HandLingList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListTesting extends MultiPleUseClass{

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		
		MultiPleUseClass mp=new MultiPleUseClass();
		
		WebElement drplist = driver.findElement(By.id("cars"));
		
		mp.selectByIndex(drplist, 2);
		
		
		mp.selectByValue(drplist, "audi");
		mp.selectByVisibleText(drplist, "Saab");
		
		mp.selectByIndex(drplist, 4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

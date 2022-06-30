package HandLingList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://chercher.tech/practice/popups");
		
		driver.manage().window().maximize();
		
		WebElement abc = driver.findElement(By.id("first"));
		
		Select sel=new Select(abc);
		
		sel.selectByIndex(2);
		
		
		
	}

}

package HandLingList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByvalue {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify the elements
		
		WebElement lst = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel=new Select(lst);
		
		//Select By value
		
		sel.selectByValue("search-alias=fashion");
		

	}

}

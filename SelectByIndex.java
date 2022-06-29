package HandLingList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		// Identify the element
		WebElement dropdwn = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		dropdwn.click();
		//Create a object of select class
		
		
		Select sel=new Select(dropdwn);
		
		// Perform the action
		
		sel.selectByIndex(15);
		
		
		
		

	}

}

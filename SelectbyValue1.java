package HandLingList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectbyValue1 {

	public static void main(String[] args)
	{
         WebDriver driver=new FirefoxDriver();
		
		driver.get("https://chercher.tech/practice/popups");
		
		driver.manage().window().maximize();
		
		//Identify the element
		
		WebElement lst = driver.findElement(By.xpath("//select[@id='first']"));
		
		Select sel=new Select(lst);
		
		//Selct by value
		
		sel.selectByValue("Apple");
		

	}

}

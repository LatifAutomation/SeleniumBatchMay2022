package HandLingList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class IsMultiple {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/HTML30May2022/Select.html");
		
		driver.manage().window().maximize();
		
		WebElement abc = driver.findElement(By.id("Fruits"));
		
		Select sel=new Select(abc);
		//Check the drop down is multiselected or not
		
		if(sel.isMultiple())
		{
			System.out.println("Drop-down is multiselected");
			
		}
		
		else
		{
			System.out.println("Drop down is not multiselected");
		}
		
		sel.selectByIndex(2);
		
		sel.selectByIndex(4);
		
		sel.deselectByIndex(4);
		
		
		
		
		
	}

}

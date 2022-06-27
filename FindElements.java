package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Identify all the links
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		
		
		int sz = ele.size();
		
		System.out.println(sz);
		
		int visible=0;
		int nonvisible=0;
		for(int i=0;i<sz;i++)
		{
			WebElement fe = ele.get(i);
			
			if(fe.isDisplayed())
			{
			String txt = fe.getText();
			System.out.println(txt);
			visible++;
			
			}
			
		else
			{
				System.out.println("Element is not visible");
				nonvisible++;
			}
			
		}
		System.out.println("Count of visible elements are:"+visible);
		System.out.println("Count of Non-visible elements are:"+nonvisible);
		

	}

}

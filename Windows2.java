package AlertsAndpopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/popups");
		driver.findElement(By.xpath("//input[@value='Open Multiple Windows']")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();
		
		
		Iterator<String> it = childs.iterator();
		
		
		while(it.hasNext())
		{
			String cids = it.next();
			
			//System.out.println(driver.switchTo().window(cids).getTitle());
			
			String titles = driver.switchTo().window(cids).getTitle();
			
			if(titles=="Google")
			{
				driver.switchTo().window(cids).manage().window().maximize();
			}
			
		}
		

		
	}
}

	



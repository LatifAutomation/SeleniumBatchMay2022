package AlertsAndpopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsBasesPopup {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		//driver.manage().window().maximize();
		
		
		String prid = driver.getWindowHandle();
		
		System.out.println(prid);
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> cids = driver.getWindowHandles();
		System.out.println(cids);
		
		
		
		//Iterator<String> it=cids.iterator();
		
		Iterator<String> it = cids.iterator();
		
		while(it.hasNext())
		{
			String parent = it.next();
			
			String child = it.next();
			
			String ptitle = driver.getTitle();
			System.out.println(ptitle);
			
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			//driver.manage().window().maximize();
			
			//driver.switchTo().window(parent);
			
			
			//Parent window
			driver.switchTo().defaultContent();
			System.out.println(driver.getTitle());
			
			
		}
		
		//should closes the windows
		//driver.close();
		
		driver.quit();
		
		
		
		
		
	}

}

package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown_ScrollUp {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		//act.keyDown(Keys.END).perform();
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		Thread.sleep(300);
		
		act.sendKeys(Keys.HOME).perform();
		
	}

}

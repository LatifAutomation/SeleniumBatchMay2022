package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabled {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
		
		//Search button
		WebElement srcbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' or @value='Go']"));

		
		if(srcbtn.isEnabled())
		{
			srcbtn.click();
		}
		else
		{
			System.out.println("Button is not enabled");
		}
	}

}

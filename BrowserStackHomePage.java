package PageObjectModel;

import static org.testng.Assert.assertEquals;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserStackHomePage 
{

	//Declaration
	
	
	
	private WebElement header;
	private WebElement getStartedFreebtn;
	private WebElement signinBtn;
	
	//Initialization
	
	
	public BrowserStackHomePage(WebDriver driver) 
	{
		
		header=driver.findElement(By.xpath("//h1"));
		
		getStartedFreebtn=driver.findElement(By.xpath("//a[@id='signupModalButton']"));	
		
	}
	
	
	//utilization
	
	public void verifyHeader()
	{
		String expectedHeader = "App & Browser Testing Made Easy";
		
		String actualHeader = header.getText();
		
		assertEquals(expectedHeader,actualHeader);
		
		
	}
	
	
	public void getStartedFreeClick()
	{
		getStartedFreebtn.click();
	}
	
}

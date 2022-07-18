package PageFactory;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackHoemPage 
{

	WebDriver ldriver;
	
	@FindBy(xpath="//h1") 
	WebElement header;
	
	@FindBy(xpath="//a[@title='Sign In']")
	WebElement signInbtn;
	
	@FindBy(id="signupModalButton")
	WebElement signupbtn;
	
	
	public BrowserStackHoemPage(WebDriver driver)
	{
		this.ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyHeader()
	{
		String expectedHeader = "App & Browser Testing Made Easy";
		
		String actualHeader = header.getText();
		
		assertEquals(expectedHeader,actualHeader);
		
		
	}
	
	
	public void getStartedFreeClick()
	{
		signupbtn.click();
	}
	
	public void getSignInClick()
	{
		signInbtn.click();
	}
	
	
	
	
}

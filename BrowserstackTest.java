package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserstackTest {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//Home page
		BrowserStackHomePage hp=new BrowserStackHomePage(driver);
		
		hp.verifyHeader();
		hp.getStartedFreeClick();
		
		
		//SignUp
		
		BrowserStack_SignUpPage sp=new BrowserStack_SignUpPage(driver);
		sp.verifyHeader();
		sp.enterFullName("Test User");
		sp.enterPassword("Test@123456");
		sp.enterEmail("testfefefergr@test.com");
		Thread.sleep(300);
		sp.checkBoxClick();
		sp.verifyTandC();
		sp.signMeUpClick();
		
		
	}

}

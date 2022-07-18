package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		BrowserStackHoemPage hp=new BrowserStackHoemPage(driver);
		hp.verifyHeader();
		hp.getStartedFreeClick();
		
		
		
		BrowserStack_SignUpPage sp=new BrowserStack_SignUpPage(driver);
		
		sp.verifyHeader();
		sp.enterFullName("test");
		sp.enterEmail("testingbdudufji@gmail.com");
		sp.enterPassword("Test@1234");
		Thread.sleep(300);
		sp.checkBoxClick();
		sp.signMeUpClick();
		
	}

}

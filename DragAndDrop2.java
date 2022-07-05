package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragAndDrop2 {

	public static void main(String[] args) 
	{
		
		
		        /*DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ();       
				handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				WebDriver driver = new ChromeDriver (handlSSLErr);
		        driver.get("https://demoqa.com/droppable/");
				driver.manage().window().maximize();*/
		
		         /*options = WebDriver.ChromeOptions();
				options.add_argument('--ignore-ssl-errors=yes')
				options.add_argument('--ignore-certificate-errors')
				driver = webdriver.Chrome(options=options);*/
		
		
		        /*options = WebDriver.ChromeOptions();
				options.add_argument('--ignore-ssl-errors=yes');
				options.add_argument('--ignore-certificate-errors');
				driver = webdriver.Chrome(options=options);*/
				
				
				/*ChromeOptions handlingSSL = new ChromeOptions();
				handlingSSL.setAcceptInsecureCerts(true);
				WebDriver driver=new ChromeDriver(handlingSSL);*/
		
		       FirefoxOptions h=new FirefoxOptions();
		       h.setAcceptInsecureCerts(true);
		       WebDriver driver=new FirefoxDriver(h);
				
				
				
				driver.get("https://demoqa.com/droppable/");
				driver.manage().window().maximize();
				
				//src
				
				WebElement src = driver.findElement(By.id("draggable"));
				WebElement trgt = driver.findElement(By.id("droppable"));
				
				Actions act=new Actions(driver);
				
				//act.dragAndDrop(src, trgt).build().perform();
				
				/*act.clickAndHold(src).perform();
				act.moveToElement(trgt).perform();
				act.release(src).perform();*/
				
				act.clickAndHold(src).moveToElement(trgt).release(src).build().perform();
				
				//act.moveToElement(src, 120, 100).build().perform();
				
				
	}

}

package PageObjectModel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserStack_SignUpPage 
{
   
	//Declaration
	
	private WebElement header;
	private WebElement fname;
	private WebElement bemail;
	private WebElement pwd;
	private WebElement chekbx;
	private WebElement signmeup;
	private WebElement termc;
	
	
	//Initialization
	
	public BrowserStack_SignUpPage(WebDriver driver)
	{
		header=driver.findElement(By.xpath("//h1[@class='heading']"));
		fname=driver.findElement(By.id("user_full_name"));
		bemail=driver.findElement(By.id("user_email_login"));
		pwd=driver.findElement(By.id("user_password"));
		chekbx=driver.findElement(By.name("terms_and_conditions"));
		signmeup=driver.findElement(By.id("user_submit"));
		termc=driver.findElement(By.xpath("//a[@class='minitext terms-url']"));
	}
	
	
	
	//Utilization
	
	public void verifyHeader()
	{
		String expectedHeader = "Create a FREE Account";
		
		String actualHeader = header.getText();
		
		assertEquals(actualHeader,expectedHeader);
		
		
	}
	
	public void enterFullName(String fullname)
	{
		fname.sendKeys(fullname);
		
	}
	
	public void enterEmail(String email)
	{
		bemail.sendKeys(email);
	}
    public void enterPassword(String password)

    {
    	pwd.sendKeys(password);
    }
    
    public void checkBoxClick()
    {
    	chekbx.click();
    }
    
    public void signMeUpClick()
    {
    	signmeup.click();
    }
   
    public void verifyTandC()
    {
    	System.out.println(termc.isDisplayed());
    }

}

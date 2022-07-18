package PageFactory;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStack_SignUpPage 
{
   
	@FindBy(xpath="//h1[@class='heading']")
	private WebElement header;
	
	@FindBy(id="user_full_name")
	private WebElement fname;
	
	@FindBy(id="user_email_login")
	private WebElement bemail;

	@FindBy(id="user_password")
	private WebElement pwd;
	
	@FindBy(name="terms_and_conditions")
	private WebElement chekbx;
	
	@FindBy(id="user_submit")
	private WebElement signmeup;
	
	@FindBy(xpath="//a[@class='minitext terms-url']")
	private WebElement termc;
	
	
	
	public BrowserStack_SignUpPage(WebDriver drbncjnbfjniver)
	{
		PageFactory.initElements(drbncjnbfjniver, this);
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

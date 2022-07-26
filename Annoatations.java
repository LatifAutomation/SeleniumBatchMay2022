package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annoatations extends FirstClass {
  
	WebDriver driver;
	
	@Test
	
	public void testcase1()
	{
		System.out.println(" I am in Test case 1");
	}
	
		
  @Test
	
	public void testcase2()
	{
		System.out.println(" I am in Test case 2");
	}
	
  
  
  
  @BeforeTest
  
  public void beforetest()
  {
	  System.out.println(" I am running before Test");
  }
  
 
  @AfterTest
  
  public void afterTest()
  {
	  System.out.println(" I am in After Test");
  }
  @BeforeClass
  
  public void beforeclass()
  {
	  System.out.println("Running the before class");
  }
  
  
  @AfterClass
  public void afterclaass()
  {
	  System.out.println(" Running the afer class");
  }
  
 @BeforeMethod
  
  public void beforeMethod()
  {
	  System.out.println(" I will run before running any test method");
	 //driver=new ChromeDriver();
	  
  }
	
  
  @org.testng.annotations.AfterMethod
  
  public void AfterMethod()
  {
	  System.out.println(" I will run After running any test method");
	  //driver.close();
  }
  
  
	
}

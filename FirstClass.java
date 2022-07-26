package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstClass 
{
  
	@BeforeSuite
	
	public void beforesuit()
	{
		System.out.println(" Before suite execution");
	}
	
	
   @AfterSuite
	
	public void aftersuit()
	{
		System.out.println(" After suite execution");
	}
	
	
   @BeforeClass
   public void bc()
   {
	   System.out.println(" I am in before class of Firest class");
   }
   
   @AfterClass
   public void ac()
   {
	   System.out.println(" I am in After class of Firest class");
   }
   
   
	@Test(priority=1)
	public void second()
	{
		System.out.println(" I am in second test case");
	}
	
	@Test(priority=0)
	public void akash()
	{
		System.out.println("I am in Third Test case");
	}
	
	@Test(priority=0)
	public void First()
	{

		System.out.println("This is my First Test case");
	}
	
	@Test(priority=-1)
	public void fourth()
	{
		System.out.println("I am in Fourth Test case");
	}
	
	@Test(priority=4)
	public void fifth()
	{
		System.out.println("I am in Fifth Test case");
	}
	
}


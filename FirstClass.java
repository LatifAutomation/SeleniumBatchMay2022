package TestNG;

import org.testng.annotations.Test;

public class FirstClass 
{
  
	
	
	
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


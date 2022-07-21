package TestNG;

import org.testng.annotations.Test;

public class InvocationCount
{
 
	@Test(invocationCount=5)
	
	public void login()
	{
		System.out.println(" Login with User");
	}
	
	
    @Test(timeOut=500)
	
	public void register()
	{
		System.out.println(" User Registartion");
	}


  @Test

   public void logout()
  {
	System.out.println(" User logout");
   }
	
	
	
}

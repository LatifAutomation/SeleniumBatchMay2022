package TestNG;

import org.testng.annotations.Test;

public class TestDescription 
{
  
	@Test(description="This is Tets case for Login")
	public void login()
	{
		System.out.println("Login");
	}
	
	@Test(description="This tets case for registartion",priority=2)
	public void register()
	{
		System.out.println("Registartion");
	}
	
	@Test(description="This test casee for purchase",priority=1)
	public void purchase()
	{
		System.out.println("Purchase");
	}
	@Test(description="This tets case for Paymenyt",priority=-2)
	public void payment()
	{
		System.out.println("Payment");
	}
	
	@Test(description="to try depends on Methods",dependsOnMethods= {"payment","register"})
	public void logout()
	{
		System.out.println("Logout");
	}
	
	
}

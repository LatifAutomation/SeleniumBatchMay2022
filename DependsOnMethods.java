package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethods
{
  
	
	
	@Test
	public void registartion()
	{
		System.out.println("Registartion successfull.");
	}
	
	
	@Test(dependsOnMethods="login")
	public void productsearch()
	{
		System.out.println(" Product search successfully");
	}
	
	
	@Test(dependsOnMethods="payment")
	public void report()
	{
		System.out.println(" Report Generated successfully");
	}
	
	
	@Test(dependsOnMethods="addtoCart")
	public void payment()
	{
		System.out.println(" Payment done successfully");
	}
	
  @Test(dependsOnMethods="registartion")
   public void login()
	{
		System.out.println("User login successfull");
	}
	
	@Test(dependsOnMethods= {"report","payment"})
	public void logout()
	{
		System.out.println(" Logout successfully");
	}
	
	@Test(dependsOnMethods="productsearch")
	public void addtoCart()
	{
		System.out.println("Product added to cart");
	}
	
}

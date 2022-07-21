package TestNG;

import org.testng.annotations.Test;

public class TestCaseSkip 
{
	@Test()
	public void A()
	{
		System.out.println(" I am in Test case-A");
	}
	
	
	@Test
	public void B()
	{
		System.out.println(" I am in Test case-B");
	}
	
	
	
	@Test
	public void C()
	{
		System.out.println(" I am in Test case-C");
	}
	
	
	
	@Test(enabled=false)
	public void Z()
	{
		System.out.println(" I am in Test case-Z");
	}
	
	
	@Test
	public void D()
	{
		System.out.println(" I am in Test case-D");
	}
	
	@Test(enabled=false)
	public void E()
	{
		System.out.println(" I am in Test case-E");
	}
	
	
	@Test
	public void F()
	{
		System.out.println(" I am in Test case-F");
	}
	
	
	
	
}

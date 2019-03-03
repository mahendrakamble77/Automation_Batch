package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing2 {
	
	
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("Before Test Module2");
	}
	
	@AfterClass
	public void afterModule()
	{
		System.out.println("After Test Module2");
	}
	
	
	
	@BeforeMethod
	public void beforeTestScript()
	{
		System.out.println("Before Test Script2");
	}
	
	@AfterMethod
	public void afterTestScript()
	{
		System.out.println("After Test Script2");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Login 2 Test Case");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Logout 2 Test Case");
	}

}

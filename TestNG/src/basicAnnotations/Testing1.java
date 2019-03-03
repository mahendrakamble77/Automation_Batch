package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testing1 {
	
	
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("Before Test Module");
	}
	
	@AfterClass
	public void afterModule()
	{
		System.out.println("After Test Module");
	}
	
	
	
	@BeforeMethod
	public void beforeTestScript()
	{
		System.out.println("Before Test Script");
	}
	
	@AfterMethod
	public void afterTestScript()
	{
		System.out.println("After Test Script");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Login Test Case");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Logout Test Case");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Test Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Test Suite");
	}

}

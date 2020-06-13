package basicsOfTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	
	@BeforeClass
	public void LaunchBrowser()
	{
		System.out.println("Launch browser : Class");
	}
	
	@BeforeMethod
	public void EnterURL()
	{
		System.out.println("Enter URL : Method");
	}
	
	@BeforeSuite
	public void SetProperty()
	{
		System.out.println("set property : Suite");
	}
	
	@BeforeTest
	public void TestItem()
	{
		System.out.println("run before test");
	}
	//test case
	@Test(priority =0,groups= "Smoke")
	public void test1()
	{
		System.out.println("Test case1");
	}

	@Test(priority =1,groups = "Smoke",dependsOnMethods="test1")
	public void test2()
	{
		System.out.println("test case 2");
	}
	
	@Test(priority =2)
	public void test3()
	{
		System.out.println("Test case 3");
	}

	@Test(groups="Sanity test",dependsOnGroups="Smoke")
	public void test4()
	{
		System.out.println("Test case 4");
	}
	@AfterMethod
	public static void afterMt()
	{
		System.out.println("After method");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
}

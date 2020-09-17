package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter {

//	@BeforeSuite: The annotated method will be run before all tests in this suite have run.
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeAfter Class : BeforeSuite");
	}
	
//	@AfterSuite: The annotated method will be run after all tests in this suite have run.
	@AfterSuite
	public void afterSuite() {
		System.out.println("BeforeAfter Class : AfterSuite");
	}
	
//	@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeAfter Class : BeforeTest");
	}
	
//	@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
	@AfterTest
	public void afterTest() {
		System.out.println("BeforeAfter Class : AfterTest");
	}
	
//	@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeAfter Class : BeforeClass");
	}
	
//	@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	@AfterClass
	public void afterClass() {
		System.out.println("BeforeAfter Class : AfterClass");
	}
	
//	@BeforeMethod: The annotated method will be run before each test method.
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeAfter Class : BeforeMethod");
	}
	
//	@AfterMethod: The annotated method will be run after each test method.	
	@AfterMethod
	public void afterMethod() {
		System.out.println("BeforeAfter Class : AfterMethod");
	}
	
// @Test: methods under test	
	@Test
	public void testOne() {
		System.out.println("BeforeAfter Class: Test one");
	}
	
	@Test
	public void testTwo() {
		System.out.println("BeforeAfter Class: Test Two");
	}
}

package dependencies;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.Scanner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependAnnot {

	@BeforeTest(groups = "hardDependencies")
	public void setup() {
		System.out.println("\n**********************************\nWelcome to Hard Dependencies Program \n");
	}
	@BeforeTest(groups = "softDependencies")
	public void setup1() {
		System.out.println("\n**********************************\nWelcome to Soft Dependencies Program \n");
	}
	
	@Test(groups ="hardDependencies")
	public void testOne() {
		int a=10;
		int b =20;
		assertEquals(a, b,"Values are not equal : ");
		System.out.println("Test One Passed");
	}
	@Test(dependsOnMethods = "testOne", groups = "hardDependencies")
	public void testTwo() {
		
		System.out.println("This test is dependent on testmethod: testOne");
		System.out.println("This test is Passed");
	}
	
	@Test(dependsOnGroups = "hardDependencies")
	public void testThree() {
		System.out.println("This test is dependent on hardDependencies Group");
		System.out.println("This test is Passed");
	}
	
	@Test(groups = "softDependencies")
	public void testFour() {
		assertFalse(true);
		System.out.println("Test Four Passed");
	}
	
	@Test(groups = "softDependencies", dependsOnMethods = "testFour", alwaysRun= true)
	public void testFive() {
		
		System.out.println("testFive is Dependent on testFour and is Passed");
	}	

}



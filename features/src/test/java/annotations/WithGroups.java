package annotations;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class WithGroups {

//	@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
	@BeforeGroups("demoGroup")
	public void beforeGroups() {
		System.out.println("WithGroups Class(demoGroup) : BeforeGroups");
	}
	@BeforeGroups("testGroup")
	public void beforeGroup() {
		System.out.println("WithGroups Class(testGroup) : BeforeGroups");
	}	
	
//	@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
	@AfterGroups("demoGroup")
	public void afterGroups() {
		System.out.println("WithGroups(demoGroup) Class : AfterGroups");
	}
	@AfterGroups("testGroup")
	public void afterGroup() {
		System.out.println("WithGroups(testGroup) Class : AfterGroups");
	}
	
	@Test(groups = "demoGroup")
	public void testOne() {
		System.out.println("WithGroups Class: TestOne");
	}
	@Test(groups = {"demoGroup", "testGroup"})
	public void testTwo() {
		System.out.println("WithGroups Class: TestTwo");
	}
	@Test(groups = "testGroup")
	public void testThree() {
		System.out.println("WithGroups Class: TestThree");
	}
	@Test
	public void testFour() {
		System.out.println("WithGroups Class: TestFour");
	}
	
}

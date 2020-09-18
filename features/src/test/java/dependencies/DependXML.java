package dependencies;

import static org.junit.Assert.fail;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class DependXML {
	
	
	@Test(groups = "a")
	public void testA() {
		System.out.println("Group A test Case Passed");
	}
	
	@Test(groups = "b")
	public void testB() {
		assertFalse(true);
		System.out.println("Group B test Case Passed");
	}
	
	@Test(groups = "c")
	public void testC() {
		System.out.println("Group C test Case Passed");
	}
	
	@Test(groups = "d")
	public void testD() {
		System.out.println("Group D test Case Passed");
	}
}

package factories;

import org.testng.annotations.Test;

public class SimpleTest {

	private String Name;
	public SimpleTest(String name) {
		this.Name = name;
	}
	
	@Test
	public void testName() {
		System.out.println("Name is : "+Name);
	}
}

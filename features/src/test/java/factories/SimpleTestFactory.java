package factories;

import org.testng.annotations.Factory;

public class SimpleTestFactory {
	
	@Factory
	public Object[] createInstance() {
		return new Object[] {new SimpleTest("Pawan"), new SimpleTest("Sumit"), new SimpleTest("Rohit")};
	}

}

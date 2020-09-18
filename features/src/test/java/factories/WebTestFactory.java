package factories;

import org.testng.annotations.Factory;

public class WebTestFactory {
	
	@Factory
	public Object[] createInstances() {
	
		return new Object[] {new WebTest("chrome")};
		
	}
	

}

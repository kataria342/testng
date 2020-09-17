package parameters;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UsingTestNGxml {

	@Parameters({"name", "city"})
	@Test
	public void testSingleString(String name, String city) {
		
		System.out.println("Passed Name is : " + name+ " and city is : "+city);
		
		assert "Pawan".equalsIgnoreCase(name);
	}
	
	@Parameters("name")
	@Test
	public void testOne(String name) {
		System.out.println("Passed name is "+ name);
	}
	
//	In case no parameter value is found in .xml file we can use default value	
	@Parameters("browser")
	@Test
	public void testTwo(@Optional("chrome") String browserName) {
		System.out.println("Value of Browser Passed is : "+browserName);
	}
}

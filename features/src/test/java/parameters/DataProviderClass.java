package parameters;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	
	@DataProvider(name = "create")
	public static Object[][] create(){
		return new Object[][] {{"Prabhjeet Singh", new Integer(25)}};
	}

}

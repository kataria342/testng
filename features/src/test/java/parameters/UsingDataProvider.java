package parameters;

import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {

	@DataProvider(name = "inputData")
	public Object[] inputValues() {
		Object[][] data = new Object[3][2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter Name: ");
			data[i][0] = sc.nextLine();
			System.out.print("Enter Role: ");
			data[i][1] = sc.nextLine();
		}
		sc.close();
		return data;
	}

	@Test(dataProvider = "inputData")
	public void testOne(String name, String role) {

		System.out.println("Name is : " + name + " having role : " + role);

	}

}

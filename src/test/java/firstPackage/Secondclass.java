package firstPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Secondclass {

	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("First test in seond class");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("I am Before Test");
	}

}

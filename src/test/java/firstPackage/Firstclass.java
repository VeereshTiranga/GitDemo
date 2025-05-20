package firstPackage;

import org.testng.annotations.Test;

public class Firstclass {

	@Test(groups= {"smoke"})
	public void firstTest() {
		System.out.println("First test");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Second test");
	}
	
}



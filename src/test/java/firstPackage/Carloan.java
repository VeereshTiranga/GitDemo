package firstPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Carloan {

	@Parameters({"URL" , "Username"})
	@Test
	public void webLoginCarLoan(String urlName, String userName) {
		System.out.println("WebLogin Car Loan");
		System.out.println(urlName);
		System.out.println(userName);
	}
	
	@Test(groups= {"smoke"})
	public void mobileLoginCarLoan() {
		System.out.println("MobileLogin Car Loan");
	}
	
	@Test(enabled=false)
	public void mobileSigninCarLoan() {
		System.out.println("Mobile signin Car Loan");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileSignoutCarLoan(String urlRahul) {
		System.out.println("Mobile signout Car Loan");
		System.out.println(urlRahul);
	}
	
	@Test(dependsOnMethods= {"webLoginCarLoan" , "mobileSignoutCarLoan"})
	public void ApiLoginCarLoan() {
		System.out.println("ApiLogin Car Loan");
	}
	
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("I am Before suite, I will execute at first no matter what");
	}
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("I am Before class, I will execute once before any method starts in this class, my scope is limited to this class only");
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("I am After class, I will execute once after all methods executed  in this class, my scope is limited to this class only");
	}
	
	
}

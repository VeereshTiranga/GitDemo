package firstPackage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HomeLoan {

	@Test(dataProvider="getData")
	public void webLoginHomeLoan(String username, String password, String message) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(message);
		System.out.println("WebLogin Home Loan");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println("I am After suite, I will execute at last no matter what");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileLoginHomeLoan(String urlNaukri) {
		System.out.println("MobileLogin Home Loan");
		System.out.println(urlNaukri);
	}
	
	@Test(groups= {"smoke"})
	public void ApiLoginHomeLoan() {
		System.out.println("ApiLogin Home Loan");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("I am After Test");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("I am After Method, I will execute after each and every test method in this particular class, and my scope is limited to this class only");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("I am Before Method, I will execute before each and every test method in this particular class, and my scope is limited to this class only");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[4][3];
		data[0][0]="firstUsername";
		data[0][1]="firstPassword";
		data[0][2]="firstLoginSuccess";
		
		data[1][0]="secondusername";
		data[1][1]="secondPassword";
		data[1][2]="secondLoginSuccess";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdPassword";
		data[2][2]="thirdLoginSuccess";
		
		data[3][0]="fourthusername";
		data[3][1]="fourthPassword";
		data[3][2]="fourthLoginSuccess";
		
		return data;
	}
}

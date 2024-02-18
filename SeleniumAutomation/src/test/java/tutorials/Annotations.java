package tutorials;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	
	@BeforeSuite
	public void Setup() {
		System.out.println("Setting up the drivers");
	}

	@BeforeClass
	public void Run1() {
		System.out.println("This is before class- Get the URL");
	}

	@BeforeMethod
	public void Run2() {
		System.out.println("This is before method - Enter Login credentials");
	}

	@BeforeTest
	public void Run3() {
		System.out.println("This is before test- launching the browser");
	}

	@Test
	public void Testsample() {
		System.out.println("This is the test block");
	}

	@AfterMethod
	public void Run4() {
		System.out.println("This is after method - logout from the application");
	}

	@AfterClass
	public void Run5() {
		System.out.println("This is after class - close the driver ");
		

	}

	@AfterTest
	public void Run6() {
		System.out.println("This is after test - delete some file");
	}

	@AfterSuite
	public void Run7() {
		System.out.println("This is after suite - share result");
	}

}

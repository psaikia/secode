package tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseOne {
	
	WebDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "C:\\techcode\\MyProject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void FirstTest()
	{
		System.out.println("Hello");
	}

}

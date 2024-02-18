package tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samplehello1 {

	WebDriver driver;

	@BeforeSuite
	public void Setup() {
		WebDriverManager.chromedriver().setup();

	}

	@BeforeTest
	public void LaunchBrowser() {
		driver = new ChromeDriver();
	}

	@BeforeClass
	public void GetURL() {
		driver.get("https://www.webs.com");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void Login() {
		System.out.println("Entered Login creds");
	}

	@Test
	public void Hellosample1() {

		String myTitle = driver.getTitle();
		System.out.println("This is my website title : " + myTitle);
		System.out.println(driver.getCurrentUrl());

	}

	@AfterClass
	public void CloseDriver() {
		driver.quit();
	}

}

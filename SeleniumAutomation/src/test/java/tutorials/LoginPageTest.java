package tutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	WebDriver driver;

	@BeforeSuite
	public void Setup() {
		//WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\techcode\\MyProject\\drivers\\chromedriver.exe");
	}

	@BeforeTest
	public void LaunchBrowser() {
		driver = new ChromeDriver();
	}

	@BeforeClass
	public void GettingtheURL() {
		driver.get("https://www.headspace.com/login");
		driver.manage().window().maximize();
	}

	@Test
	public void VerifyLogin() {
		driver.findElement(By.id("email")).sendKeys("hellohi@mailinator.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("Please")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hellohi@mailinator.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("hellohi@mailinator.com");

	}
}

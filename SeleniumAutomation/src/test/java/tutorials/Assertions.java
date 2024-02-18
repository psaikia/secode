package tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {

	WebDriver driver;

	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.mayoclinic.org");
		driver.manage().window().maximize();
	}

	@Test
	public void Verify1() {
		Assert.assertEquals(1, 2);
	}

	@Test
	public void Verify2() {
		Assert.assertEquals("Saikia", "Saikiaa");
	}

	@Test
	public void VerifyWebTitle() {
		String ActualWebTitle = driver.getTitle();
		String ExpectedWebTitle = ActualWebTitle;
		Assert.assertEquals(ActualWebTitle, ExpectedWebTitle);
	}

	@AfterClass
	public void Closebrowser() {
		driver.quit();
	}

}

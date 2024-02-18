package tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassnameLocator {

	WebDriver driver;

	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.mayoclinic.org");
		driver.manage().window().maximize();
	}

	@Test
	public void VerifyClassname() {
		// driver.findElement(By.className("login")).click();
		// driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Hello
		// all");
		driver.findElement(By.cssSelector(".azureSearchAutocomplete.mc-input.ui-autocomplete-input"))
				.sendKeys("Hello all");
	}

	@AfterClass
	public void Closebrowser() {
		driver.quit();
	}

}

package tutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinks {

	WebDriver driver;

	@BeforeTest
	public void Setup() {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.mayoclinic.org");
		driver.manage().window().maximize();
	}

	@Test
	public void TotalLinks() {
		List<WebElement> total_Links = driver.findElements(By.tagName("a"));
		int count = total_Links.size();
		System.out.println("The number of links available on the webpage: " + count);
		for (int i = 0; i < count; i++) {
			System.out.println(total_Links.get(i).getText());
		}
	}

	@AfterClass
	public void Closebrowser() {
		driver.quit();
	}

}

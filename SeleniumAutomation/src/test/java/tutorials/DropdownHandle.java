package tutorials;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {

	WebDriver driver;

	@BeforeTest
	public void Setup() throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		driver.manage().window().maximize();

	}
	
	@Test
	public void dropdownhandling()
	{
		Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
		//sel.selectByVisibleText("Austria");
		//sel.selectByIndex(6);
		sel.selectByValue("ARG");
	}
	

	
	
}

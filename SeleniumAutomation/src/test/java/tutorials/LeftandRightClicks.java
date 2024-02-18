package tutorials;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeftandRightClicks {

	WebDriver driver;

	@BeforeTest
	public void Setup() throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

	}
	
	@Test
	public void TestLeftRightClick() throws AWTException
	{
		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
		System.out.println(images.getLocation().getX());
		System.out.println(images.getLocation().getY());
		
		Robot r = new Robot();
		r.mouseMove(1052, 138);
	//	r.mousePress(InputEvent.BUTTON1_DOWN_MASK); // left click
		//r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK); // right click
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
	}

}

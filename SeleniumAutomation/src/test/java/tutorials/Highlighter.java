package tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tutorial.util.Helper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Highlighter {

	@Test
	public void LoginpagewithHighlighter() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.headspace.com/login");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));

		Helper.ElementHighlight(driver, email);
		email.sendKeys("helloabc@yopmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		Helper.ElementHighlight(driver, password);
		
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[3]/div/div/div/div/form/div[3]/button"));
		Helper.ElementHighlight(driver, Login);
		
		WebElement Startfree =  driver.findElement(By.xpath("//span[text()='Start free trial']"));
		Helper.ElementHighlight(driver, Startfree);
		
		

	}

}

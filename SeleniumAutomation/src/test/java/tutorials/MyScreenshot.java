package tutorials;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyScreenshot {
	
	WebDriver driver;
	
	@Test
	public void TakeScreenshot() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chromer.driver",
				// "C:\\tech\\MyProject\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File("C:\\Users\\inpsa2\\Documents\\prachujya\\tutorial\\screenshots\\testing.png"));
	}

}

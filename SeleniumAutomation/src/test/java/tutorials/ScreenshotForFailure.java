package tutorials;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tutorial.util.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotForFailure {

	WebDriver driver;

	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.headspace.com/login");

		driver.manage().window().maximize();
	}

	@Test
	public void VerifyLoginPage() {
//		String ActualWebTitle = driver.getTitle();
//
//		String ExpectedWebTitle = "Mayo Clinic - Mayo Clinicfewfwe";
//
//		Assert.assertEquals(ActualWebTitle, ExpectedWebTitle);
		driver.findElement(By.id("emailss")).sendKeys("hihello@gmail.com");

	}
	
	@AfterMethod
	public void Aftermethod(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.TakingScreenshot(driver,result.getName());
		}
	}

}

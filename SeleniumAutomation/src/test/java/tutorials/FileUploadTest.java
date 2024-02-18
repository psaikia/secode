package tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest {
	
	WebDriver driver;

	@BeforeTest
	public void Setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("file:///C:/QA/fileuploads/fileupload.html");

		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	}
	
	@Test
	public void VerifyFileUpload()
	{
		driver.findElement(By.id("fileToUpload")).sendKeys("C:\\QA\\fileuploads\\pic.jpg");
		driver.findElement(By.name("submit")).click();
	}
	

}

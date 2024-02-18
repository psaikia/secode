package tutorials;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpladingUsingAutoIT {
	
	WebDriver driver;

	@BeforeTest
	public void Setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://west-wind.com/wconnect/wcscripts/fileupload.wwd");
		

		driver.manage().window().maximize();
		
		Thread.sleep(10000);
	}
	
	@Test
	public void VerifyFileUploadRobot() throws AWTException
	{
		Robot r = new Robot();
		
		//driver.findElement(By.xpath("//input[@name=\"upload\"]")).click();
		
	StringSelection str = new StringSelection("C:\\QA\\fileuploads");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}

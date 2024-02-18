package com.tutorial.util;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Utility {
	
	public static void TakingScreenshot(WebDriver driver, String screenshotname) throws IOException
	{
	
//	File screenshotfile  = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	
//	//File screenshotfile = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(screenshotfile, new File("./Screenshots/"+screenshotname+".png"));
		
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
        ImageIO.write(s.getImage(),"PNG",new File("./Screenshots/"+screenshotname+".png"));

	}
}

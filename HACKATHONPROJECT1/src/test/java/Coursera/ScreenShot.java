package Coursera;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenShot {
	public static void GetScreenShotOfWholePage(WebDriver driver,String ScreenShotName ) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
	File Source=	ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\ScreenShots\\"+ScreenShotName+".png");
		FileUtils.copyFile(Source,target);
		
	}
	public static void GetScreenShotOfTheParticularElement(WebElement element , String ScreenShotName) throws IOException {
		
	File source=element.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir")+"\\ScreenShots\\"+ScreenShotName+".png");
	FileUtils.copyFile(source, target);
	}

}

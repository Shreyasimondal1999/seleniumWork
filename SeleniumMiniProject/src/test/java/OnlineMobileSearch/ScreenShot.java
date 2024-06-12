package OnlineMobileSearch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenShot {

	public static void getScreenShotOfWholePage(String ImageName,WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+"\\ScreenShot\\"+ImageName+".png");
		
		FileUtils.copyFile(src, target);
	}
	public static void getScreenShotOfParticullarElement(String ImageName,WebDriver driver,WebElement ele) throws IOException {
		
		File src = ele.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+"\\ScreenShot\\"+ImageName+".png");	
		FileUtils.copyFile(src, target);
	}

}

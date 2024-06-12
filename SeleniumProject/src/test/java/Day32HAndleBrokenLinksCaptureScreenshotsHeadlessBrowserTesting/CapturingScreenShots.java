package Day32HAndleBrokenLinksCaptureScreenshotsHeadlessBrowserTesting;
import java.io.File;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class CapturingScreenShots {
	public static void main(String args[]) throws Exception {
		// launching the browser by creating the object of ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//webDriver driver = new ChromeDriver(); we prefer this over using instance of specific browserDriver
		// to maximize the window 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//open url in  the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// to synchronize webisite with our next work , we will use Thread.sleep();
//		try {
//			Thread.sleep(5000);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		Thread.sleep(5000);
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//making target file 
		File target = new File("C:\\Users\\2332934\\eclipse-workspace\\SeleniumProject\\ScreenShot\\fullpage.png");
		//copying one file to another file
		FileUtils.copyFile(src, target) ;
		Thread.sleep(4000);
		//taking screen shot of a particular location(log in area)
		WebElement ele = driver.findElement(By.cssSelector("div.orangehrm-login-slot"));
		File src2 = ele.getScreenshotAs(OutputType.FILE);
		File loginsnap = new File("C:\\Users\\2332934\\eclipse-workspace\\SeleniumProject\\ScreenShot\\login.png");
		FileUtils.copyFile(src2, loginsnap);
		//provide username 
		// using locator
		WebElement txtUsername = driver.findElement(By.name("username"));
		// passing username in the txtUsername element 
		txtUsername.sendKeys("Admin");
		//provide password
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("admin123");
		//click on the login button using xpath as attribute
		
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		// verify title of the dashboard page
//		String act_title = driver.getTitle();
//		String inputTitle = "OrangeHRM";
//		if(act_title.equals(inputTitle)) {
//			System.out.println("Test passed");
//			
//		}else {
//			System.out.println("Test Failed");
//		}
		//as the dashboard page opening takes time
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//taking screen shot of dashboard page
		src=ts.getScreenshotAs(OutputType.FILE);
		//making target file 
		target = new File("C:\\Users\\2332934\\eclipse-workspace\\SeleniumProject\\ScreenShot\\fullpage1.png");
		//copying one file to another file
		FileUtils.copyFile(src, target) ;
		// validate login test by validating label of the dashboard page
		String act_label = "";
		try {
		act_label = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		} catch(Exception e) {}
		String exp_label = "Dashboard";
		if(act_label.equals(exp_label)) {
			System.out.println("Login Test passed");
			
		}else {
			System.out.println("Login Test Failed");
		}
		// closing browser
		//close() method throws exception so we can use quit() method
//		try{driver.close();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
	//	
		
		driver.quit();
		
	}

}

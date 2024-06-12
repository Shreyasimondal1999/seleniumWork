package Day24WwebdriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	public static void main(String args[]) {
		// to use the ChromeDriver we have to do , but in the newer version this is not needed 
		WebDriverManager.chromedriver().setup();
		
		// launching the browser by creating the object of ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//webDriver driver = new ChromeDriver(); we prefer this over using instance of specific browserDriver
		// to maximize the window 
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement username  = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))	;	
	    username.sendKeys("Admin");
		
		// here user name input has to wait but while providing password we do not need to wait 
	    // as it does not need any wait
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
	    driver.close();
		}
}

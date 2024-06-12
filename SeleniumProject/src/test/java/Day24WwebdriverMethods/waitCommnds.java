package Day24WwebdriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitCommnds {
	public static void main(String args[]) {
		// to use the ChromeDriver we have to do , but in the newer version this is not needed 
		WebDriverManager.chromedriver().setup();
		
		// launching the browser by creating the object of ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//webDriver driver = new ChromeDriver(); we prefer this over using instance of specific browserDriver
		// to maximize the window 
		driver.manage().window().maximize();
		// adding implicit wait for the next all scripts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		// this implicit wait command is applicable for all the other statements available in this script.
		//open url in  the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//using wrong locator//as this is a wrong locator next scripts stopped executing , so noSuchElementException thrown
		//WebElement txtUsernam = driver.findElement(By.name("usernam"));
		//txtUsernam.sendKeys("Admin");
		// using locator
		WebElement txtUsername = driver.findElement(By.name("username"));
		// passing username in the txtUsername element 
		txtUsername.sendKeys("Admin");
		//provide password
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("admin123");

		
		
		
		
		
		
		}
}
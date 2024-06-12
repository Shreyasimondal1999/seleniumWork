package Day19Locators;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class LocatorDemo1 {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		// searing in the search bar using id locator
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchText.sendKeys("headPhones");
		// clicking button to search 
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		// using Linktext
		driver.findElement(By.linkText("Careers")).click();
        
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		driver.findElement(By.partialLinkText("Job")).click();
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		
		//closing the browser
		driver.quit();
	}

}

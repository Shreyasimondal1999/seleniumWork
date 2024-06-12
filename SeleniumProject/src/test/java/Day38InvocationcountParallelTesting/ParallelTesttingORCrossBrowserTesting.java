package Day38InvocationcountParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.Assert;

public class ParallelTesttingORCrossBrowserTesting {
	public WebDriver driver;
	@BeforeClass
	@Parameters({"Browser","URL"})
    public void driverSetUp(String Browser , String WebURl) {
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		if(Browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}

	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(WebURl);
	
}
	@Test(priority=1)
public void LogoTesting() {
	try {
	    WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Boolean value = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[title=\"Flipkart\"]"))).isDisplayed();
		Assert.assertTrue(value,"Logo is not Displayed");
		
	}
	catch(Exception e) {
		Assert.fail();
	}
}
	@Test(priority=2)
public void TitleTesting() {
	String title = driver.getTitle();
	Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!","Title does not matches");
	
}
	@AfterClass
public void QuitBrowser() {
  driver.quit();	
}

}

package OnlineMobileSearch;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetUp {
public static WebDriver driver ;
    public static WebDriver ChromeDriver(String driverName) {
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		return driver;
    }
    public static WebDriver EdgeDriver(String driverName) {
    	driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		return driver;
    }
}

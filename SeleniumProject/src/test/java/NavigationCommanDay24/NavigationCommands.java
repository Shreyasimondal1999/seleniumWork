package NavigationCommanDay24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {
	public static void main(String args[]) {
		// launching the browser by creating the object of ChromeDriver
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//webDriver driver = new ChromeDriver(); we prefer this over using instance of specific browserDriver
		// to maximize the window 
		 driver.manage().window().maximize();
		
	     driver.get("https://www.amazon.in/");
	     System.out.println(driver.getTitle());
	     driver.get("https://www.flipkart.com/");
	     System.out.println(driver.getTitle());
	     driver.navigate().back();
	     System.out.println(driver.getTitle());
	     driver.navigate().forward();
	     System.out.println(driver.getTitle());
	     driver.navigate().refresh();
	     System.out.println(driver.getTitle());
		 driver.close();
		}
}

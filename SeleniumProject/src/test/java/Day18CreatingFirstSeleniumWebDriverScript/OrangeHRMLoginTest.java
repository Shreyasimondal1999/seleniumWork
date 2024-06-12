package Day18CreatingFirstSeleniumWebDriverScript;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class OrangeHRMLoginTest {
public static void main(String args[]) throws InterruptedException {
	// to use the ChromeDriver we have to do , but in the newer version this is not needed 
	WebDriverManager.chromedriver().setup();
	
	// launching the browser by creating the object of ChromeDriver
	ChromeDriver driver = new ChromeDriver();
	//webDriver driver = new ChromeDriver(); we prefer this over using instance of specific browserDriver
	// to maximize the window 
	driver.manage().window().maximize();
	//open url in  the browser
	driver.get("https://opensource-demo.orangehrmlive.com/");

	// to synchronize webisite with our next work , we will use Thread.sleep();
//	try {
//		Thread.sleep(5000);
//	}
//	catch(Exception e) {
//		System.out.println(e);
//	}
	Thread.sleep(4000);
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
//	String act_title = driver.getTitle();
//	String inputTitle = "OrangeHRM";
//	if(act_title.equals(inputTitle)) {
//		System.out.println("Test passed");
//		
//	}else {
//		System.out.println("Test Failed");
//	}
	//as the dashboard page opening takes time
	try {
		Thread.sleep(5000);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
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
//	try{driver.close();
//	}
//	catch(Exception e) {
//		System.out.println(e);
//	}
//	
	
	driver.quit();
}
}

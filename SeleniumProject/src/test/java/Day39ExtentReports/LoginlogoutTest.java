package Day39ExtentReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.*;
@Listeners(Day39ExtentReports.ListenerClass.class)
public class LoginlogoutTest {
	public WebDriver driver = new ChromeDriver();
	@BeforeClass
	public  void driverSetUp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	
	}
	@Test(priority=1)
	public void login() throws Exception {
		   System.out.println("opening");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Thread.sleep(5000);
			driver.manage().window().maximize();
			// using locator
			WebElement txtUsername = driver.findElement(By.name("username"));
			// passing username in the txtUsername element 
			txtUsername.sendKeys("Admin");
			//provide password
			WebElement txtPassword = driver.findElement(By.name("password"));
			txtPassword.sendKeys("admin123");
			//click on the login button using xpath as attribute
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			String act_label = "";
			try {
			act_label = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
			} catch(Exception e) {}
			String exp_label = "Dashboard";

			Assert.assertEquals(act_label,exp_label);
			System.out.println(act_label);
		
		
	}
	@Test(priority=2, dependsOnMethods="login")
	public void LogOut() throws Exception{
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Actions act = new Actions(driver);
	     Action a =act.moveToElement(driver.findElement(By.xpath("//a[text()='Logout']"))).click().build();
	     a.perform();
	     Thread.sleep(2000);
		System.out.println("Logged out");
		

	}
	@AfterClass
	public void driverClose() {
		
	driver.close();
	}

}

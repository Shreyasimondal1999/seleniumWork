package Day38InvocationcountParallelTesting;
import org.openqa.selenium.interactions.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
public class InvocationCount {
	public WebDriver driver = new ChromeDriver();
	public static int count =0;
	@BeforeClass
	public  void driverSetUp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
	}
	@Test(invocationCount=4)
	public void loginLogoutProcess() throws Exception {
         count++;
         Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
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
		act_label = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		} catch(Exception e) {}
		String exp_label = "Dashboard";

		Assert.assertEquals(act_label,exp_label);
		Thread.sleep(10);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Actions act = new Actions(driver);
	     Action a =act.moveToElement(driver.findElement(By.xpath("//a[text()='Logout']"))).click().build();
	     a.perform();
		System.out.println("Logged out");
		Thread.sleep(5000);
		
	}
	@AfterClass
	public void PrintCount() {
		System.out.println("Count : "+count);
		driver.close();
	}

}

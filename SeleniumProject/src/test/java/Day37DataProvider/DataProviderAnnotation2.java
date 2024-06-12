package Day37DataProvider;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation2 {
	
	public WebDriver driver = new ChromeDriver();
	public static int count =0;
	@BeforeClass
	public  void driverSetUp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	
	}
	@Test(dataProvider = "dp")
	public void loginLogoutProcess(String username, String password) throws Exception {

		   count++;
		   System.out.println("opening");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Thread.sleep(5000);
			driver.manage().window().maximize();
			// using locator
			WebElement txtUsername = driver.findElement(By.name("username"));
			// passing username in the txtUsername element 
			txtUsername.sendKeys( username);
			//provide password
			WebElement txtPassword = driver.findElement(By.name("password"));
			txtPassword.sendKeys(password);
			//click on the login button using xpath as attribute
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			String act_label = "";
			try {
			act_label = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
			} catch(Exception e) {}
			String exp_label = "Dashboard";

			Assert.assertEquals(act_label,exp_label);
			System.out.println(act_label);
			//Thread.sleep(5000);
//			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
//			Actions act = new Actions(driver);
//		     Action a =act.moveToElement(driver.findElement(By.xpath("//a[text()='Logout']"))).click().build();
//		     a.perform();
//			System.out.println("Logged out");
//		Thread.sleep(5000);
		
	}
	@AfterClass
	public void driverClose() {
		System.out.println("Count" + count );
	//	driver.close();
	}
	@DataProvider(name="dp")
	String [][] loginData()
	{
		String data[][]= {  { "pavanol@gmail.com", "test123" },
							{ "Admin", "admin123" }, 
							{ "Admin", "admin123" },
							{ "Admin", "admin123" }
						};
		
		return data;
	}

	

}

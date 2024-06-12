package Day40PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	
	WebDriver driver;
//LoginPagePageObjectClass2 lp;
	LoginPagePageObjectClass lp;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
	}
	
	@Test(priority=1)
	void testLogo()
	{
		//lp=new LoginPagePageObjectClass2(driver);
		lp=new LoginPagePageObjectClass(driver);
		
		Assert.assertEquals(lp.checkLogoPresence(), true);
	}
	
	
	@Test(priority=2)
	void testLogin()
	{
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickSubmit();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText(), "Dashboard","DashBoard not matching");
		
				
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}

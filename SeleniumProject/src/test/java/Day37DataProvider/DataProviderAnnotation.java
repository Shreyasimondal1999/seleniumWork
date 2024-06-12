package Day37DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderAnnotation {
public WebDriver driver = new ChromeDriver();
public static int count =0;
@BeforeClass
public  void driverSetUp() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();	
}
//with dataProvider every time whole method runs from beginning. it executes all the scripts
@Test(dataProvider = "dp")
public void loginLogoutProcess(String email, String password) throws Exception {

	driver.get("https://demo.nopcommerce.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
     count++;
	String exp_title = "nopCommerce demo store";
	String act_title = driver.getTitle();

	Assert.assertEquals(act_title,exp_title);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[text()='Log out']")).click();
	//System.out.println("Logged out");
	
}
@AfterClass
public void driverClose() {
	System.out.println("Count" + count );
	//driver.close();
}
@DataProvider(name="dp",indices= {0,2})
String [][] loginData()
{
	String data[][]= {  
						{ "abc@gmail.com", "test123" }, 
						{ "pavanol@gmail.com", "test123" },
						{ "pavanoltraining@gmail.com", "test3" }
					};
	
	return data;
}


}

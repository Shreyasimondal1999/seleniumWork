package Day24WwebdriverMethods;
import java.time.Duration;
import java.util.NoSuchElementException;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
 
import com.google.common.base.Function;
public class FluentWaitDemo {


		// TODO Auto-generated constructor stub
		public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Fluent wait declaration
			FluentWait mywait=new FluentWait(driver);
			mywait.withTimeout(Duration.ofSeconds(30));
		    mywait.pollingEvery(Duration.ofSeconds(5));
		    mywait.ignoring(NoSuchElementException.class);

			//usage
		    WebElement username=(WebElement)mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
			username.sendKeys("Admin");
			FluentWait waitmy = new FluentWait(driver);
			waitmy.withTimeout(Duration.ofSeconds(50));
			waitmy.pollingEvery(Duration.ofSeconds(3));
			waitmy.ignoring(Exception.class);
	 Wait<WebDriver> wait = new FluentWait(driver);
	 FluentWait await = new FluentWait(driver);
	  mywait.withTimeout(Duration.ofSeconds(30));
	  mywait.pollingEvery(Duration.ofSeconds(20));
	  mywait.ignoring(NoSuchElementException.class);
	}

}

package Day26AlertandPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlert {
	public static void main(String args[]) throws Exception {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// alert with ok and cancel
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.cssSelector("input#confirmexample")).click();
		Alert box= driver.switchTo().alert();
		//implicit or explicit wait is important , for alert box to come
		//Alert box = wait.until(ExpectedConditions.alertIsPresent());
		//Thread.sleep(3000);
		System.out.println(box.getText());
		//box.getText() is to get text of alert box
		box.accept();//to accept the alert
		//box.dismiss();//to decline the the alert
		
		
		//alert with input box
		driver.findElement(By.cssSelector("input#promptexample")).click();
		Alert box1 = driver.switchTo().alert();
		System.out.println(box1.getText());
		box1.sendKeys("confirming");
		Thread.sleep(3000);
		box1.accept();
		String actual_text = driver.findElement(By.id("promptreturn")).getText();
        if(actual_text.equals("confirming")) {
        	System.out.println("Test case passed");
        }
        else {
        	System.out.println("Test case fail");
        }

		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}

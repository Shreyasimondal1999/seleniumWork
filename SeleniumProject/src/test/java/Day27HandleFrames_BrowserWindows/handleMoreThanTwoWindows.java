package Day27HandleFrames_BrowserWindows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handleMoreThanTwoWindows {
	public static void main(String args[])  throws Exception {
		// TODO Auto-generated method stub
		
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     //opening the webSite
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	    driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][3]//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	    Set<String> webHandles= driver.getWindowHandles();
	    for(String webHandle : webHandles) {
	    	if(driver.switchTo().window(webHandle).getTitle().equals("Apple iPhone 13 (128GB) - Starlight : Amazon.in: Electronics")) {
	    		System.out.println("Closing the window");
	    		driver.close();
	    	}
	    }
	    driver.close();
	}

}

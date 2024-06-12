package Day27HandleFrames_BrowserWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
public class HandleWindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
      driver.get("https://www.amazon.in/");
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))).sendKeys("Phones");
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-search-submit-button"))).click();
     // driver.findElement(By.className("nav-search-submit-button")).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-index='5']/div/div/span/div/div/div/div[1]/descendant::a"))).click();
     // driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']/parent::a")).click();
      Thread.sleep(5000);
      Set<String> s = driver.getWindowHandles();
      List<String> windowIdsList = new ArrayList<String>(s);
      String parentWindowId = windowIdsList.get(0);//main home page
      String childWindowId = windowIdsList.get(1);//iphone page
      driver.switchTo().window(parentWindowId);
      Thread.sleep(4000);
      //String price=driver.findElement(By.xpath("//span[@id='tp_price_block_total_price_ww']/span[2]/span[2]")).getText();
      //System.out.println(price);
    //div[contains(@class,'sg-col-20-of-24')][1]
	}

}

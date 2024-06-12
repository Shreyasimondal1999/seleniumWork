package Day30HandleMouseEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClickAction {
public static void main(String args[]) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement rightClickableEle = driver.findElement(By.xpath("//p/span[@class='context-menu-one btn btn-neutral']"));
	Actions act = new Actions(driver);
	act.contextClick(rightClickableEle).build().perform();
	driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(4000);
	driver.close();
	
}
	
}

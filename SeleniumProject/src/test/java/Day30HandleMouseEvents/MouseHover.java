package Day30HandleMouseEvents;

import org.openqa.selenium.interactions.Action;
import java.time.Duration;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class MouseHover {
	private static final WebElement HinEle = null;

	public static void main(String args[]) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act = new Actions(driver);
		WebElement lanEle=driver.findElement(By.id("icp-nav-flyout"));
		//mouse hovering to the element
		act.moveToElement(lanEle).build().perform();
	     //Action a=act.moveToElement(lanEle).build();
		//find element from the dropdown list
		WebElement HinEle = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[2]"));
        // moving to the element in the dropdown list and clicking it
		act.moveToElement(HinEle).click().build().perform();
		
		Thread.sleep(5000);
		driver.close();
	}

}

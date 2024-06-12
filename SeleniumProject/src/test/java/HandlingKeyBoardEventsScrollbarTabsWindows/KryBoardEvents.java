package HandlingKeyBoardEventsScrollbarTabsWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class KryBoardEvents {
	public static void main(String args[]) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@name = 'text1']")).sendKeys("Hello World");
		Actions act = new Actions(driver);
	
		//pressing ctrl+a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		//pressing ctrl+c
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		//tab
	act.sendKeys(Keys.TAB).perform();
		//act.keyDown(Keys.TAB).keyUp(Keys.TAB);
	act.sendKeys(Keys.TAB).perform();
		//ctrl+v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		Thread.sleep(5000);
		driver.close();
	}

}


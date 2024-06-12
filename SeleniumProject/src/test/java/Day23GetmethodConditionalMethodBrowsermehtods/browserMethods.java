package Day23GetmethodConditionalMethodBrowsermehtods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class browserMethods {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=adjustable+height+desk&crid=28WV1OQBW9VK5&sprefix=%2Caps%2C560&ref=nb_sb_ss_recent_5_0_recent");
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		//driver.findElement(By.xpath("//a[text()=\"Sell\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[2]/div[1]/h2/a/span")).click();
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		
		driver.close();
		//driver.quit();
		
	    }
	    
}

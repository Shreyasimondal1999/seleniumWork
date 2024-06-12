package Day21Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		
		//using relative xpath
		//String text = driver.findElement(By.xpath("//span[text()=\"Up to 80% off | Deals on mobile accessories\"]")).getText();
		String text = driver.findElement(By.xpath("//span[normalize-space()=\"Up to 80% off | Deals on mobile accessories\"]")).getText();
        System.out.println(text);
		
		
		
		
		
		
		
		
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		
		
		driver.quit();
	}

}

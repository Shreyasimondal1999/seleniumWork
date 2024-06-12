package Day19Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Locatordemo2 {
public static void main(String args[]) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	try {
		Thread.sleep(5000);
	}
	catch(Exception e) {
	
	}
	List<WebElement> sliders = driver.findElements(By.className("a-carousel-card")); 
	//List<WebElement> sliders = driver.findElements(By.cssSelector("li.a-carousel-card"));
	System.out.println("Number of sliders "+sliders.size());
	List<WebElement> images= driver.findElements(By.tagName("img"));
	System.out.println("Total images :"+images.size());
	driver.quit();
}
}

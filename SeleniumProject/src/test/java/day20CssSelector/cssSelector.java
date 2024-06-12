package day20CssSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
//selecting location from navbar using tag and id combination
		String textloc = driver.findElement(By.cssSelector("span#glow-ingress-line1")).getText();
		System.out.println(textloc);
		
		
	//tag attribute combination
		// selecting from mobile accessories
		//driver.findElement(By.cssSelector("img[alt=\"Mobile accessories | Starting ₹49\"]")).click();
		
		
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		
		
	//going back to main page
	driver.findElement(By.cssSelector("a.nav-logo-link")).click();
	try {
		Thread.sleep(5000);
	}
	catch(Exception e) {
	
	}
		
//selecting first link element from the navbar
//(expecting amazon mini tv to be selected as it is the first matching element with the)
		// update location got clicked as it has a class name starting with nav-a and it comes before mini tv
		driver.findElement(By.cssSelector("a.nav-a  ")).click();
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		
		
		driver.quit();
	}
}

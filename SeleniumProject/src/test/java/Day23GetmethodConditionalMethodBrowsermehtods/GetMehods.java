package Day23GetmethodConditionalMethodBrowsermehtods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetMehods {
		public static void main(String args[]) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			
			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {
			
			}
			//gets title of the current webPage
			System.out.println("page title "+ driver.getTitle());
			//returns url of the current web page
			System.out.println("page Url "+ driver.getCurrentUrl());
			// returns html of the current webPage
			//System.out.println("page html code "+ driver.getPageSource());
			//returns the window id of the current window
			System.out.println("window id : " + driver.getWindowHandle());
			//trying to use getWindowHandles();
			driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("height adjustable table");
			driver.findElement(By.id("nav-search-submit-button")).click();
			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {
			
			}
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div[2]/div[1]/h2/a")).click();
			
			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {
			
			}
			
			//return multiple window ids in a set
		    Set<String> s = driver.getWindowHandles();
		    System.out.println(s.size());
			for(String s1 : s) {
				System.out.println("multiple window id opened in the browser: "+ s1);
			}
			
			
			
			
			
			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {
			
			}
			
			
			driver.quit();
		}

}

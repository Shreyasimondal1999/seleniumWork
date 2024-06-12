package Day32HAndleBrokenLinksCaptureScreenshotsHeadlessBrowserTesting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.time.*;

public class HandleBrokenLinks {
	public static void main(String args[]) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		int brokenLink=0;
		for(int i=0;i<list.size();i++) {
			String TargetLink=list.get(i).getAttribute("href");
			if(TargetLink!=null) {
				System.out.println("Target Link is not empty, can check link");
				//converting String to link
				URL myurl = new URL(TargetLink);
				//creating the connection to the server
				HttpURLConnection con = (HttpURLConnection)myurl.openConnection();
				
				//connecting to the server with the help of the connection
				con.connect();
				//bringing response back from the server with the help of the connection
				int responseCode =con.getResponseCode();
				if(responseCode < 400) {
					System.out.println("It is not a broken Link");
					System.out.println(TargetLink);
				}
				if(responseCode >= 400) {
					System.out.println("It is a broken Link");
					System.out.println(TargetLink);
					brokenLink++;
				}
				
				continue;
			}
		}
		System.out.println("BrokenLink : "+brokenLink);
		
		Thread.sleep(5000);
		driver.close();
	}

}

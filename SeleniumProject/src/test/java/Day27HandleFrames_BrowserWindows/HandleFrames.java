package Day27HandleFrames_BrowserWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
public static void main(String args[]) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#singleframe")));
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hello");
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src = \"MultipleFrames.html\"]")));
	driver.switchTo().frame(driver.findElement(By.xpath("//h5[contains(text(),\"Nested iFrames\")]/following-sibling::iframe")));
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hello");
	driver.switchTo().defaultContent();
	String text=driver.findElement(By.xpath("//div[@class='top']/descendant::h1")).getText();
	System.out.println(text);
	driver.close();
}
}

package Day27HandleFrames_BrowserWindows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;


public class HANDLEINNERFRAME  {
	public static void main(String args[]) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		//frame 1
		WebElement ele = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//form[@id=\"id1\"]/descendant::input")).sendKeys("11111");
		 Thread.sleep(3000);
		driver.switchTo().defaultContent();
		//frame3
		WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//form[@method = 'POST'][@name = 'name3']/descendant::input")).sendKeys("33333");
        WebElement innerFrame = driver.findElement(By.xpath("//center/iframe"));
        driver.switchTo().frame(innerFrame);
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[2]/div/span")).click();
  
        
	     Thread.sleep(3000);
	     driver.switchTo().defaultContent();
	     
	     driver.close();
	     
		
	}

}

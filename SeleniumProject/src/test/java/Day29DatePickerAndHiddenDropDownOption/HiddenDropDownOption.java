package Day29DatePickerAndHiddenDropDownOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.*;


public class HiddenDropDownOption {
	public static void main(String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a")).click();
		//selecting the dropdown
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[1]/div[2]/i")).click();
        List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		for(WebElement option:options)
		{
			//System.out.println(option.getText());
			if(option.getText().equals("Finance Manager"))
			{
				option.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}

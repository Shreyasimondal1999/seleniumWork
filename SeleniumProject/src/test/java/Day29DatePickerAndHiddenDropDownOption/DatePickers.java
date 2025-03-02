package Day29DatePickerAndHiddenDropDownOption;

import java.time.Duration;
import java.time.Month;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class DatePickers {
public static void main(String args[]) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://jqueryui.com/datepicker/");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	//send keys is working here
	//driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("2/12/1999");//mm/dd/yyyy
	driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
	
	while(true) {
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(month.equals("December") && year.equals("2024")) {
			System.out.println("Month : " + month + " Year : " + year);
			break;
		}
		else {
			if(Integer.parseInt(year)>2024) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
			}
			else if(Integer.parseInt(year)<2024) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			}
			else if (Integer.parseInt(year)==2024) {
				Month m =Month.valueOf(month.toUpperCase());
				Month mymon = Month.valueOf("DECEMBER");
				//Month.ordinal() returns int
				if(mymon.ordinal()>m.ordinal()) {
					
					driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
				}else {
					driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
				}
			}
		}
	}
	List<WebElement> dayList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td/a"));
	for(WebElement ele : dayList) {
		if(ele.getText().equals("26")) {
			ele.click();
		}
	
	}
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.close();
}
}

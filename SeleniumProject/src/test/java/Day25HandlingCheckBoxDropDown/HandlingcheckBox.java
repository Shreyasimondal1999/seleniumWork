package Day25HandlingCheckBoxDropDown;
import org.openqa.selenium.chrome.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class HandlingcheckBox {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type= \"checkbox\"]"));
		//selecting all check boxes
		for (WebElement ele : checkbox) {
			ele.click();
		}
		System.out.println(checkbox.size());
		try {
			Thread.sleep(5000);
		}catch(Exception s) {
			
		}
		//unselecting first checkbox
		for(int i =0;i<1;i++) {
			checkbox.get(i).click();
		}
		try {
			Thread.sleep(5000);
		}catch(Exception s) {
			
		}
		//unselecting selecting check boxes
		for (WebElement ele : checkbox) {
			if(ele.isSelected()) {
				
				ele.click();
			}
		}
		try {
			Thread.sleep(5000);
		}catch(Exception s) {
			
		}
		driver.close();
		
	}
}

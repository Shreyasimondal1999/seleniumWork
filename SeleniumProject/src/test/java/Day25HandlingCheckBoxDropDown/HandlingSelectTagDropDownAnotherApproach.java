package Day25HandlingCheckBoxDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectTagDropDownAnotherApproach {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		//selecting dropdowm input box
		driver.findElement(By.xpath("//select[@name = \"country\"]")).click();
		try {
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			
		}
        List<WebElement> li = driver.findElements(By.xpath("//select[@name = \"country\"]/child::*"));
        for (int i =0; i< li.size();i++) {
        	li.get(i).getText();
        }
		try {
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			
		}

		driver.close();
		
		
	}

}

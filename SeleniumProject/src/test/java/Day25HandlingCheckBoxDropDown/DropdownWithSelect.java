package Day25HandlingCheckBoxDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithSelect {
public static void main(String args[]) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	driver.manage().window().maximize();
	//selecting dropdowm input box
	WebElement dropele = driver.findElement(By.xpath("//select[@name = \"country\"]"));
	// creating select class object to perform operations on dropdown options
	Select countryDropdown = new Select(dropele);
	countryDropdown.selectByVisibleText("Brazil");
	try {
		Thread.sleep(2000);
		
	}
	catch(Exception e) {
		
	}
	countryDropdown.selectByValue("3");
	try {
		Thread.sleep(2000);
		
	}
	catch(Exception e) {
		
	}
	WebElement stateDrop = driver.findElement(By.cssSelector("select#state-list"));
	Select stateDropdown = new Select(stateDrop);

	List<WebElement> li = stateDropdown.getOptions();
	for(int i = 0; i<li.size();i++) {
		stateDropdown.selectByIndex(i);
		System.out.println(li.get(i).getText());
		try {
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			
		}
		
	}
	System.out.println(stateDropdown.getFirstSelectedOption().getText());
	//stateDropdown.deselectAll();
	System.out.println(li.size());

	driver.close();
	
	
}
}

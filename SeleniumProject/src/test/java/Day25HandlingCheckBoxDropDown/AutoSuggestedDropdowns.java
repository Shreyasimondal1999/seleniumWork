package Day25HandlingCheckBoxDropDown;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AutoSuggestedDropdowns {
	public static void main(String args[]) throws Exception {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//selecting the search box and sending keys
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@class = \"gLFyf\"]"))).sendKeys("Bee");
		
		//Thread.sleep(5000);
		//storing all the suggested options given in a list of webElement
		List<WebElement> list =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class = \"pcTkSc\"]//div[@class = \"wM6W7d\" ][@role = \"presentation\"]/span")));
		//selecting our option with "beer" and printing all the suggested options
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("beer")) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		driver.close();
	}

}

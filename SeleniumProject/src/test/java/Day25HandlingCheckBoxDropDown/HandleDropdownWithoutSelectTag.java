package Day25HandlingCheckBoxDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdownWithoutSelectTag {
	public static void main(String arg[]) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@title = 'HTML, CSS']")).click();
		List<WebElement> li = driver.findElements(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]/child::*"));
		System.out.println("Total no of options: "+li.size());
		driver.close();
		
	}

}

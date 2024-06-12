package Day23GetmethodConditionalMethodBrowsermehtods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class ConditionalCommands {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		//checking if the amazon logo is present in the home page or not  
		
		WebElement image = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]/span[1]"));
		System.out.println("image status / logo status "+ image.isDisplayed());
		
		//checking if the search box is enabled or not
		WebElement searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		System.out.println("search box enable status :"+ searchbox.isEnabled());
		
		
		
		// checking if hindi language is selected or not
		 driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).click();
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		WebElement lanradiobutton = driver.findElement(By.xpath("//input[@type = 'radio'][@value = \"hi_IN\"]"));
		System.out.println("selection of language" + lanradiobutton.isSelected());
	
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		//after selection of hindi languge
	driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i")).click();
		//driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/input")).click(); 
	//element click intercepted: Element <input type="radio" name="lop" value="hi_IN"> is not clickable at point (97, 247). Other element would receive the click: <i class="a-icon a-icon-radio"></i>
System.out.println("selection of language" + lanradiobutton.isSelected());
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		
		}
		driver.quit();
	    }
	    

}

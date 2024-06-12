package Day36AnnotationsDependencyMethodsTypesOfAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAfterClass {

	//declaring the driver globally so that it can be accesed by all the methods
	public WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void LoadingTheSite() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
	}
	@Test(priority=1)
	public void Searching() {
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
		//giving user input in the searchBox
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("real me neckband");
		//selcting search button
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		System.out.println("Searching succesful");
	}
	@Test(priority=2)
	public void SecondDummyTest() {
		System.out.println("Second Test");
	}
	@AfterClass
	public void ClosingBrowser() {
		driver.quit();
	}
}

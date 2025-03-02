package Coursera;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage{
	public WebDriver driver ;
	public ScreenShot screenshot;
	
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//constructor
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
//locators
//search box
By searchBox =  By.cssSelector("input[placeholder = 'What do you want to learn?']");
//submitButton
By submitButton = By.xpath("//button[@class='nostyle search-button']//div");


//EnterPrise
By EnterPrise = By.xpath("//a[text()='For Enterprise']");

//Campus
By Campus = By.xpath("//a[text()='For Campus']");

//actions

public void Search() throws IOException {
	DataDrivenTesting data = new DataDrivenTesting();
	String InputValue = data.getInputFromExcelSheet();
	//clicking the search box and sending input
	driver.findElement(searchBox).click();
	driver.findElement(searchBox).sendKeys(InputValue);
	screenshot.GetScreenShotOfWholePage(driver, "homePageInputBox");
	
	//clicking on submit button
	WebElement button =driver.findElement(submitButton);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", button);
	
}



public void goToEnterPrise() throws InterruptedException, IOException {
	WebElement enterprise = driver.findElement(EnterPrise);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	// to display the scroll thread.sleep is used , not to synchronize
	 try {
	     Thread.sleep(2000);
		 }catch(Exception e) {
			 System.out.println(toString());
		 }
	 //scrolling to ForEnterprise option 
	js.executeScript("arguments[0].scrollIntoView();",enterprise );
	// taking screen shot of ForEnterprise Portion in the webpage
	screenshot.GetScreenShotOfWholePage(driver, "ForEnterprise");
	//clicking on enterprise link
	js.executeScript("arguments[0].click();",enterprise);
}

public void goCampus() throws IOException {
	
	WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
	WebElement campus=wait.until(ExpectedConditions.visibilityOfElementLocated(Campus));
	//WebElement campus = driver.findElement(Campus);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//scrolling to ForCampus option
	js.executeScript("arguments[0].scrollIntoView();",campus);
// taking screen shot of ForCampus Portion in the web page
	screenshot.GetScreenShotOfWholePage(driver, "forCampus");
	//clicking on enterprise link
		js.executeScript("arguments[0].click();", campus);


}


}

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
	//clicking the search box and searching
	driver.findElement(searchBox).click();
	driver.findElement(searchBox).sendKeys(InputValue);
	screenshot.GetScreenShotOfWholePage(driver, "homePageInputBox");
	WebElement button =driver.findElement(submitButton);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", button);
	
}



public void goToEnterPrise() throws InterruptedException, IOException {
	WebElement enterprise = driver.findElement(EnterPrise);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",enterprise );
	//clicking on enterprise link
	screenshot.GetScreenShotOfTheParticularElement(enterprise, "ForEnterprise");
	js.executeScript("arguments[0].click();",enterprise);
	//enterprise.click();
}

public void goCampus() throws IOException {
	WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
	WebElement campus=wait.until(ExpectedConditions.visibilityOfElementLocated(Campus));
	//WebElement campus = driver.findElement(Campus);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",campus);
	//clicking on enterprise link
	screenshot.GetScreenShotOfTheParticularElement(campus, "forCampus");
	try{
		js.executeScript("arguments[0].click();", campus);
	}
	catch(Exception e ) {
		System.out.println(e.toString());
	}
	//campus.click();
}


}

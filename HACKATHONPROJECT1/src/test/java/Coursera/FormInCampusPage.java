package Coursera;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class FormInCampusPage {
	public WebDriver driver;
	public ScreenShot screenshot;
public FormInCampusPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
//WebElements
@FindBy(id="FirstName")
WebElement FirstName;

@FindBy(id="LastName")
WebElement LastName;

@FindBy(id="Email")
WebElement WorkEmail;

@FindBy(id="Phone")
WebElement PhoneNumber;

@FindBy(xpath="//select[@id='Institution_Type__c']")
WebElement InstituteType;

@FindBy(id="Company")
WebElement InstituteName;

@FindBy(xpath="//select[@id='Title']")
WebElement JobRole;

@FindBy(xpath="//select[@id='Department']")
WebElement Department;

@FindBy(xpath="//select[@id='What_the_lead_asked_for_on_the_website__c']")
WebElement AboutYou;

@FindBy(tagName="textarea")
WebElement MoreAboutYou;

@FindBy(xpath="//select[@id='Self_reported_employees_to_buy_for__c']")
WebElement totalStudent;

@FindBy(xpath="//select[@id='Country']")
WebElement Country;

@FindBy(xpath="//select[@id='State']")
WebElement State;

@FindBy(xpath="//button[@type='submit']")
WebElement submitButton;

//Action methods
public String  fillingForm(String Firstname, String Lastname, String email, String PhoneNO,String Institutiontype, String Institutename,String jobrole, String department, String description1,String description2, String country, String state ) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//sending input to Firstname input box
	FirstName.sendKeys(Firstname);
	//sending input to Lastname input box
	LastName.sendKeys(Lastname);
	//sending input to email input box
	WorkEmail.sendKeys(email);
	//sending input to PhoneNO input box
	PhoneNumber.sendKeys(PhoneNO);
	//selecting input for Institute
	Select select = new Select(InstituteType);
	select.selectByIndex(1);
	InstituteName.sendKeys(Institutename);
	
	//selecting input for Job role
	select = new Select(JobRole);
	select.selectByVisibleText(jobrole);
	
	//selecting input for department
	select = new Select(Department);
	select.selectByVisibleText(department);
	
	//selecting input for about you
	select = new Select(AboutYou);
	select.selectByVisibleText(description1);
	MoreAboutYou.sendKeys(description2);
	
	//selecting input for TotalStudent
	select = new Select(totalStudent);
	select.selectByIndex(1);
	
	//selecting input for Country
	select = new Select(Country);
	select.selectByVisibleText(country);
	
	//selecting input for State
	select = new Select(State);
	select.selectByVisibleText(state);
	
	//clicking on submit button
	js.executeScript("arguments[0].click();",submitButton);
	System.out.println("--------------------------------------------");
	System.out.println("Form submit button clicked");
	 try {
	     Thread.sleep(2000);
		 }catch(Exception e) {
			 System.out.println(toString());
		 }
	 //capturing the warning message by scrolling upward to the name input box
	WebElement WARNINGMessage=driver.findElement(By.xpath("//div[@id='ValidMsgEmail']"));
	js.executeScript("arguments[0].scrollIntoView();",FirstName);
	String WarningMessage = WARNINGMessage.getText();
	System.out.println("--------------------------------------------");
	System.out.println("Warning Message is : "+ WarningMessage);
	
	//capturing screen shots of warning message
	try {
	screenshot.GetScreenShotOfWholePage(driver, "Warningmessage");
	}
	catch(IOException e) {
		System.out.println(e.toString());
	}
    return WarningMessage;
}


}

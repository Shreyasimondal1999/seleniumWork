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
	
	
	FirstName.sendKeys(Firstname);
	LastName.sendKeys(Lastname);
	WorkEmail.sendKeys(email);
	PhoneNumber.sendKeys(PhoneNO);
	Select select = new Select(InstituteType);
	select.selectByIndex(1);
	InstituteName.sendKeys(Institutename);
	select = new Select(JobRole);
	select.selectByVisibleText(jobrole);
	select = new Select(Department);
	select.selectByVisibleText(department);
	select = new Select(AboutYou);
	select.selectByVisibleText(description1);
	MoreAboutYou.sendKeys(description2);
	select = new Select(totalStudent);
	select.selectByIndex(1);
	select = new Select(Country);
	select.selectByVisibleText(country);
	select = new Select(State);
	select.selectByVisibleText(state);
	js.executeScript("arguments[0].click();",submitButton);

	WebElement WARNINGMessage=driver.findElement(By.xpath("//div[@id='ValidMsgEmail']"));
	String WarningMessage = WARNINGMessage.getText();
	System.out.println("Warning Message is : "+ WarningMessage);
    return WarningMessage;
}


}

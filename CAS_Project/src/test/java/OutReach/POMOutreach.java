package OutReach;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class POMOutreach {
	
	WebDriver driver;
	TakesScreenshot ss;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	public POMOutreach(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	
	// iframe
	@FindBy(id = "appFrame") WebElement iframeElement;
	
	// Menu and sub menu items
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li") List<WebElement> menuList;
	
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']//li[1]") WebElement eventMenu;
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li[1]/div/a") List<WebElement> eventSubMenu;
	
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']//li[2]") WebElement myVolunteeringMenu;
	
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']//li[3]") WebElement donateMenu;
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li[3]/div/a") List<WebElement> donateSubMenu;
	
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']//li[4]") WebElement exploreMenu;
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li[4]/div/a") List<WebElement> exploreSubMenu;
	
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']//li[5]") WebElement readMoreMenu;
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li[5]/div/a") List<WebElement> readMoreSubMenu;
	
	// Event details
	@FindBy(xpath = "//div[@class='card_event marginleft0']") List<WebElement> interesetCardList;
	
	// Search Event Filter
	@FindBy(xpath = "//div[@class='search-group']/span") WebElement searchFilterButton; 
	@FindBy(xpath =  "//button[@class='btn dropdown-toggle bs-placeholder btn-default btn-light']") WebElement eventTypeButton;
	@FindBy(xpath = "//span[text() = ' Education ']") WebElement eventSelectOption;
	@FindBy(xpath = "//button[@data-id='jsonWeekType']") WebElement weekTypeButton;
	@FindBy(xpath = "//div[@class='btn-group bootstrap-select custom-searchdropdown show']//a[2]") WebElement weekSelectOption;
	
	// Calendar date selection
	
	// From date
	@FindBy(id = "fromDate") WebElement fromDateButton;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//thead/tr[2]/th[2]") WebElement clickMonthButton1;
	@FindBy(xpath = "//div[@class='datepicker-months']//thead/tr[2]/th[2]") WebElement clickYearButton1;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//thead/tr[2]/th[3]") WebElement nextDay1;
	@FindBy(xpath = "//div[@class='datepicker-months']//thead/tr[2]/th[3]") WebElement nextMonth1;
	@FindBy(xpath = "//div[@class='datepicker-years']//thead/tr[2]/th[3]") WebElement nextYear1;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//tbody//tr//td[starts-with(@class,'day')]") List<WebElement> listOfDays1;
	@FindBy(xpath = "//div[@class='datepicker-months']//tbody//tr//span[contains(@class,'month')]") List<WebElement> listOfMonths1;
	@FindBy(xpath = "//div[@class='datepicker-years']//td[1]/span") List<WebElement> listOfYears1;
	
	// To Date
	@FindBy(id = "toDate") WebElement toDateButton;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//thead/tr[2]/th[2]") WebElement clickMonthButton2;
	@FindBy(xpath = "//div[@class='datepicker-months']//thead/tr[2]/th[2]") WebElement clickYearButton2;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//thead/tr[2]/th[3]") WebElement nextDay2;
	@FindBy(xpath = "//div[@class='datepicker-months']//thead/tr[2]/th[3]") WebElement nextMonth2;
	@FindBy(xpath = "//div[@class='datepicker-years']//thead/tr[2]/th[3]") WebElement nextYear2;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//tbody//tr//td[starts-with(@class,'day')]") List<WebElement> listOfDays2;
	@FindBy(xpath = "//div[@class='datepicker-months']//tbody//tr//span[contains(@class,'month')]") List<WebElement> listOfMonths2;
	@FindBy(xpath = "//div[@class='datepicker-years']//td[1]/span") List<WebElement> listOfYears2;
	
	// Search button
	@FindBy(xpath = "//div/button[@id='eventsHomeSearchBtn']") WebElement searchButton;
	
	@FindBy(xpath = "//div[@id='divsearchevents']//div[@class='title_event']") List<WebElement> serachResultDisplay;
	@FindBy(xpath = "//div[@class='container outind-app']") WebElement OneCognizantPage;
	
	// Volunteering button
	@FindBy(xpath = "//a[text()='My Volunteering']") WebElement myVolunteerButton;
	@FindBy(id = "divvolteer") WebElement volunteerAroundMe; 
	@FindBy(className = "profilevoltext") List<WebElement> listOfVolunteerAroundMe;

	
	// Actions
	
	// Frame switching
	public void getSwitchFrame(){
		
		driver.switchTo().frame(iframeElement);
		
	}
	
	// reusable for loop to print the elements of list
	public void helperLoop(List<WebElement> list) {
		for(WebElement e : list) {
			System.out.println(e.getText());
		}
	}
	
	// printing the elements of menu
	public void getMainMenu() {

		helperLoop(menuList);
	}
	
	// printing the elements of sub menu's
	public void getSubMenu() {
		
		Actions act = new Actions(driver);
		
		act.moveToElement(eventMenu).perform();
		System.out.println();
		System.out.println("Event sub menu: ");
		helperLoop(eventSubMenu);
		
		act.moveToElement(donateMenu).perform();
		System.out.println();
		System.out.println("Donate sub menu: ");
		helperLoop(donateSubMenu);
		
		act.moveToElement(exploreMenu).perform();
		System.out.println();
		System.out.println("Explore sub menu: ");
		helperLoop(exploreSubMenu);
		
		act.moveToElement(readMoreMenu).perform();
		System.out.println();
		System.out.println("Read more sub menu: ");
		helperLoop(readMoreSubMenu);
		
		act.moveToElement(myVolunteeringMenu).perform();
		
	}
	
	// Printing event based on interest in out reach
	public List<WebElement> getInterestCardList(){
		
		System.out.println();
		return interesetCardList;
		
		
	}
	
	// Opening the search event filter
	public void filterEvent() throws InterruptedException {
		
		searchFilterButton.click();
		Thread.sleep(1000);
		eventTypeButton.click();
		Thread.sleep(1000);
		eventSelectOption.click();
		Thread.sleep(1000);
		weekTypeButton.click();
		Thread.sleep(1000);
		weekSelectOption.click();
		
	}
	
	// From date picker
	
	
	void fromDate() throws InterruptedException {
		
		fromDateButton.click();

		String fromYear = "2024";
		String fromMonth = "Jun";
		String fromDay = "5";
		
		clickMonthButton1.click();
		
		String currYear = clickYearButton1.getText();
		
		// selecting the year
		while(true) {
			if(currYear.equals(fromYear)) {
				break;
			}else {
				nextMonth1.click();
			}
		}
		
		// selecting the month
		for(WebElement e : listOfMonths1) {
			if(e.getText().equals(fromMonth)) {
				e.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		// selecting the day
		for(WebElement e : listOfDays1) {
			if(e.getText().equals(fromDay)) {
				e.click();
				break;
			}
		}

	}
	
	
	// To date picker
	
	void toDate() throws InterruptedException {
		
		toDateButton.click();

		String toYear = "2024";
		String toMonth = "Jun";
		String toDay = "29";
		
		clickMonthButton2.click();
		
		String currYear = clickYearButton2.getText();
		
		// selecting the year
		while(true) {
			if(currYear.equals(toYear)) {
				break;
			}else {
				nextMonth2.click();
			}
		}
		
		// selecting the month
		for(WebElement e : listOfMonths2) {
			if(e.getText().equals(toMonth)) {
				e.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		// selecting the day
		for(WebElement e : listOfDays2) {
			if(e.getText().equals(toDay)) {
				e.click();
				break;
			}
		}
		
	}
	
	void filterSearchButton() throws IOException {
		File scrOneCognizantPage = OneCognizantPage.getScreenshotAs(OutputType.FILE);
		File targetOneCognizantPage = new File("C:\\Users\\2332843\\OneDrive - Cognizant\\Desktop\\Java\\JavaDumps\\CAS_Project\\Screenshots\\OutReach\\SS5.png");
		FileUtils.copyFile(scrOneCognizantPage, targetOneCognizantPage);
		searchButton.click();
	}
	
	void displaySearchResult() {
		try {
			WebElement displayEvent = driver.findElement(By.xpath("//div[@class='card_eventscroll marginleft0']"));
			boolean status = displayEvent.isDisplayed();
			SoftAssert sa = new SoftAssert();
//			System.out.println(status);
			sa.assertEquals(status, true);
			System.out.print("Event based on filters: ");
			for(WebElement el:serachResultDisplay) {
				System.out.println(el.getText());
			}
		}
		catch (Exception e) {
			System.out.println();
			System.out.println("No event to display");
		}
	}
	
	void myVolunteerOption() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", myVolunteerButton);
		volunteerAroundMe.click();
		System.out.println();
		for(WebElement el:listOfVolunteerAroundMe) {
			System.out.println(el.getText());
		}
	}
	
	public void takeScreenshot(String name) throws IOException {
		ss= (TakesScreenshot) driver;
		File source =  ss.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\2332843\\OneDrive - Cognizant\\Desktop\\Java\\JavaDumps\\CAS_Project\\Screenshots\\OutReach\\"+name+".png");
		FileUtils.copyFile(source, target);
	}
	
	
}
	
	
	
	
	
	


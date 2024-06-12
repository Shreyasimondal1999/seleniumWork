package Coursera;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class MainTest {
public WebDriver driver;
public HomePage page;
public SearchedCourses searchescourse ;
public FormInCampusPage Form;
public WebDriverWait wait;
public ScreenShot screenshot;


@BeforeClass
@Parameters({"Browser","URL"})
public void DriverSetUp(String browser,String url) {

	if(browser.equalsIgnoreCase("Chrome")) {
		driver = new ChromeDriver();
	}
	if(browser.equalsIgnoreCase("Edge")) {
		driver = new EdgeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    driver.get(url);
}
@Test(priority=1)
public void SearchInHomePage() throws IOException, InterruptedException {
	 page = new HomePage(driver);
	 page.Search();
	 //we are checking whether we are in the search page
	 Assert.assertEquals(driver.getTitle(), "Top Web Development Courses For Beginners Courses - Learn Web Development Courses For Beginners Online");
	Thread.sleep(5000);
}
@Test(priority=2,dependsOnMethods= {"SearchInHomePage"})
public void DisplayLanguageDetails() {
	 searchescourse = new SearchedCourses(driver);
	searchescourse.DisplayLanguages();
}
@Test(priority=3,dependsOnMethods= {"SearchInHomePage"})
public void DisplayLevelDetails() {
	searchescourse.DisplayLevels();
}

@Test(priority=4,dependsOnMethods= {"SearchInHomePage"})
public void clickCheckBoxesToViewData() {
	
	 searchescourse.ClickCheckBoxes(); 
}

@Test(priority=5,dependsOnMethods= {"SearchInHomePage"})
public void SearchedCourseDetails() {

	searchescourse.ShowDataOfSearchedElements();
}


@Test(priority=6)
public void GoToForEnterprises() throws InterruptedException, IOException {

	driver.findElement(By.xpath("//a[@data-click-key='search.search.click.logo']")).click();
	Thread.sleep(5000);
	page.goToEnterPrise();
	System.out.println("--------------------------------------------");
	System.out.println("Its clicking on Enterprise");
}
@Test(priority=7)
public void GoToForCampus() throws IOException {
	page.goCampus();
	System.out.println("--------------------------------------------");
	System.out.println("Its clicking on Campus");
}
@Test(priority=8,dependsOnMethods= {"GoToForCampus"})
public void ScrollToForm() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	// to display the scroll thread.sleep is used , not to synchronize
	 try {
	     Thread.sleep(2000);
		 }catch(Exception e) {
			 System.out.println(toString());
		 }
	WebElement form = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mktoForm_1512\"]")));
	js.executeScript("arguments[0].scrollIntoView();",form );
	 try {
	 screenshot.GetScreenShotOfWholePage(driver, "NotFilledForm");
	 }
	 catch(IOException e) {
		 System.out.println(e.toString());
	 }
}
@Test(priority=9,dataProvider="dp",dependsOnMethods= {"GoToForCampus"})
public void FormFillUp(String FirstName, String LastName, String email, String PhoneNO,String InstitutionType, String InstituteName,String jobRole, String Department, String Description1,String Description2, String Country, String State ) throws Exception {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Form = new FormInCampusPage(driver);
	String WarningMessage =Form.fillingForm(FirstName,LastName,email,PhoneNO,InstitutionType,InstituteName,jobRole,Department,Description1,Description2,Country,State );
	Assert.assertNotNull(WarningMessage,"Test is Failing as Warning message is Null ");
	 try {
	 screenshot.GetScreenShotOfWholePage(driver, "FilledForm");
	 }
	 catch(IOException e) {
		 System.out.println(e.toString());
	 }
	Thread.sleep(5000);
	
}


@DataProvider(name="dp")
public String[][] FormData() throws IOException {
	
	DataDrivenTesting datas = new DataDrivenTesting();
	XSSFSheet sheet = datas.workBook.getSheet("FormInput");
	XSSFRow row = sheet.getRow(0);
	int totalCol=row.getLastCellNum();
	String data[][] = new String[1][totalCol-3];
	int j = 0;
	for(int i = 0; i < totalCol;i++) {
		if(i==3||i==4||i==12) {
			continue;
		}
	data[0][j] = datas.getFormInputFromExcelSheet(i);
	j++;
	}
	return data;
}
@AfterClass
void tearDown() {
	driver.quit();
}
}

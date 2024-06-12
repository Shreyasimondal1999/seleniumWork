package PracticePath;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class OnlineMiniProject {
	public static void main(String args[]) throws Exception {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		//taking screenshot of the whole page using TakesScreenShot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File TargetFile = new File("C:\\Users\\2332934\\eclipse-workspace\\SeleniumProject\\ScreenShot\\MiniprojectAmazonHomePage.png");
		FileUtils.copyFile(srcFile, TargetFile);
		//selecting search box 
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
		//giving user input in the searchBox
		String excelFile=System.getProperty("user.dir")+"\\target\\SearchKeyInput.xlsx";
		String searchData = UtilityFile.getCellData(excelFile, "Sheet1", 1, 0);
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys(searchData);
		//selcting search button
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		//taking screenshot of the input box
		WebElement inputBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		srcFile=inputBox.getScreenshotAs(OutputType.FILE);
		TargetFile = new File("C:\\Users\\2332934\\eclipse-workspace\\SeleniumProject\\ScreenShot\\MiniprojectAmazonInputBox.png");
		FileUtils.copyFile(srcFile, TargetFile);
		//validate the search string,
		String searchString = "mobile smartphones under 30000";
		String ActualString = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3]")).getText();
		String ActualStringWithOutComma = ActualString.replace("\"", " ").trim();
		if(searchString.equals(ActualStringWithOutComma)) {
			System.out.println("Actual search string is : " + ActualStringWithOutComma);
			System.out.println("Validation passed");
		}
		else {
			System.out.println("Validation failed.");
		}
		
		
		//number of pages( e.g. 1-16),
		//number of items (over 90,000)
		String searchResult = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")).getText();
		String searchResultArray[]=searchResult.split(" ");
		String pageCount = searchResultArray[0].split("-")[1];
		if(Integer.parseInt(pageCount)>1) {
			System.out.println("Search result has items of more than 1 page, that is : "+ pageCount + " pages");
			String TotalItems = searchResultArray[3];
			System.out.println("Total resultant items for the search result is : " + TotalItems);
		}
		
		//click on 'sort by list' listbox
		driver.findElement(By.xpath("//select[@name = 's']//following-sibling::span//span[@class='a-button-text a-declarative']")).click();
		
		//Application should display four sort by options in the list. Check the count of options displayed.
		List<WebElement> sortListOptions = driver.findElements(By.xpath("//ul[@tabindex='-1']/li"));
		System.out.println("Count of the options Displayed : " + sortListOptions.size());
		
		//Select option “Newest Arrivals”
		for (WebElement ele : sortListOptions ) {
			if(ele.getText().equals("Newest Arrivals")) {
				ele.click();
			}
		}
		//Verify that  “Newest Arrivals” option got selected correctly or not.
		
		String selectedOption = driver.findElement(By.xpath("//span[@class = 'a-button-text a-declarative']/span[2]")).getText();
		if(selectedOption.equals("Newest Arrivals")) {
			System.out.println(selectedOption + " option is selected");
		}
		else {
			System.out.println(selectedOption + " option is not selected");
		}
		
		
		
		//Thread.sleep(5000);
		//Close the browser.
		driver.close();
	}

}

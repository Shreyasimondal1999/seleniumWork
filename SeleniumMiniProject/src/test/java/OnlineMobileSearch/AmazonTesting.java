package OnlineMobileSearch;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OnlineMobileSearch.UtilityFile;

public class AmazonTesting {
	public static void main(String args[]) throws Exception {
        String BrowserName;
		Scanner sc = new Scanner(System.in);
		//taking the browser name input
		System.out.println("Enter the Browser Name you want to use for testing (Chrome/Edge): ");
		BrowserName = sc.nextLine();
		WebDriver driver = null;
		//setting the driver with either Chrome or Edge browser
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			driver=DriverSetUp.ChromeDriver(BrowserName);
		}
		if(BrowserName.equalsIgnoreCase("Edge")) {
			driver=DriverSetUp.ChromeDriver(BrowserName);
		}
		
		
		
		
		
		//Row and Column index value to keep output of test result in the excel file
		int row=0;
		int col=0;
		//Excel file location to do data driven testing
		String excelFile=System.getProperty("user.dir")+"\\target\\SearchKeyInput.xlsx";
		//setting output sheet
		UtilityFile.setCellData(excelFile, "Output", row, col, "Output");
		row = row+1;

		
		
		
		
		
		//taking screenshot of the whole home page using TakesScreenShot interface
		ScreenShot.getScreenShotOfWholePage("HomePage", driver);
		
		
		//selecting search box 
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
		//giving user input in the searchBox
		//excelFile=System.getProperty("user.dir")+"\\target\\SearchKeyInput.xlsx";
		String searchData = UtilityFile.getCellData(excelFile, "Input", 1, 0);
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys(searchData);
		//selcting search button
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		
		
		
		//taking screenshot of the input field box
		WebElement inputBox = driver.findElement(By.id("nav-search-bar-form"));
		ScreenShot.getScreenShotOfParticullarElement("InputboxElement", driver, inputBox);
		
		
		
		
		//validate the search string,
		String searchString = "mobile smartphones under 30000";
		String ActualString = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3]")).getText();
		String ActualStringWithOutComma = ActualString.replace("\"", " ").trim();
		if(searchString.equals(ActualStringWithOutComma)) {
		
			System.out.println("Actual search string is : " + ActualStringWithOutComma);
			UtilityFile.setCellData(excelFile, "Output", row, col, "Validation passed");
			row=row+1;
			System.out.println("Validation passed");
		}
		else {
			UtilityFile.setCellData(excelFile, "Output", row, col, "Validation failed");
			row=row+1;
			System.out.println("Validation failed.");
		}
		
		
		
		
		//number of pages( e.g. 1-16),
		//number of items (over 90,000)
		String searchResult = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")).getText();
		String searchResultArray[]=searchResult.split(" ");
		String pageCount = searchResultArray[0].split("-")[1];
		if(Integer.parseInt(pageCount)>1) {
			UtilityFile.setCellData(excelFile, "Output", row, col, "Search result has items of more than 1 page, that is : "+ pageCount + " pages");
			row=row+1;
			System.out.println("Search result has items of more than 1 page, that is : "+ pageCount + " pages");
			String TotalItems = searchResultArray[3];
			UtilityFile.setCellData(excelFile, "Output", row, col,"Total resultant items for the search result is : " + TotalItems);
			row=row+1;
			System.out.println("Total resultant items for the search result is : " + TotalItems);
		}
		
		
		
		
		//click on 'sort by list' listbox
		driver.findElement(By.xpath("//select[@name = 's']//following-sibling::span//span[@class='a-button-text a-declarative']")).click();
		//Taking Screen shot of the webPage , while dropDown is clicked
		ScreenShot.getScreenShotOfWholePage("DropDownListPage", driver);
		//Application should display four sort by options in the list. Check the count of options displayed.
		List<WebElement> sortListOptions = driver.findElements(By.xpath("//ul[@tabindex='-1']/li"));
		UtilityFile.setCellData(excelFile, "Output", row, col, "Count of the options Displayed : " + sortListOptions.size());
		row=row+1;
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
			UtilityFile.setCellData(excelFile, "Output", row, col, selectedOption + "option is selected");
			row=row+1;
			System.out.println(selectedOption + " option is selected");
		}
		else {
			UtilityFile.setCellData(excelFile, "Output", row, col, selectedOption + "option is not selected");
			row=row+1;
			System.out.println(selectedOption + " option is not selected");
		}
		
		

		//Close the browser.
		driver.close();
		UtilityFile.setCellData(excelFile, "Output", row, col, "Browser Closed");
		//System.out.println("Browser Closed");
		
	}


}

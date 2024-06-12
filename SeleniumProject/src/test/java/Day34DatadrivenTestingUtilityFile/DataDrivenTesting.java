package Day34DatadrivenTestingUtilityFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

public class DataDrivenTesting {
	public static void main(String args[]) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String file =System.getProperty("user.dir")+"\\TestData\\caldata.xlsx";
		int totalRow=UtilityFile.getRowCount(file,"Sheet1");
		for(int i=0;i<totalRow;i++) {
			//read data from excel for column no 0
			String principle=UtilityFile.getCellData(file,"sheet1",i,0);
		    String Rate_ofInterest=UtilityFile.getCellData(file,"sheet1",i,1);
		    String period=UtilityFile.getCellData(file,"sheet1",i,2);
		    String Frequency=UtilityFile.getCellData(file,"sheet1",i,3);
		    String MaturityVal=UtilityFile.getCellData(file,"sheet1",i,4);
		    String Expected=UtilityFile.getCellData(file,"sheet1",i,5);
			
			//pass data to the app
		    driver.findElement(By.xpath("//*[@id=\"principal\"]")).clear();
		    driver.findElement(By.xpath("//*[@id=\"principal\"]")).sendKeys(principle);
		    System.out.println("------------------------");
		    driver.findElement(By.xpath("//*[@id=\"interest\"]")).clear();
		    driver.findElement(By.xpath("//*[@id=\"interest\"]")).sendKeys(Rate_ofInterest);
		    System.out.println("------------------------");
		    driver.findElement(By.xpath("//*[@id=\"tenure\"]")).clear();
		    driver.findElement(By.xpath("//*[@id=\"tenure\"]")).sendKeys(period);
		    System.out.println("------------------------");
		    
		    driver.findElement(By.xpath("//*[@id=\"frequency\"]")).click();
		    List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"frequency\"]/option"));
		    for(int j=0;j<list.size();j++) {
		    	if(list.get(j).getText().equals("Frequency")) {
		    		list.get(j).click();
		    	}
		    }
			//validation and update results in excel
		    
		    
		    
		}
		driver.close();
		
	}

}

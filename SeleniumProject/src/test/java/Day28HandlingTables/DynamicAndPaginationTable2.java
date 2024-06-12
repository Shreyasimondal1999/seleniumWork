package Day28HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicAndPaginationTable2 {
	
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://testautomationpractice.blogspot.com/");
		int totalRow = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr")).size();
		int totalCol = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr/th")).size();
        int totalPage=driver.findElements(By.xpath("//ul[@class='pagination']/li")).size();
		for(int page=1;page<=totalPage;page++) {
			if(page==1) {
				System.out.println("ActivePage is :"+page);
				for(int row=1;row<totalRow;row++) {
					WebElement ele = driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr["+row+"]"));
					System.out.println(ele.getText());	
					continue;
				}
			}else {
				System.out.println("ActivePage is :"+page);
				
				driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()='"+page+"']")).click();
				for(int row=1;row<totalRow;row++) {
					WebElement ele = driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr["+row+"]"));
					System.out.println(ele.getText());	
				}
			}

			
		}
	}

}

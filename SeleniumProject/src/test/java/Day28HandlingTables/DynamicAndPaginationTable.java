package Day28HandlingTables;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DynamicAndPaginationTable {
	public static void main(String args[]) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demo.opencart.com/admin/");
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Demo");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	    password.click();
	    password.clear();
	    password.sendKeys("demo");
	    driver.findElement(By.tagName("button")).click();
	    driver.findElement(By.xpath("//button[@class='btn-close']")).click();
	    driver.findElement(By.xpath("//div[@id='navigation']/following-sibling::ul/li[@id='menu-customer']/a")).click();
	    driver.findElement(By.xpath("//div[@id='navigation']/following-sibling::ul/li[@id='menu-customer']//ul/li[1]/a")).click();
	    String text = driver.findElement(By.xpath("//div[@class='table-responsive']/following-sibling::div/div[2]")).getText();
	    String subString[] = text.split(" \\(");
	    String subString1[]=subString[1].split(" ");
	   int page = Integer.parseInt(subString1[0]);
	   
	   System.out.println("Total pages = " + page);
	   
	   //handdling dynamic table with pagination
	   
	   
	   for(int i = 1;i<=3;i++) {
		   if(page>1) {
			 String activePageNo=driver.findElement(By.xpath("//ul[@class='pagination']/li/span")).getText() ; 
			 System.out.println("Active page no "+ activePageNo);
			 if(i>1) {
			 driver.findElement(By.xpath("//*[@id=\"form-customer\"]//li/*[text()="+i+"]")).click();
			 }
		   }
		   int rowNo=driver.findElements(By.xpath("//div[@class='table-responsive']/table//tbody/tr")).size();
		   System.out.println(rowNo);
		   for(int row=1;row<rowNo;row++) {
			   String rowData= driver.findElement(By.xpath("//div[@class='table-responsive']/table//tbody/tr["+row+"]")).getText();
			   
			   System.out.println(rowData);
		   }
		   System.out.println();
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    Thread.sleep(3000);
	    driver.close();
	}

}

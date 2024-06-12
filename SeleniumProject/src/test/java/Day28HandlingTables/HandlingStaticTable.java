package Day28HandlingTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class HandlingStaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//finding total no of rows\
		int Total_row = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
		System.out.println(Total_row);
		//finding total no of columns
		int Total_col = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr/th")).size();
		System.out.println(Total_col);
		//reading specific row and column data
		String specificData= driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[2]")).getText();
		System.out.println(specificData);
		
		//reading the whole table
		System.out.println("Table Data: ");
		for(int row = 2; row<=Total_row;row++) {
			for (int col = 1; col<=Total_col;col++) {
				//reading specific row and column data
				String Data= driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+row+"]/td["+col+"]")).getText();
				System.out.print(Data+ " ");
			}
			System.out.println();
		}
		//readng data based on condition. find the book name whose author is amit
		for(int row=2; row<=Total_row;row++) {
			String Author = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+row+"]/td[2]")).getText();
			if(Author.equals("Amit")) {
				String Book = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+row+"]/td[1]")).getText();
				System.out.println("Author "+ Author + "Book " + Book);
				
			}
		}
		driver.close();

	}

}

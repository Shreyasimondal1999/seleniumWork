package Day33ApachePOIDataDrivenTestingUsingMSExcel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//apache poi works for ms excel only
//excel--->workbook-->sheets--->rows--->cell
public class ReadingExcel {
	public static void main(String args[]) throws IOException {
		//reading the data from excel file
		//FileInputStream file = new FileInputStream("C:\\Users\\2332934\\eclipse-workspace\\SeleniumProject\\TestData\\data.xlsx");
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\data.xlsx");
	//geting the workbook
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	//getting sheet
	//workbook.getSheet("Sheet1");
	XSSFSheet sheet=workbook.getSheetAt(0);
	//sheet.getRow(0);
	//getting total no of rows
	int TotalRow=sheet.getLastRowNum();
	System.out.println("total row: "+TotalRow);
	//getting the row, row indexing start from 0
	XSSFRow row=sheet.getRow(1);

	//getting total cells
	int totalCell=row.getLastCellNum();
	//reading the whole row
	for(int i=0;i<totalCell;i++) {
		System.out.print(row.getCell(i).toString()+" ");
	}
	//printing the whole sheet data
	System.out.println("Printing the whole row:\n");
	for(int r=1;r<TotalRow;r++) {
		for(int c = 0; c<totalCell;c++) {
			System.out.print(sheet.getRow(r).getCell(c).toString()+" ");
		}
		System.out.println();
	}
	System.out.println("\ntotal cell: "+TotalRow);
	//getting the cell, cell indexing start from 0
    XSSFCell cell=row.getCell(1);
    //getting or reading cell data
    System.out.println(cell);
    
    //closing workbook and file
    workbook.close();
    file.close();
	}

}

package Coursera;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {
	public static FileInputStream sourceFile;
	public static XSSFWorkbook workBook;
	public static XSSFSheet workSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public  String getInputFromExcelSheet() throws IOException {
		String InputValue = "";
		//File InputStream throws FileNotFoundException
		sourceFile = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Coursera Search Data.xlsx" );
		
		//XSSFWorkbook throws IOException
		workBook = new XSSFWorkbook(sourceFile);
		
		//getting the Sheet from the  MS Excel file
		workSheet = workBook.getSheet("Input");
		//getting row
		row = workSheet.getRow(0);
		//get cell 
		cell = row.getCell(0);
		InputValue = cell.toString();
		
		return InputValue;
    }
	public  String getFormInputFromExcelSheet(int colNum) throws IOException {
		String InputValue = "";
		//File InputStream throws FileNotFoundException
		//sourceFile = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Coursera Search Data.xlsx" );
		
		//XSSFWorkbook throws IOException
		//workBook = new XSSFWorkbook(sourceFile);
		
		//getting the Sheet from the  MS Excel file
		workSheet = workBook.getSheet("FormInput");
		//getting row
	
		row = workSheet.getRow(0);
		//get cell 
         cell = row.getCell(colNum);
			DataFormatter formatter = new DataFormatter();
			InputValue= formatter.formatCellValue(cell);//returns string value only
           
		return InputValue;
    }
}
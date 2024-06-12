package Day33ApachePOIDataDrivenTestingUsingMSExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcelSheet {
	public static void main(String args[]) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\newFile.xlsx");
		//creating new workbook
		XSSFWorkbook workbook=new XSSFWorkbook();
		//creating new Sheet
		XSSFSheet sheet=workbook.createSheet();
		//creating row
		XSSFRow row1 = sheet.createRow(0);
		XSSFRow row2 = sheet.createRow(1);
		//creating cell and setting cell data
		row1.createCell(0).setCellValue("shreyasi");
		row1.createCell(1).setCellValue(true);
		row2.createCell(0).setCellValue("ma");
		row2.createCell(1).setCellValue(true);
		//writng in the file
		workbook.write(file);
		//closing write
		workbook.close();
		//closing file
		file.close();
	}

}

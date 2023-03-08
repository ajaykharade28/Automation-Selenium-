package Readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {
public static void main(String[] args) throws IOException {
	
	
	FileInputStream file = new FileInputStream("./data/testdata.xlsx");
	XSSFWorkbook workbook  = new XSSFWorkbook(file); 
	
	XSSFSheet sheet = workbook.getSheet("IPL");
	
	int rowcount =sheet.getLastRowNum();
	
	int colcount=sheet.getRow(0).getLastCellNum();
	
//	XSSFRow row1 = sheet.getRow(5);
//	XSSFCell cell = row1.getCell(0);
//	cell.setCellValue("hello,world");
//	FileOutputStream fileout = new FileOutputStream("file");
//	workbook.write(fileout);
//	fileout.close();
//	workbook.close();
	
	for(int i=0;i<rowcount;i++)
	{
		XSSFRow row = sheet.getRow(i);
		
		for(int j=0;j<colcount;j++)
		{
			String value=row.getCell(j).getStringCellValue();
			System.out.print("     "  +value);
		}
		System.out.println();
		
	}
//	
	
	
	
	
	
	
	
	
	
}
}

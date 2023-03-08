package Readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readexceldata {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("IPL");
		for(int i=0;i<6;i++)
		{
		   Row row = sheet.getRow(i);
		
		        for(int j=0;j<6;j++)
		        {
		        	Cell cell = row.getCell(0);
		        	String data = cell.getStringCellValue();
		        	System.out.print("     " +data);
		        }
		System.out.println();
		}
	
//		for(int i=0;i<6;i++)
//		{
//		Row row = sheet.getRow(i);
//		Cell cell = row.getCell(1);
//		String data = cell.getStringCellValue();
//		System.out.println(data);
//		}
		
	}
}

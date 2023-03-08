package Readexceldata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Sheet1");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("hello,world");
		FileOutputStream fileout = new FileOutputStream("wb.xlsx");
		wb.write(fileout);
		fileout.close();
		wb.close();
		
	}

}

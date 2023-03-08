package Readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculatedatadriven {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		
		
		FileInputStream file = new FileInputStream("./data/moneycontrol.xlsx");
		XSSFWorkbook workbook  = new XSSFWorkbook(file); 
		
		XSSFSheet sheet = workbook.getSheet("SHEET1");
		
		int rowcount =sheet.getLastRowNum();
		
		int colcount=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			int prin = (int)row.getCell(0).getNumericCellValue();
			int rate = (int)row.getCell(1).getNumericCellValue();
			String freq =row.getCell(2).getStringCellValue();
			int matureity = (int)row.getCell(3).getNumericCellValue();
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String.valueOf(prin));
			
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(String.valueOf(rate));
			
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(String.valueOf(freq));
			
			
			
			
		
			
			
		}
		
		
		
		
	}

}

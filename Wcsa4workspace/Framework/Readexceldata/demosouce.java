package Readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demosouce {

	public static void main(String[] args) throws IOException, InterruptedException {
		

		FileInputStream file = new FileInputStream("./data/soucedata.xlsx");
		 XSSFWorkbook workbook  = new XSSFWorkbook(file); 
		 XSSFSheet sheet = workbook.getSheet("SHEET1");
		 
		 //get total row count
		 int totalrow = sheet.getLastRowNum()+1;
		 int totalcell = sheet.getRow(0).getLastCellNum();
		 //System.out.println(totalrow);
		// System.out.println(totalcell);
		 for(int currentrow=1;currentrow<totalrow;currentrow++)
		 {
				

				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				Thread.sleep(1000);
				
				driver.get("https://www.saucedemo.com/");
				Thread.sleep(2000);
				driver.findElement(By.id("user-name")).sendKeys(sheet.getRow(currentrow).getCell(0).toString());
				driver.findElement(By.id("password")).sendKeys(sheet.getRow(currentrow).getCell(1).toString());
				driver.findElement(By.id("login-button")).click();
			 
			//WebElement header = driver.findElement(By.xpath("//div[@class='app_logo']"));	
			 driver.close();
		 }
		 
	}
	
}

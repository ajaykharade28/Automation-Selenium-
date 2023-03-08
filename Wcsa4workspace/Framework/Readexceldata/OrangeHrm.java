package Readexceldata;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
{
	
	
	FileInputStream fis = new FileInputStream("./data/Actitimetestdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("VALID");
	int totalrow = sheet.getLastRowNum();
	int totalcell = sheet.getRow(0).getLastCellNum();
	
	for(int currentrow=1; currentrow<totalrow; currentrow++)
	{
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(sheet.getRow(currentrow).getCell(0).toString());
		driver.findElement(By.name("password")).sendKeys(sheet.getRow(currentrow).getCell(1).toString());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.close();
	}
	
	
	
	
	
	
}
}

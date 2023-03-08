package ReadPropertiesFiles;

import java.time.Duration;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	readconfligfile conflig=new readconfligfile();
	        //String url=conflig.getURL();
	        String  browser=conflig.getbrowser();
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 break;		
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void closebrowser() 
	{
		driver.close();
		driver.quit();
	}

	
}

package testngpackage2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class1 {
	static WebDriver driver;
  @Test(description = "This testcase is for SQL")
  public void sql() throws InterruptedException 
  {
	  System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("sql");
		
	 // Reporter.log("method of class",true);
	  
  }
}




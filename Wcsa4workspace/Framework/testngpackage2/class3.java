package testngpackage2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class3 {
	static WebDriver driver;
	  @Test
	  public void java() throws InterruptedException 
	  {
		  System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			Thread.sleep(2000);
			driver.get("https://www.google.com/");
			driver.switchTo().activeElement().sendKeys("java");
			
		  
		  
	  }
}

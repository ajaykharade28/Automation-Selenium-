package Webelementmethod;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		   
		   driver.get("https://www.selenium.dev/");
		   WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		org.openqa.selenium.Point Loc = download.getLocation();
		   
		   
}
}
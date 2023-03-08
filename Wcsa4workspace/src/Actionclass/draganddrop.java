package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	Thread.sleep(2000);
	  
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(2000);
	
	
	
	WebElement source = driver.findElement(By.xpath("//div[@id='box6']"));

	WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(source, target).perform();
	
	
	
	
	
}
}

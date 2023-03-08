package Webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);

	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//    WebElement link = driver.findElement(By.partialLinkText(" popup window"));
	    // String textOfLink = link.getText();
	    // System.out.println(textOfLink);
		
		String text = driver.findElement(By.name("username")).getTagName();
		System.out.println(text);
	}
}
package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartsynchronization {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='X']"));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("span[.='Login']")).click();
		
	}

	
}

package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions act = new Actions(driver);
		
		//doubleclick action
		
		act.doubleClick(target).perform();
		Thread.sleep(2000);
		
		
	}

}

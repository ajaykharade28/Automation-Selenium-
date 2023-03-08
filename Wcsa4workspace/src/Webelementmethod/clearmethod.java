package Webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearmethod {
	public static void main(String[] args) throws InterruptedException {
		
	
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	   
	   driver.get("https://www.saucedemo.com/");

	   WebElement UsernameTextBox = driver.findElement(By.name("user-name"));
	   UsernameTextBox.sendKeys("Admin");
	   
	   WebElement PasswordTextBox = driver.findElement(By.name("password"));
	   PasswordTextBox.sendKeys("manager");
	   
	   Thread.sleep(2000);
	   UsernameTextBox.clear();
	   PasswordTextBox.clear();

}
}
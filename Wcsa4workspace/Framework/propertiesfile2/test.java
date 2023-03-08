package propertiesfile2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		readconflig conflig=new readconflig();
		driver.get(conflig.getURL());
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(conflig.getusername());
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(conflig.getpassword());
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.name("user-name")).sendKeys(conflig.getusername());
		driver.findElement(By.name("password")).sendKeys(conflig.getpassword());
		driver.findElement(By.id("login-button")).click();
		
		
	}

}

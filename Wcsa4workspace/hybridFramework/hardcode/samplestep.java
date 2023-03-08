package hardcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplestep {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.linkText("Create an Account")).click();
		driver.findElement(By.id("firstname")).sendKeys("Ajay");
		driver.findElement(By.id("lastname")).sendKeys("kharade");
		driver.findElement(By.id("email_address")).sendKeys("ajconstruction200@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ajay@123");
		Thread.sleep(1000);
		driver.findElement(By.id("password-confirmation")).sendKeys("Ajay@123");
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
		
		
	}

}

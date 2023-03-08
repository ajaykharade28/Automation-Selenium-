package Flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartmobile {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Sumsung Mobiles");
		driver.findElement(By.xpath("//button[@class='L2Z3Pu']")).click();
		Thread.sleep(2000);

	}

}

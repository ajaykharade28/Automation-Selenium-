package Flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartlaptop {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("HP Laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[.='Processor']")).click();
		driver.findElement(By.xpath("//div[.='Core i7' and (@class='_4921Z t0pPfW')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Brand']")).click();
	    driver.findElement(By.xpath("//div[.='HP']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='4★ & above']")).click();
		Thread.sleep(2000);
		
		String price = driver.findElement(By.xpath("//div[class='_4rR01T']/../following-sibling ::div[@class='col col-7-12']]")).click();
		System.out.println(price+" :price of HP Laptop");
		driver.quit();
	}

}

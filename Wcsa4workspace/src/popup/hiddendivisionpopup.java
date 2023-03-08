package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivisionpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		Thread.sleep(2000);

		driver.get("https://courses.letskodeit.com/practice");
		
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click(); //hide textbox
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('displayed-text').value='Ajay kharade'"); //enter Data
		
		
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click(); //click show button
		
		
	}

}

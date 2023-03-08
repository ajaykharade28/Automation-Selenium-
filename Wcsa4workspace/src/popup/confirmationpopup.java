package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationpopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		Thread.sleep(2000);

		driver.get("http://www.uitestpractice.com/Students/Switchto");
		
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Thread.sleep(2000);
		
		//to accept the popup
		//driver.switchTo().alert().accept();	
		
		//to rejet the popup use dismiss()method
		driver.switchTo().alert().dismiss();	
		
		
	}

}

package robotclass;

import java.io.IOException;
import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowbasedfile {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement target = driver.findElement(By.xpath("//input[@id='file-upload']"));
		Actions act=new Actions (driver);
		act.moveToElement(target).click().perform();
		
		try {
			Runtime.getRuntime().exec("C:\\Users\\om\\Desktop\\Selenium\\auto1.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}

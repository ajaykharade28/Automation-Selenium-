package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		loginpage2 loginpg = new loginpage2(driver);
		
		driver.get("https://www.saucedemo.com/");
		loginpg.enterusername("standard_user");
		loginpg.enterpassword("secret_sauce");
		loginpg.clickonloginbtn();
		
		
		
	}

}

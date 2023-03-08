package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettittlemethod {
public static void main(String[] args) {
	
	System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive/");
	String titleOfLoginPage = driver.getTitle();
	System.out.println(titleOfLoginPage);
}
}

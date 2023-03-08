package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationpopup {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
	
		
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notification");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.justdial.com/");
		
		option.addArguments("--start-maximized");
		
		
	}
	
}

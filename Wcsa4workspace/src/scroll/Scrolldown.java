package scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scrolldown {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/search?q=flipcart&rlz=1C1FKPE_enIN1034IN1034&oq=fli&aqs=chrome.1.69i57j69i59j0i271l3j69i60.3499j0j15&sourceid=chrome&ie=UTF-8");
		Thread.sleep(2000);
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 Thread.sleep(2000);
			
		 //scrolldown
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(2000);
			
		 
		 //scrollup
		 js.executeScript("window.scrollBy(0,-500)");
		 Thread.sleep(2000);
			
		 
		 //scrollright
		 js.executeScript("window.scrollBy(100,0)");
		 Thread.sleep(2000);
		
		 
		 //scrollleft
		 js.executeScript("window.scrollBy(-100,0)");
		 Thread.sleep(2000);
			
		 
		 //scrollcombine
		 js.executeScript("window.scrollBy(500,500)");
		
	}

}

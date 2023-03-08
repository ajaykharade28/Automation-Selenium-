package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class sceenshorts {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("WebDriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.instagram.com/");
		 
		TakesScreenshot f = ((TakesScreenshot)driver);
		
		File source = f.getScreenshotAs(OutputType.FILE);
			
		File dest = new File("C:\\Users\\om\\Desktop\\sceenshots.jpg");
		
		Files.copy(source, dest);
		
	}
		
	
}

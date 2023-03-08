package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("WebDriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.get("https://trytestingthis.netlify.app/");
	
	WebElement D = driver.findElement(By.xpath("//select[@id='option']"));
	Select dropdownlist=new Select(D);
	Thread.sleep(2000);
	// dropdownlist.selectByIndex(1);
	// dropdownlist.selectByValue("Microsoft");
	 //dropdownlist.selectByVisibleText("Yahoo");
	 
	//dropdownlist.getOptions().size();
	
	
	 
	 List<WebElement> option = dropdownlist.getOptions();
	 for(WebElement alloption: option)
	 {
		 System.out.println(alloption.getText());
	
	
		Thread.sleep(2000);
		
		 if(alloption.getText().equals("Option 2"));
		 {
			 alloption.click();
			 break;
		 }
	 }
	 }
	
	
	
}



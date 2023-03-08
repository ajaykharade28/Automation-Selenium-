package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesourcecode {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromr.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String SourceCode=driver.getPageSource();
        Thread.sleep(2000);
        System.out.println(SourceCode);
	}

}

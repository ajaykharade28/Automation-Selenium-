	package testngpackage2;
	
	import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	public class crossbrowsertesting {
		
		
		WebDriver driver;
		@BeforeMethod
		@org.testng.annotations.Parameters("browser")
		public void lounchbrowser(String browser) 
		{
			switch(browser.toLowerCase())
			{
			case "chrome":
				System.setProperty("WebDriver.chrome.driver","./driver/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case "msedge":
				System.setProperty("WebDriver.Edgedriver.driver","./driver/msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				break;
				
			default:
				driver=null;
				break;
			}
			
			
		}
		@Test
		public void verfiypage() 
		{
			driver.get("https://www.google.com/");
			String expectedtittle="Google";
			String actualtittle = driver.getTitle();
			Assert.assertEquals(expectedtittle, actualtittle);
		}
		@AfterMethod
		public void quit() 
		{
		 driver.close();	
		}
	
	}

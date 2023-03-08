package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickoncreate 
{
	WebDriver driver;
	public clickoncreate(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy(linkText = "Create an Account")
	WebElement create;
	
	
	public void clickoncreate() 
	{
		create.click();
	}
}

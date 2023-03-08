package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myaccount {
	WebDriver driver;
	public myaccount(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy(id = "firstname")
	WebElement first;
	
	@FindBy(id = "lastname")
	WebElement last;
	
	@FindBy(id = "email_address")
	WebElement email;
	
	@FindBy(id = "password")
	WebElement pass;
	

	@FindBy(id = "password-confirmation")
	WebElement passconfirm;
	
	@FindBy(xpath = "//button[@class='action submit primary']")
	WebElement btn;
	
	
	
	
	public void enterfirstname(String firstname) 
	{
		first.sendKeys(firstname);
	}
	public void enterlastname(String lastname) 
	{
		last.sendKeys(lastname);
	}
	public void enteremailid(String emailid) 
	{
		email.sendKeys(emailid);
		
	}
	public void enterepassword(String password) 
	{
		pass.sendKeys(password);
		
	}
	public void enterpassconfirm(String passwordconfirmation) 
	{
		passconfirm.sendKeys(passwordconfirmation);
		
	}
	public void enterekey() 
	{
		btn.click();
		
	}
	


}

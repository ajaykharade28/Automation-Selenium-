package FinalTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.clickoncreate;
import PageObjectModel.myaccount;
import ReadPropertiesFiles.baseclass;
import ReadPropertiesFiles.readconfligfile;
import javacode.driver;

public class testcase1 extends baseclass{

	public static void main(String[] args) throws Exception
	{
		
   
		//to read page object class
		clickoncreate click=new clickoncreate(driver);
		myaccount myacc=new myaccount(driver);
		
		// to read readconfligclass
		readconfligfile conflig=new readconfligfile();
		String url=conflig.getURL();
		driver.get(url);
		
		
		
		//driver.get(conflig.getURL());
		click.clickoncreate();
		myacc.enterfirstname(conflig.getfirstname());
		myacc.enterlastname(conflig.getlastname());
		myacc.enteremailid(conflig.getemail());
		myacc.enterepassword(conflig.getpassword());
		myacc.enterpassconfirm(conflig.getconfirmpassword());
		myacc.enterekey();
		
		
		
		
		
		
		
		
		
		
	}

}

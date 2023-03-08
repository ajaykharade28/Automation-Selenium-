package ReadPropertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class readconfligfile {
	
	Properties proper;
	String path="C:\\Users\\om\\Desktop\\Wcsa4workspace\\Wcsa4workspace\\src2\\conflig.properties";
	
	public readconfligfile()
	{
		proper=new Properties();
		try {
			FileInputStream fis =new FileInputStream(path);
			try {
				proper.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getURL() 
	{
	 String	url=proper.getProperty("url");
	 if(url!=null)
		 return url;
	 else
		 throw new RuntimeException("not valid");
	 
	}

	public String getbrowser() 
	{
	 String	browser=proper.getProperty("browser");
	 if(browser!=null)
		 return browser;
	 else
		 throw new RuntimeException("not valid");
	 
	}

	
	
	
	

	public String getfirstname() throws Exception 
	{
	 String	firstname=proper.getProperty("firstname");
	 if(firstname!=null)
		 return firstname;
	 else
		 throw new Exception("not valid");
	}
	
	public String getlastname() throws Exception 
	{
	 String	lastname=proper.getProperty("lastname");
	 if(lastname!=null)
		 return lastname;
	 else
		 throw new Exception("not valid");
	}
	
	public String getemail() throws Exception 
	{
	 String	emailid=proper.getProperty("emailid");
	 if(emailid!=null)
		 return emailid;
	 else
		 throw new Exception("not valid");
	}
	
	public String getpassword() throws Exception 
	{
	 String	password=proper.getProperty("password");
	 if(password!=null)
		 return password;
	 else
		 throw new Exception("not valid");
	}
	
	public String getconfirmpassword() throws Exception 
	{
	 String	confirmpassword=proper.getProperty("confirmpassword");
	 if(confirmpassword!=null)
		 return confirmpassword;
	 else
		 throw new Exception("not valid");
	}
	
	
	
	
	
	
	
	
	
}

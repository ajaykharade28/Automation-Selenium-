package propertiesfile2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readconflig {
	
	Properties propertie;
	String path="C:\\Users\\om\\Desktop\\Wcsa4workspace\\Wcsa4workspace\\src\\propertiesfile2\\conflig.properties";
	
	public readconflig()
	{
		propertie=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(path);
			propertie.load(fis);
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
   public String getURL() throws Exception
   {
	   
	String url = propertie.getProperty("url");
	if(url != null)
		return url;
	else
		throw new RuntimeException("url is not specified");
	 
   }
   
   public String getusername() throws Exception
   {
	String username = propertie.getProperty("username");
	if(username != null)
		return username;
	else
		throw new RuntimeException("username is not specified");
	 
   }
   
   public String getpassword() throws Exception
   {
	String password = propertie.getProperty("password");
	if(password != null)
		return password;
	else
		throw new RuntimeException("password is not specified");
	 
   }
	
}

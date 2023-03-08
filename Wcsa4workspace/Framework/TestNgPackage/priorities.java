package TestNgPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorities {
	@Test(priority = 3)
	  public void a() 
	  {
		  //System.out.println("this is a demo method");
		  Reporter.log("a",true);
		  
	  }
	@Test(priority = 2)
	  public void b() 
	  {
		  //System.out.println("this is a demo method");
		  Reporter.log("b",true);
		  
	  }
	@Test(priority = 7)
	  public void c() 
	  {
		  //System.out.println("this is a demo method");
		  Reporter.log("c",true);
		  
	  }
	@Test(priority = 0)
	  public void d() 
	  {
		  //System.out.println("this is a demo method");
		  Reporter.log("d",true);
		  
	  }
}

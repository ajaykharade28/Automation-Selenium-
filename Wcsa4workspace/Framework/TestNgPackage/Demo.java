package TestNgPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() 
  {
	  //System.out.println("this is a demo method");
	  Reporter.log("this is a demo method");
	  
  }
  @Test
  public void demo1() 
  {
	  //System.out.println("this is a demo method");
	  Reporter.log("this is a demo1 method");
	  
  }
  @Test
  public void demo2() 
  {
	  int a=10;
	  int b=0;
	  int res =a/b;
	  //System.out.println("this is a demo method");
	  Reporter.log("this is a demo2 method");
	  
  }
}

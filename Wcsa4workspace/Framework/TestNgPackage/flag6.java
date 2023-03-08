package TestNgPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag6 {
  @Test(groups = "FUNCTION")
  public void ftl() 
  
 {
	  Reporter.log("function testing1",true);
  }
  @Test(groups = "FUNCTION")
  public void itl() 
  
 {
	  Reporter.log("integration testing1",true);
  }
  @Test(groups = "FUNCTION")
  public void stl() 
  
 {
	  Reporter.log("system testing1",true);
  }

//------------------------------------------------
@Test(groups = "INTEGRATION")
public void ft2() 

{
	  Reporter.log("function testing2",true);
}
@Test(groups = "INTEGRATION")
public void it2() 

{
	  Reporter.log("integration testing2",true);
}
@Test(groups = "INTEGRATION")
public void st2() 

{
	  Reporter.log("system testing2",true);
}
//---------------------------------------------------------
@Test(groups = "SYSTEM")
public void ft3() 

{
	  Reporter.log("function testing3",true);
}
@Test(groups = "SYSTEM")
public void it3() 

{
	  Reporter.log("integration testing3",true);
}
@Test(groups = "SYSTEM")
public void st3() 

{
	  Reporter.log("system testing3",true);
}
//-----------------------------------------------------






}
























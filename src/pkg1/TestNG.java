package pkg1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {
  @Test
  public void DemoMethod1() 
  {
	  System.out.println("HI I am Demo1");
  }
  @Test
  public void DemoMethod2() 
  {
	  //System.out.println("HI I am Demo2");
    Reporter.log("Hi I am Demo2");
  
  }
  @Test
  public void DemoMethod3() 
  {
	//  System.out.println("HI I am Demo3");
	  Assert.fail();
	  Reporter.log("HI i am Demo3",true);
  }
  @Test
  public void DemoMethod4() 
  {
	  
	  System.out.println("HI I am Demo4");
	  
  } 
  @Test
  public void DemoMethod5() 
  {
	  System.out.println("HI I am Demo5");
  } 
  @Test
  public void DemoMethod6() 
  {
	  System.out.println("HI I am Demo6");
  }
}

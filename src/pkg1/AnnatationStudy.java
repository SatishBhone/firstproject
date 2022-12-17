package pkg1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnatationStudy
{
	@BeforeMethod
	public  void beforeMethod()
	{
		Reporter.log("Login to the Application", true);
	}
	@BeforeClass
	public void beforeClass() 
	{
		Reporter.log("Lonch The browser ", true);
	}
	
    @Test
   public  void ValidateUserName() 
   {
	   Reporter.log("UserName is Validated", true);
   }

    @AfterMethod
    public  void afterMethod() 
    {
    	Reporter.log("LogOut ", true);
    }
    
    @AfterClass
    public void afterClass() 
    {
    	Reporter.log("Close Browser", true);
    }

}

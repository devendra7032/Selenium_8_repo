package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TestScript 
{
@Test																		
	public void login()
	{
		Reporter.log("Launch Browser",true);
		Reporter.log("Navigate to url",true);
		Reporter.log("Click on login link",true);
		Reporter.log("Enter valid Credential",true);
		Reporter.log("Click on login button",true);
		Assert.assertEquals(false,true );
	}

}

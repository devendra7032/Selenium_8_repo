package Assignments;

import org.testng.annotations.Test;

public class Assignment25 
{
	@Test(priority=1)
	public void creatAccount()
	{
		
	}
	@Test(priority=2,dependsOnMethods="createAccount",invocationCount = 2,threadPoolSize = 2)
	public void editAccount()
	{
		
	}
	@Test(priority=3,dependsOnMethods="createAccount,editAccount",invocationCount = 2,threadPoolSize = 2)
	public void deleteAccount()
	{
		
	}

}

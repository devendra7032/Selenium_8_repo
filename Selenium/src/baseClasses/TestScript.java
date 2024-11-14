package baseClasses;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends Class
{
	@Test
	public void sales()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Sales']")).isEnabled());
		Reporter.log("the user is able to click successfully",true);
		

}
}

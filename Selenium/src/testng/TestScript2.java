package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass1
{
	@Test
	public void clickOnSales()
	{
		driver.findElement(By.xpath("//span[text()='Sales']")).click();
		if(driver.getTitle().equals("\r\n"
				+ "        Sales History\r\n"
				+ "      "));
		
	}

}

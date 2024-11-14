package listeners;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{ 
	//public webdriver driver;
	public static WebDriver driver;//sdriver;
	
	@BeforeClass
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		//sdriver=driver;
		
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}

package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleChildWindowpopup 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		driver.get("https://www.shoppersstack.com/products_page/24");
		driver.findElement(By.id("compare")).click();
		
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String id:allwindowIds)
		{
			driver.switchTo().window(id);//switch to any window
			String url = driver.getCurrentUrl();//Capture url of the window
			if(url.contains("flipkart")) {//compare url with expect
				break;
			}
		}
		driver.manage().window().maximize();
		driver.close();
		
	}

}

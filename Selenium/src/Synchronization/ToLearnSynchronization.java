package Synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSynchronization 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
//        Thread.sleep(15000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		 System.out.println(alllinks.size());
//		driver.findElement(By.id("loginBtn")).click();
//		driver.navigate().refresh();
		
		
	}

}

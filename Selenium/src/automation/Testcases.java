package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcases 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://webdev.gigin.ai/");
		driver.findElement(By.id("email")).sendKeys("testaccount@gigin.ai");
	    driver.findElement(By.id("password")).sendKeys("Password1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

		
		driver.findElement(By.id("email")).sendKeys("testaccount@gigin.i");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='error-message']")).getText();

		
		driver.findElement(By.id("email")).sendKeys("testaccount@gigin.ai");
	    driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.xpath("//div[@class='error-message']")).getText();
		
		driver.findElement(By.id("email")).sendKeys("testaccount@gigin.ai");
	    driver.findElement(By.id("password")).sendKeys("Password");
	    driver.findElement(By.xpath("//div[@class='error-message']")).getText();
//	    driver.navigate().to("https://webdev.gigin.ai");
//	    
//		
		
		
	    
	     
		
		

		
		
	
		
		
		
	}
	

}

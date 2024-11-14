package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://webdev.gigin.ai/admin");
		driver.findElement(By.name("company")).sendKeys("examplesoft");
		driver.findElement(By.name("datePosted")).sendKeys("9-10-2024");
		driver.findElement(By.name("batch")).sendKeys("a1");
		driver.findElement(By.name("link")).sendKeys("https://examplesoft/link.com");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		driver.findElement(By.xpath("//div[@class='login-container']")).isDisplayed();
		
	}

}

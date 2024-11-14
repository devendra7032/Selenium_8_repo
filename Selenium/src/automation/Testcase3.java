package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://webdev.gigin.ai/joblist");
		driver.findElement(By.xpath("(//div[@class='job-details'])[6]")).isDisplayed();
		driver.findElement(By.xpath("(//button[text()='Apply'])[6]")).click();
		driver.findElement(By.xpath("//span[@class='applied-label']")).getText();
		
	}

}

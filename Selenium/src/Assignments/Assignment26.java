package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment26 
{
	@Test
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://automationexercise.com/");
		Assert.assertEquals(driver.getTitle(),"Automation Exercise","Home page is not displayed");
		Reporter.log("Home page is displayed",true);
		
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	    Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
	    Reporter.log("Login to your account",true);
	    
	    driver.findElement(By.name("email")).sendKeys("reddy122@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("reddy122");
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
	    Assert.assertTrue(driver.findElement(By.tagName("b")).isDisplayed());
	    Reporter.log("Account Deleted!",true);
		

		
		
		
	}
}

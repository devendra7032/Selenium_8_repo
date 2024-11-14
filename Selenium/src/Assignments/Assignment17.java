package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment17 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement map = driver.findElement(By.xpath("//*[@id=\"map-instance-16223\"]"));
		driver.switchTo().frame(map);
		driver.findElement(By.xpath("//*[@id='montana']")).click();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("user")).sendKeys("testing@112");
		driver.findElement(By.id("pass")).sendKeys("testing123");
		driver.findElement(By.id("cpass")).sendKeys("testing123");
		driver.findElement(By.id("firstName")).sendKeys("deva");
		driver.findElement(By.id("lastName")).sendKeys("deva1234");
		driver.findElement(By.id("phone")).sendKeys("9398033183");
		WebElement type = driver.findElement(By.id("user-type"));
		Select selecttype=new Select(type);
		selecttype.selectByValue("1");
		driver.findElement(By.id("accept-tou")).click();
		WebElement button = driver.findElement(By.linkText("//button[@type='submit']"));
		
	
	}

}

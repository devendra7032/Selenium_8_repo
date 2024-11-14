package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment21 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount");
		
	    driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
	 
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("‪C:\\Users\\Kamasani Mohan reddy\\OneDrive\\Documents");
		
		
	}
}

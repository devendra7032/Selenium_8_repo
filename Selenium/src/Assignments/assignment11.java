package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment11 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']")).click();
		driver.findElement(By.id("add-to-cart-button-31")).click();
	    String message = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialog-notifications-error")));
	    WebElement popup = driver.findElement(By.id("bar-notification"));
	    String bg = popup.getCssValue("background");
	    driver.findElement(By.xpath("//a[text()='Log in']")).click();
		System.out.println(message);
		System.out.println(bg);
		
		
		
		
	}

}

package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice1
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search = driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		Actions act=new Actions(driver);
		act.sendKeys(search,"facebbok").perform();
		act.click(button).perform();
		
		
	}

}

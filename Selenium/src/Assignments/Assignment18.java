package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment18 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frames);
		
		WebElement image = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement trash = driver.findElement(By.id("trash"));
		
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(image, trash).perform();
		act.dragAndDrop(image1, trash).perform();
		driver.switchTo().defaultContent();
		WebElement sheets = driver.findElement(By.xpath("//a[text()='CheatSheets'][1]"));
		act.click(sheets).perform();
		driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
		
		act.scrollByAmount(0, 1000).perform();
	
		
		
		
		
		
		
	}

}

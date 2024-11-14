package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignments14 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		WebElement registerlink = driver.findElement(By.xpath("//button[text()='Right Click']"));
		Actions act=new Actions(driver);
		act.contextClick(registerlink).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		String message = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getText();
		WebElement popup = driver.findElement(By.xpath("//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']"));
		String textcolor = popup.getCssValue("color");
		System.out.println(textcolor);
		System.out.println(message);
		
	}

}

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.linkText("Hyderabad to Bangalore Bus")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Bus Partner")).click();
		Thread.sleep(3000);
		WebElement avmtravelcheckbox = driver.findElement(By.xpath("//label[text()='AVM Travels']/..//input[@type='checkbox']"));
		Thread.sleep(3000);
		System.out.println(avmtravelcheckbox);
		
		
		
	}
	

}

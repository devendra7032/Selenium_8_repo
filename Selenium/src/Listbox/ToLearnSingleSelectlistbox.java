package Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelectlistbox 
{
	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
       driver.get("https://wwww.facebook.com/reg/");
//     WebElement monthdropdown = driver.findElement(By.id("month"));
//     Select monthselect=new Select(monthdropdown);
//     monthselect.selectByIndex(10);
//     monthselect.selectByValue("6");
//     monthselect.selectByVisibleText("Aug");
       
       WebElement yeardropdown = driver.findElement(By.id("year"));
       Select yearselect=new Select(yeardropdown);
//     yearselect.selectByIndex(0);
//     yearselect.selectByValue("2002");
       yearselect.selectByVisibleText("1993");
//	 
		
	}

}

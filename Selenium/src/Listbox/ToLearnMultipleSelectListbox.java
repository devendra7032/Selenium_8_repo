package Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultipleSelectListbox 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement pricelistbox = driver.findElement(By.id("cars"));
		Select priceselect=new Select(pricelistbox);
		priceselect.selectByIndex(0);
		priceselect.selectByValue("99");
		
		
	}

}

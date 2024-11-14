package Listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptions 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/reg");
		WebElement monthlistbox = driver.findElement(By.id("month"));
		Select monthselect=new Select(monthlistbox);
		
		
		List<WebElement> allmonths = monthselect.getOptions();
		System.out.println(allmonths.size());
		                    
		
		for(WebElement ele:allmonths)
		{
			System.out.println(ele.getText());
		}
		
	}

}

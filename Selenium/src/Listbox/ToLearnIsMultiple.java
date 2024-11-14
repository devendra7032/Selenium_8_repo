package Listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnIsMultiple 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement pricelistbox = driver.findElement(By.id("cars"));
		Select priceselect=new Select(pricelistbox);
		
		List<WebElement> alloptions = priceselect.getOptions();
		System.out.println(alloptions.size());
		
		for(WebElement ele:alloptions)
		{
			System.out.println(ele.getText());
			priceselect.selectByVisibleText(ele.getText());
			if(ele.isSelected())
			{
				System.out.println(ele.getText()+"---->selected");
			}
		}
		
		
	}

}

package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment13 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
		WebElement yeardropdown = driver.findElement(By.id("year"));
		 Select yearselect=new Select(yeardropdown);
		 List<WebElement> alloptions=yearselect.getOptions();
		 yearselect.selectByIndex(alloptions.size()-1);
		 
		 WebElement monthdropdown = driver.findElement(By.id("month"));
		 Select monthselect=new Select(monthdropdown);
		 
		 List<WebElement> alloptions1=monthselect.getOptions();
		 for(WebElement ele:alloptions)
		 {
			 monthselect.selectByVisibleText(ele.getText());
		 }
		
	}

}

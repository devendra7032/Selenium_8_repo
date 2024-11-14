package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Assignment12 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.id("reg_new_btn")).click();
		WebElement location = driver.findElement(By.id("currentCity"));
		Select locationselect=new Select(location);
		locationselect.selectByValue("65");
		WebElement course = driver.findElement(By.id("course"));
		Select courseselect=new Select(course);
		courseselect.selectByValue("16");
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File temp = ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./screenshot/image.png");
	    FileHandler.copy(temp, dest);
		
	}

}

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment16 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		driver.get("https://www.myntra.com/");
		WebElement kidslink = driver.findElement(By.partialLinkText("KIDS"));
		
		
		Actions act=new Actions(driver);
		act.moveToElement(kidslink).perform();
	    WebElement wear = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/div/div/div/li[1]/ul/li[8]/a"));
	    act.click(wear).perform();
	    
	   
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File temp = ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./screenshot/image3.png");
	    FileHandler.copy(temp, dest);
	
		
	}

}

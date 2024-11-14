package automation;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Test 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		WebElement alloptions = driver.findElement(By.id("sView1:r1:0:country::content"));
		Select option=new Select(alloptions);
		option.selectByIndex(240);
		List<WebElement> text = option.getOptions();
		System.out.println(text.size());
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/image5.png");
		FileHandler.copy(temp, dest);
		driver.findElement(By.partialLinkText("Oracle.com Terms of Use")).click();
		
		Set<String> alltitles = driver.getWindowHandles();
	
		for(String all :alltitles)
		{
			driver.switchTo().window(all);
			if(driver.getTitle().contains(""));
                      
		
		}
		String titles = driver.findElement(By.tagName("h3")).getText();
		System.out.println(titles);
		
	}
	
		
	}
	
	



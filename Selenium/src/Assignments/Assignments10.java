package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignments10 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	    String time = LocalDateTime.now().toString().replace(":","-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		String[] urls= {"https://www.getcalley.com/","https://www.getcalley.com/calley-lifetime-offer/","https://www.getcalley.com/see-a-demo/"};
		
		
		for(int i=0;i<urls.length;i++)
		{
			 driver.findElement(By.linkText(urls[i])).click();
             driver.manage().window().setPosition(new Point(1366,768));
			 TakesScreenshot ts=(TakesScreenshot)driver;
			 File temp = ts.getScreenshotAs(OutputType.FILE);
			 File dest=new File("./screenshot/"+time+".png");
			 FileHandler.copy(temp, dest);
			 driver.navigate().back();
			
		}
		 
	}

}

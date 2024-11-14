package takesscreenshot;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot
{
	public static void main(String[] args) throws IOException 
	{
		 String  time= LocalDateTime.now().toString().replace(":", "-");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://demowebshop.tricentis.com/");
		
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./Screenshots/image.png");
		 FileHandler.copy(temp, dest);
		// File dest=new File("./Screenshots/"+time+".png");
		 
		 
//		 ChromeDriver driver1=new ChromeDriver();
//		 driver1.manage().window().maximize();
//			
//		 driver1.get("https://demowebshop.tricentis.com/");
//		 File temp1 = driver1.getScreenshotAs(OutputType.FILE);
//		 File dest1=new File("./Screenshots/image1.png");
//		 FileHandler.copy(temp1, dest1);
//		 
		 
		 
		 
		 
		
	}

}

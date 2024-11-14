package Assignments;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 
{
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(new URL("https://www.naukri.com/"));
		driver.manage().window().getPosition();
	
		
		 
		driver.navigate().refresh();
		driver.close();
	
	}

}

package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
		 String sourcecode = driver.getPageSource();
		 System.out.println(sourcecode);
		 driver.close();
	}

}

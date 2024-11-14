package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnGetTitle2 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		 Object title = driver.getTitle();
		 System.out.println(title);
		 if(title.equals("Instagram"))
		 {
			 System.out.println("User Navigated Sucessfully");
		 }
		 else
		 {
			 System.out.println("User Failed to Navigate");
		 }
		
	}

}

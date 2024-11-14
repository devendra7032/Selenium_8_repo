package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetTitle3 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		 String title = driver.getTitle();
		 System.out.println(title);
		 if(title.equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"))
		 {
			 System.out.println("User Navigated Sucessfully");
		 }
		 else
		 {
			 System.out.println("User Failed to Navigate");
		 }
		
	}

}

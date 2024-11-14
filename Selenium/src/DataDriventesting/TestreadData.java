package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class TestreadData 
{
	public static void main(String[] args) throws IOException 
	{
		//step1: create FileInputstream object
		FileInputStream fis=new FileInputStream("./TestData/skillrary.properties");
		
		//step2: create respective file type object
		Properties prop=new Properties();
		//step3:call read methods
		prop.load(fis);
		String username = prop.getProperty("username");
		String url = prop.getProperty("url");
		
		System.out.println(username);
		System.out.println(url);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}

}

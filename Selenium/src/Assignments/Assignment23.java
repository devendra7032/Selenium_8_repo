package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment23 
{
	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fis=new FileInputStream("./TestData/register.properties");
		Properties pop=new Properties();
		pop.load(fis);
		
		String url = pop.getProperty("url");
		String first = pop.getProperty("firstname");
     	String last = pop.getProperty("lastname");
		String email = pop.getProperty("email");
		String password = pop.getProperty("password");
		String confirmpwd = pop.getProperty("confirmpassword");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(first);
		driver.findElement(By.id("LastName")).sendKeys(last);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpwd);
		driver.findElement(By.id("register-button")).click();
		String text = driver.findElement(By.xpath("//div[@class='result']")).getText();
		System.out.println(text);
		driver.quit();
		
	
		
		
		
	}

}

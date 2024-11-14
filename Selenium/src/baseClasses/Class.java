package baseClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Class 

{
	public WebDriver driver;


@Parameters("Browser")
@BeforeClass
public void launchBrowser(@Optional("chrome") String browserName)
{
	if(browserName.equals("chrome"))
	{
		driver=new ChromeDriver();
		
	}else if(browserName.equals("firefox"))
	{
		driver=new FirefoxDriver();
		
	}
	else if(browserName.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapp.skillrary.com/index.php");
	

 }
    @BeforeMethod
    public void login()
    {
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get("https://demoapp.skillrary.com/index.php");
    	
    	driver.findElement(By.linkText("LOGIN")).click();
    	driver.findElement(By.id("email")).sendKeys("admin");
    	driver.findElement(By.id("password")).sendKeys("admin");
    	driver.findElement(By.xpath("//button[text()='Login']")).click();
    	
    }
    @AfterMethod
    public void logOut()
    {
    	driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
    	driver.findElement(By.linkText("Sign out")).click();
    }
    @AfterClass
    public void closeBrowser()
    {
    	driver.quit();
    }
    
}

package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass1 
{
	
	public Properties prop;
	public Workbook workbook;
	public WebDriver driver;
	@BeforeTest
	public void objectCreation() throws IOException
	{
		//property file
		FileInputStream pfis=new FileInputStream("./TestData/skillrary.properties");
	     prop=new Properties();
	     prop.load(pfis);
	     
	     //excelfile
	     FileInputStream efis=new FileInputStream("./TestData/testscriptdata.xlsx");
	      workbook = WorkbookFactory.create(efis);
	}public BaseClass1() {
		// TODO Auto-generated constructor stub
	}
	@BeforeClass
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = prop.getProperty("url");
		
		driver.get(url);
		
		
	}
	@BeforeMethod
	public void login()
	{
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	@AfterMethod
	public void logOut()
	{
		driver.findElement(By.linkText("Sign out")).click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}

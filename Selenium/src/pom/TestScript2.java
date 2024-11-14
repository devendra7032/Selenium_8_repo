package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript2 
{
	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fis=new FileInputStream("./TestData/register1.properties");
		FileInputStream fis1=new FileInputStream("./TestData/testscriptdata.xlsx");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		Workbook workbook = WorkbookFactory.create(fis1);
		String First = workbook.getSheet("register1").getRow(1).getCell(0).getStringCellValue();
		String Last = workbook.getSheet("register1").getRow(1).getCell(1).getStringCellValue();
		String Email = workbook.getSheet("register1").getRow(1).getCell(2).getStringCellValue();
		String Password = workbook.getSheet("register1").getRow(1).getCell(3).getStringCellValue();
		String ConfirmPassword = workbook.getSheet("register1").getRow(1).getCell(4).getStringCellValue();
//		String ExpectedResult = workbook.getSheet("register1").getRow(1).getCell(5).getStringCellValue();
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		Welcomepage1 wp=new Welcomepage1(driver);
		wp.getRegisterLink().click();
		RegisterPage rp=new RegisterPage(driver);
		rp.getMaleRadioButton().click();
		rp.getFirstNameTextField().sendKeys(First);
		rp.getLastNameTextField().sendKeys(Last);
		rp.getEmailTextField().sendKeys(Email);
		rp.getPasswordTextField().sendKeys(Password);
		rp.getConfirmPasswordTextField().sendKeys(ConfirmPassword);
		rp.getRegisterButton().click();
		
		
		
		
		
	}

}

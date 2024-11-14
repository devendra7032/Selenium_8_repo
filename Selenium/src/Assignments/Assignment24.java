package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment24
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./TestData/register1.properties");
		FileInputStream fis1=new FileInputStream("./TestData/testscriptdata.xlsx");
		
		Properties prop=new Properties();
		Workbook workbook = WorkbookFactory.create(fis1);
		
		prop.load(fis);
		String url = prop.getProperty("url");
		
		String first = workbook.getSheet("Register").getRow(1).getCell(0).getStringCellValue();
		String last = workbook.getSheet("Register").getRow(1).getCell(1).getStringCellValue();
		String email = workbook.getSheet("Register").getRow(1).getCell(2).getStringCellValue();
		String password = workbook.getSheet("Register").getRow(1).getCell(3).getStringCellValue();
		String cpassword = workbook.getSheet("Register").getRow(1).getCell(4).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(first);
		driver.findElement(By.id("LastName")).sendKeys(last);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpassword);
		driver.findElement(By.id("register-button")).click();
		
		
		
	}

}

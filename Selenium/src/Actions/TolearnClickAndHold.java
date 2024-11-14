package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TolearnClickAndHold 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("Test@124");
		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='disableddiv showPassword shownhide']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(eyeIcon).clickAndHold().pause(2000).release().perform();
		
//		act.clickAndHold(eyeIcon).perform();
//		Thread.sleep(3000);
//		act.release().perform();
//		
	}

}

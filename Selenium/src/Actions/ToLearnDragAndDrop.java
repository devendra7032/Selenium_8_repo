package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnDragAndDrop 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		
		WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoframe);
		
		WebElement image = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement trash = driver.findElement(By.id("trash"));
		WebElement gallary = driver.findElement(By.id("gallery"));
		Actions act=new Actions(driver);
		act.dragAndDrop(image, trash).perform();
		act.dragAndDrop(image1, trash).perform();
		act.pause(2000).dragAndDrop(image, gallary).perform();
		act.pause(2000).dragAndDrop(image1, gallary).perform();
		
		
	}

}

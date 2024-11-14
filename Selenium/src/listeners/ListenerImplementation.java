package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener
{


	@Override
	public void onTestFailure(ITestResult result) {
		
		String methodName = result.getName();//It will return current @Test running method name
		String time = LocalDateTime.now().toString().replace(":", "-");
		Reporter.log("test script is failed",true);
	      TakesScreenshot ts=(TakesScreenshot) driver;//BaseClass.driver;
	      File temp = ts.getScreenshotAs(OutputType.FILE);
	      File dest=new File("./Screenshots/"+methodName+time+".png");
	      try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test script is Skipped",true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script is success",true);
	}
	
	
	

}

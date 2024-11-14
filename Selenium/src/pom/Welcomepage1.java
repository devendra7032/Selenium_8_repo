package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage1 
{
	//declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	//Initialization
	public Welcomepage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	//getters

	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	

}

package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAssigment 
{
	//declaration
		@FindBy(id = "Email")
		private WebElement emailTextField;
		
		
		@FindBy(name =  "Password")
		private WebElement passwordTextField;
		
		@FindBy(xpath = "//input[@value='Log in']")
		private WebElement loginButton;
		
		
		//initilalization
		public LoginPageAssigment(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
			
		}
	          //getters

		public WebElement getEmailTextField() {
			return emailTextField;
		}


		public WebElement getPasswordTextField() {
			return passwordTextField;
		}


		public WebElement getLoginButton() {
			return loginButton;
		}
		

	}



package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryPage 
{
	// declaration
	@FindBy(id = "navbar-search-input")
	private WebElement searchTF;
	
	
	//initialization
	public SkillraryPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	
	}


	public WebElement getSearchTF() {
		return searchTF;
	}

	
}

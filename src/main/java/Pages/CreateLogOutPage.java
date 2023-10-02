package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateLogOutPage {
	
private WebDriver driver;
	
	public CreateLogOutPage(WebDriver driver) {
	this.driver = driver;

	}
	
public static class LogOutPageDetails {
		
		@FindBy(how = How.LINK_TEXT, using = "Log out")
		public static WebElement linkLogOut;

	}

}

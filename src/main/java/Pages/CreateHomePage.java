package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateHomePage {
	
private WebDriver driver;
	
	public CreateHomePage(WebDriver driver) {
	this.driver = driver;

	}
	
public static class HomePageDetails {
		
		@FindBy(how = How.NAME, using = "btnLogin")
		public static WebElement buttonLogin;

	}
}

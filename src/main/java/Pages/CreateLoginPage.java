package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateLoginPage {
	
private WebDriver driver;
	
	public CreateLoginPage(WebDriver driver) {
	this.driver = driver;

	}
	
public static class LoginPageDetails {
		
		@FindBy(how = How.NAME, using = "uid")
		public static WebElement userName;
		
		@FindBy(how = How.NAME, using = "password")
		public static WebElement passWord;

}
}
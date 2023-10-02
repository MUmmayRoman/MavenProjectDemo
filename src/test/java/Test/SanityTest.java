package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Modules.HomePageAction;
import Modules.LogOutPageAction;
import Modules.LoginPageAction;
import Pages.CreateHomePage;
import Pages.CreateLogOutPage;
import Pages.CreateLoginPage;
import Utils.Log;

public class SanityTest extends SelTestCase {
	
	@Test
	public void DemoGuru99() throws InterruptedException {
		
		PageFactory.initElements(driver, CreateLoginPage.class);
		PageFactory.initElements(driver, CreateLoginPage.LoginPageDetails.class);
		PageFactory.initElements(driver, CreateHomePage.class);
		PageFactory.initElements(driver, CreateHomePage.HomePageDetails.class);
		PageFactory.initElements(driver, CreateLogOutPage.class);
		PageFactory.initElements(driver, CreateLogOutPage.LogOutPageDetails.class);
		
		
		try {
			LoginPageAction.executeEventsOnLoginPage();
			Thread.sleep(5000);
			Log.info("Login Page Action Performed Successfully");
			} catch (Exception e) {
				Log.info("Login Page Action does not Performed Successfully");
				e.printStackTrace();
			}
		
		try {
			HomePageAction.executeEventsOnHomePage();
			Thread.sleep(5000);
			Log.info("Home Page Action Performed Successfully");
			} catch (Exception e) {
				Log.info("Home Page Action does not Performed Successfully");
				e.printStackTrace();
			}
		
		try {
			LogOutPageAction.executeEventsOnLogoutPage();
			Thread.sleep(5000);
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Log.info("Logout Page Action Performed Successfully");
			} catch (Exception e) {
				Log.info("Logout Page Action does not Performed Successfully");
				e.printStackTrace();
			}
		
	}

}

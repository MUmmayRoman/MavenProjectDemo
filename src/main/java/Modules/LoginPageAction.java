package Modules;

import Pages.CreateLoginPage;
import Test.SelTestCase;
import Utils.Log;

public class LoginPageAction extends SelTestCase {
	
	
	public static void executeEventsOnLoginPage() throws InterruptedException {
		Log.info("Events Going to Performed on Login Page ");
		//Enter User Name 
		CreateLoginPage.LoginPageDetails.userName.clear();
		CreateLoginPage.LoginPageDetails.userName.sendKeys("mngr516141");
		Log.info("Entering the Username");
		Thread.sleep(2000);
		
		//Enter Password
		CreateLoginPage.LoginPageDetails.passWord.clear();
		CreateLoginPage.LoginPageDetails.passWord.sendKeys("enumUvY");
		Log.info("Entering the Password");
		Thread.sleep(2000);
		
	}
	

}

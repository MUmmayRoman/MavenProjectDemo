package Modules;

import Pages.CreateHomePage;
import Test.SelTestCase;
import Utils.Log;

public class HomePageAction extends SelTestCase {
	
	public static void executeEventsOnHomePage() throws InterruptedException {
		Log.info("Events Going to Performed on Home Page ");
		//Enter User Name 
		CreateHomePage.HomePageDetails.buttonLogin.click();
		Log.info("Clicking on Login button");
		Thread.sleep(2000);
	}

}

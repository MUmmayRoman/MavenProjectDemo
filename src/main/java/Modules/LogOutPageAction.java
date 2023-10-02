package Modules;

import Pages.CreateLogOutPage;
import Test.SelTestCase;
import Utils.Log;

public class LogOutPageAction extends SelTestCase {
	
	public static void executeEventsOnLogoutPage() throws InterruptedException {
		Log.info("Events Going to Performed on LogOut Page ");
		//Clicking on Logout link
		CreateLogOutPage.LogOutPageDetails.linkLogOut.click();		
		Log.info("Clicking on Logout link");
		Thread.sleep(2000);
	}

}

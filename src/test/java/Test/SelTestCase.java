package Test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utils.Log;


public class SelTestCase {
	
	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {

		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("sTestCaseName");
		System.setProperty("webdriver.chrome.driver", "C:\\Roman's_WorkPlace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		Log.info("New driver instantiated");
		// Entering the URL
		driver.get("https://demo.guru99.com/V4/index.php");
		Log.info("Opening the URL");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			
	}

	@AfterSuite
	public void tearDown() {
		//captureScreen();
		driver.close();
		driver.quit();
		Log.info("Closing the browser");
		Log.endTestCase("THIS IS AN END");
	}


}

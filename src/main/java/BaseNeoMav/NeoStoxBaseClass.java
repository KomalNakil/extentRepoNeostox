package BaseNeoMav;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;

import PomNeMav.UtilityMethos;

public class NeoStoxBaseClass {
	protected static WebDriver driver;
	public void LaunchNeoStox() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing Project\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(UtilityMethos.readDataFromProperty("url"));
	//	Reporter.log("Launching Browser", true);
		driver.manage().window().maximize();
		UtilityMethos.waitTime(driver, 1000);
	}
	
	public static void CloseNeoStox() {
		//closing browser
		//adding
		//multiple comments
		//to compare pull request
		//Reporter.log("Closing Browser", true);
		driver.close();
	}
}

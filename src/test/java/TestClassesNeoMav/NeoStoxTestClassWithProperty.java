package TestClassesNeoMav;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseNeoMav.NeoStoxBaseClass;
import PomNeMav.NeoStoxHomePAge;
import PomNeMav.NeoStoxPasswordPage;
import PomNeMav.UtilityMethos;
import PomNeMav.neostoxLoingPage;


//@Listeners(UtilityNeoMAv.Listner.class)
public class NeoStoxTestClassWithProperty extends NeoStoxBaseClass {
	neostoxLoingPage login;
	NeoStoxPasswordPage pass;
	NeoStoxHomePAge home;
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		LaunchNeoStox();
		login = new neostoxLoingPage(driver);
		pass = new NeoStoxPasswordPage(driver);
		home = new NeoStoxHomePAge(driver);
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException {
		login.sendMobileNum(driver, UtilityMethos.readDataFromProperty("mobileNum"));
		login.clickOnSignInButton();
		pass.sendPassword(driver, UtilityMethos.readDataFromProperty("password"));
		UtilityMethos.waitTime(driver, 3000);
		pass.clickOnSubmitButton(driver);
		home.popUPHandling(driver);
	}
	
  @Test
  public void validateUN() throws EncryptedDocumentException, IOException {
	  Assert.assertEquals(home.getUname(), UtilityMethos.readDataFromProperty("userName"), "TC failed, ActualUN and Expected UN are not matching matching");
	  UtilityMethos.ss(driver, home.getUname());
  }
  
  @Test
  public void validateBalance()
  {
	  Assert.assertNotNull(home.getActualBalance(driver));
	  Reporter.log("Actual Balance = " +home.getActualBalance(driver), true);
  }
  
 
  
  
  @AfterMethod
  public void logoutFromApp()
  {
	  home.logoutFromNeostox(driver);
  }
  
  @AfterClass
  public void closeBrowser() {
	 CloseNeoStox();
  }
}

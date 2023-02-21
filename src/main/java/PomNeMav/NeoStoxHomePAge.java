package PomNeMav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxHomePAge {
	//branch1 commit for git
	
	//comment added
	@FindBy(xpath = "(//a[@class='btn btn-sm neobutton'])[7]") private WebElement okButton;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement closeButton;
	@FindBy(xpath = "(//span[text()='Hi Komal Dhage'])[1]") private WebElement uName;
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logoutButton;
	@FindBy(xpath = "//span[@id='lbl_curbalancetop']") private WebElement actualBalance;
	
	public NeoStoxHomePAge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void popUPHandling(WebDriver driver) {
		if(okButton.isDisplayed())
		{
			UtilityMethos.waitTime(driver, 1000);
			//Reporter.log("Clicking on Ok Button and close button", true);
			okButton.click();
			UtilityMethos.waitTime(driver, 1000);
//			UtilityMethos.scrolling(driver, closeButton);
//			closeButton.click();
//			UtilityMethos.waitTime(driver, 1000);
		}
		else
		{
			UtilityMethos.waitTime(driver, 1000);
			//Reporter.log("No popup to handle", true);
		}
	}
	
	public String getUname() {
		String ActualUN = uName.getText();
		return ActualUN;
	}
	
	public void logoutFromNeostox(WebDriver driver)
	{
		uName.click();
		UtilityMethos.waitTime(driver, 1000);
		logoutButton.click();
		//Reporter.log("Logging out", true);
		UtilityMethos.waitTime(driver, 1000);
	}
	
	public String getActualBalance(WebDriver driver) {
		//Reporter.log("Getting Actual Balance", true);
		UtilityMethos.waitTime(driver, 1000);
		String ActualBalanceonAccount = actualBalance.getText();
		return ActualBalanceonAccount;
	}
}

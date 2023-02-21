package PomNeMav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxPasswordPage {
	@FindBy(xpath = "//input[@id='txt_accesspin']") private WebElement password;
	@FindBy(xpath = "//a[@id='lnk_submitaccesspin']") private WebElement submitButton;
	
	public NeoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendPassword(WebDriver driver, String pw)
	{
		UtilityMethos.waitTime(driver, 1000);
		password.sendKeys(pw);
		//Reporter.log("Sending Password", true);
		UtilityMethos.waitTime(driver, 1000);
	}
	
	public void clickOnSubmitButton(WebDriver driver)
	{
		//Reporter.log("Clicking Sign in button", true);
		submitButton.click();
		UtilityMethos.waitTime(driver, 1000);
	}

}

package PomNeMav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class neostoxLoingPage {
	@FindBy(xpath="//input[@id='MainContent_signinsignup_txt_mobilenumber']") private WebElement mobileNum;
	@FindBy(xpath= "//a[@class='btn btn-signup']") private WebElement signInButton;
	
	public neostoxLoingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendMobileNum(WebDriver driver, String mno) {
		mobileNum.sendKeys(mno);
		//Reporter.log("Sending mobile num", true);
		UtilityMethos.waitTime(driver,1000);
	}
	
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
}

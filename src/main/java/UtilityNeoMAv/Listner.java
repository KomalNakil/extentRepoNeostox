package UtilityNeoMAv;
//
//import java.io.IOException;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import org.testng.Reporter;
//
//import PomNeMav.UtilityMethos;
//
//
//
//public class Listner implements ITestListner {
//
//	public void onTestSuccess(ITestResult result)
//	{
//		String methodName = result.getTestName();
//		Reporter.log("TC "+ methodName +"successfully completed", true);
//	}
//	
//	public void onTestFailure(ITestResult result, WebDriver driver) throws IOException {
//		Reporter.log("TC "+ result.getTestName() +"failed", true);
//		UtilityMethos.ss(driver, "FailedTC");
//	}
//	
//	public void onTestSkipped(ITestResult result) {
//		
//		Reporter.log("TC" +result.getTestName() +"skipped.. ",true);
//	}
//	
//}

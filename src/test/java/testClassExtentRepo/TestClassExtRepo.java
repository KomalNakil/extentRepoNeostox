//package testClassExtentRepo;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TestClassExtRepo {
//	
//	public WebDriver driver;
//	public ExtentHtmlReporter htmlReport;
//	public ExtentReports extent;
//	public ExtentTest test;
//	
//	
//  @Test
//  public void test1() {
//	  test = extent.createTest("test1");
//	  Assert.assertTrue(true);
//  }
//  
//  @Test
//  public void test2() {
//	  test = extent.createTest("test2");
//	  Assert.assertTrue(true);
//  }
//  
//  @Test
//  public void test3() {
//	  test = extent.createTest("test3");
//	  Assert.assertTrue(true);
//  }
//  
//  
//  @BeforeMethod
//  public void setUp() {
//	  WebDriverManager.chromedriver().setup();
//	  driver = new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.get("https://www.google.com/");
//	  
//  }
//
//  @AfterMethod
//  public void tearDown(ITestResult result) throws IOException {
//	  
//	  if(result.getStatus() == ITestResult.FAILURE)
//	  {
//		test.log(Status.FAIL, "FAILED TC IS : " +result.getTestName()); 
//		test.log(Status.FAIL, "FAILED TC IS : " +result.getThrowable()); 
//		String screenshotPath = TestClassExtRepo.getScreenshot(driver, result.getName());
//		test.addScreenCaptureFromPath(screenshotPath);
//	  }
//	  else if(result.getStatus() == ITestResult.SKIP)
//	  {
//		test.log(Status.SKIP, "SKIPPED TC IS : " +result.getTestName());  
//	  }
//	  else if(result.getStatus() == ITestResult.SUCCESS)
//	  {
//		test.log(Status.SKIP, "PASSED TC IS : " +result.getTestName());  
//	  }
//	  
//  }
//
//  @BeforeTest
//  
//	  public void setExtent()
//	  {
//		  htmlReport = new ExtentHtmlReporter(System.getProperty(("user.dir")+"/test-output/myReport.html"));
//		  htmlReport.config().setDocumentTitle("Automation Report");
//		  htmlReport.config().setReportName("Functional Report");
//		  htmlReport.config().setTheme(Theme.DARK);
//		  extent = new ExtentReports();
//		  extent.attachReporter(htmlReport);
//		  extent.setSystemInfo("Hostname", "LocalHost");
//		  extent.setSystemInfo("OS" ,"Windows");
//		  extent.setSystemInfo("TesterName" ,"Komal");
//		  extent.setSystemInfo("Browser" ,"Chrome");
//		  
//	  }
//  
//
//  @AfterTest
//  public void endReport() {
//	  extent.flush();
//  }
//  
//  public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException
//  {
//	  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	  String dest = System.getProperty(("user.dir")+"/Screenshots/" +screenshotName + dateName + ".png");
//	  File finalDest = new File(dest);
//	  FileUtils.copyFile(src, finalDest);
//	  return dest;
//  }
//
//}

package extentReport;

import java.io.File;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.*;




public class GenerateExtentReport {
	ExtentReports extent;  //Specify the location of the report
	ExtentTest test;  //what details should be populated in the report
	
  @BeforeTest
  public void startReport() {
	  extent = new ExtentReports(System.getProperty("C:/Users/mc56370/eclipse-workspace/TestNGTraining/test-output/MyOwnReport.html", true);
	  extent.setSystemInfo("Host Name", "LocalHost");
	  extent.setSystemInfo("Environment", "QA");
	  extent.setSystemInfo("User Name", "Azelena");
	  extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
  }
  @Test
  public void demoReportPass() {
	  test=extent.startTest("demoReportPass");
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Assert Pass As condition is True");
  }
  @Test
  public void demoReportFail() {
	  test=extent.startTest("demoReportFail");
	  Assert.assertTrue(false);
	  test.log(LogStatus.FAIL, "Assert Fail As condition is False");
  }
  @AfterMethod
  public void getResult(ITestResult result) {
	  if (result.getStatus()==ITestResult.FAILURE) {
		  test.log(logStatus.FAIL, result.getThrowable());
	  }
	  extent.endTest(test);
  }
  @AfterTest
  public void endReport() {
	  extent.flush();
  }
}

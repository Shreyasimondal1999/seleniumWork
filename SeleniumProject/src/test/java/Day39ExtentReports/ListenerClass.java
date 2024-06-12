package Day39ExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ListenerClass implements ITestListener  {
	public ExtentSparkReporter reporter;
	public ExtentReports report;
	public ExtentTest test;
	public void onStart(ITestContext context) {
		//ExtentSparkReporter responsible for UI of the report. 
		reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/LoginLogoutTest.html");
	    reporter.config().setDocumentTitle("login and Logout of Orange HRM");
	    reporter.config().setReportName("LoginLogoutOfOrangeHRM");
	    reporter.config().setTheme(Theme.STANDARD);
	    //ExtentReport responsible for populating some common information to the Report
	    report = new ExtentReports();
	   // We have to Attach report to the reporter
	    report.attachReporter(reporter);
	    //setSystemInfo takes key value pair
	    report.setSystemInfo("Computer Name","localhost");
		report.setSystemInfo("Environment","QA");
		report.setSystemInfo("Tester Name","Pavan");
		report.setSystemInfo("os","Windows10");
		report.setSystemInfo("Browser name","Chrome,Firefox,Edge");
	}

	public void onTestSuccess(ITestResult result) {
		//create test takes the name of the test result
		test = report.createTest(result.getName());
		test.log(Status.PASS, "Test got passed" + result.getName());
	    
	}

	public void onTestFailure(ITestResult result) {
		test = report.createTest(result.getName()); // create a new enty in the report
		test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
		test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable()); 
	}
	public void onTestSkipped(ITestResult result) {
		test = report.createTest(result.getName());
		test.log(Status.SKIP, "Test case skipped is:" + result.getName());
		test.log(Status.SKIP, "Test Case skipped cause is: " + result.getThrowable()); 
	}
	public void onFinish(ITestContext context) {
		//flush output to html file
	  report.flush();
	}

}

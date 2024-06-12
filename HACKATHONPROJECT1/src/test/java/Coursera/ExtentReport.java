package Coursera;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport implements ITestListener {
	
public	ExtentSparkReporter reporter;// responsible for ui of the report 
public ExtentReports report;// responsible for populating common information on the report
public ExtentTest test;//responsible for creating test case entries in the report

public void onStart(ITestContext context) {
	reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\MainTestReport.html");
	//title of the report 
	reporter.config().setDocumentTitle("Cousera searched course details and Form fill up Test Details");
	reporter.config().setReportName("Test Report Of Coursera");
	reporter.config().setTheme(Theme.STANDARD);
	
	report = new ExtentReports();
	//attaching UI With the report instance to populate the UI with common information
	report.attachReporter(reporter);
	//key Value pairs
	report.setSystemInfo("Tester Name","Shreyasi Mondal");
	report.setSystemInfo("Browser","Chrome,Edge");
	report.setSystemInfo("OS","Windows 11");

	
	
	
}
public void onTestSuccess(ITestResult result) {
	test = report.createTest(result.getName());
	test.log(Status.PASS, result.getName()+" : Test has passed.");
}
public void onTestFailure(ITestResult result) {
	test = report.createTest(result.getName());
	test.log(Status.FAIL, result.getName()+" : Test has failed.");
	test.log(Status.FAIL,  "The test method failed becuase " + result.getThrowable());
}
public void onTestSkipped(ITestResult result) {
	test=report.createTest(result.getName());
	test.log(Status.SKIP,result.getName()+" : Test has been skipped.");
	test.log(Status.SKIP, "The test method skipped as  " + result.getThrowable());
}
public void onFinish(ITestContext context) {
	//flushing the report to the html file
	report.flush();
}
}

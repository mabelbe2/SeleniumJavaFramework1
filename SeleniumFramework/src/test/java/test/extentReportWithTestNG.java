package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportWithTestNG {
	ExtentSparkReporter spark;
	ExtentReports extent;
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("extent.html");
		extent.attachReporter(spark);	

	}
	@BeforeTest
	public void setUpTest () {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();	
		
	}
	
	@Test
	public void test1() {

	
		
		ExtentTest test = extent.createTest("Google Search test One", "this is a test to validate google search function");
		driver.get("https://google.com");
		
		test.pass("navigate");
		test.info("this");
		test.fail("details");
		test.addScreenCaptureFromPath("abc.png");
	}
	
	@Test
	public void test2() {
		ExtentTest test = extent.createTest("Google Search test One", "this is a test to validate google search function");
		test.log(Status.INFO, "hi");
		test.info("this");
		test.pass("details");
		test.addScreenCaptureFromPath("abc.png");
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("test completed");
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}

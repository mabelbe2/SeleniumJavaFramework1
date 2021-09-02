package test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsBasicDemo {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("extentReports.html");
		extent.attachReporter(spark);
		
		ExtentTest test1 = extent.createTest("Google Search test One", "this is a test to validate google search function");

		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();	
		
		test1.log(Status.INFO, "starting test case");
		
		driver.get("http://google.com");
		test1.pass("Navaigeted to google.com");

		
		driver.findElement(By.name("q")).sendKeys("automation");
		test1.pass("Entered text");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test1.pass("Enter key");
		
		driver.close();
		driver.quit();
		test1.pass("closed browser");
		
		test1.info("test completed");
		
		
		ExtentTest test2 = extent.createTest("Google Search test One", "this is a test to validate google search function");

		
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();	
		
		test2.log(Status.INFO, "starting test case");
		
		driver.get("http://google.com");
		test2.pass("Navaigeted to google.com");

		
		driver.findElement(By.name("q")).sendKeys("automation");
		test2.fail("Entered text");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test2.pass("Enter key");
		
		driver.close();
		driver.quit();
		test2.pass("closed browser");
		
		test1.info("test completed");
		
		extent.flush();
	}

}

package demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	WebDriver driver = null;
	String projectPath= System.getProperty("user.dir");
	@BeforeTest
	@Parameters("browserName")
	public void setup(String browserName) {
		System.out.println("borwser name is " + browserName);
		System.out.println("Thead id "+ Thread.currentThread().getId());
		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");
			driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+ "/drivers/geckodriver/geckodriver");
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void test1() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("completed successfully");
	}
}

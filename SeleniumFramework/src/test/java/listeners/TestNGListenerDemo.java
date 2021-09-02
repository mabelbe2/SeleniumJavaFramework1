package listeners;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo {
	@Test
	public void test1() {
		System.out.println("i am inside test1");
	}
	@Test
	public void test2() {
		System.out.println("i am inside test2");
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath+ "/drivers/geckodriver/geckodriver");
		
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");

//		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name=\"abc\"]")).sendKeys("Automation");
		
		driver.close();
	}
	@Test
	public void test3() {
		System.out.println("i am inside test3");
		throw new SkipException("test skipped");
	}
}

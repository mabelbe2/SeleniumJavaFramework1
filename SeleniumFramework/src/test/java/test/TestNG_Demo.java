package test;

import org.testng.annotations.Test;

import config.PropertiesFile;

import org.testng.annotations.Test;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {

	WebDriver driver = null;
	public static String browsername = null;
	@BeforeTest
	public void setUpTest () {
		String projectPath= System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");
			driver = new ChromeDriver();	
			
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+ "/drivers/geckodriver/geckodriver");
			driver = new FirefoxDriver();	
			
		}


	}
	
	@Test
	public void googleSearch() {
		
		// go to google
		driver.get("https://google.com");
		
		// enter text in search box
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		// click on search button

		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
//		driver.quit();
		System.out.println("test completed");
		PropertiesFile.setProperties();
	}
}

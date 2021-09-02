package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {

	WebDriver driver = null;
	@BeforeTest
	public void setUpTest () {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();	
		
	}
	
	@Test
	public void googleSearch2() {
		
		// go to google
		driver.get("https://google.com");
		
		// enter text in search box
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		// click on search button

		
	}
	
	@Test
	public void googleSearch3() {
		
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
		driver.quit();
		System.out.println("test completed");
	}
}

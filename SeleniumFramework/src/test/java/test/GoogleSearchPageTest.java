package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObjects = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		
		searchPageObjects.setTextInSearchBox("automation");
		searchPageObjects.clickSearchButton();
		
		driver.close();
		
	}

}

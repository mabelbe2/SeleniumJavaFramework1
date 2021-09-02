package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch() {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// go to google
		driver.get("https://google.com");
		
		// enter text in search box
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		// click on search button
		driver.close();
		System.out.println("test completed");
		
	}
}

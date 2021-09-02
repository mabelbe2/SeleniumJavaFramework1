package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessDemo {
	public static void main(String[] args) {
		test();
	}
	public static void test() {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1280, 800");
	
		WebDriver driver = new ChromeDriver(options);

		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
		System.out.println("completed");
	}
}

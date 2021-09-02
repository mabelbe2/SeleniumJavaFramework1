package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		seleniumWaits();
	}
	public static void seleniumWaits() {
		String projectPath= System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");
//	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("automationj");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		driver.findElement(By.name("abcd")).click();
		driver.close();
		driver.quit();
	}
}

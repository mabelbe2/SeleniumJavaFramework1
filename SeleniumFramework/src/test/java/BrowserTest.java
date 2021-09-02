import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath+ "/drivers/geckodriver/geckodriver");
		
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver");
//	
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.selenium.dev/downloads/");
//		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Automation");
		List<WebElement> listOfElementList = driver.findElements(By.xpath("//input"));
		
		int count = listOfElementList.size();
		
		System.out.println("Count of Input elements: " + count);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}

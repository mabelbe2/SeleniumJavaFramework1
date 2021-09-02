package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;

	By textbox_search = By.name("q");
	
	By button_search = By.name("btnK");
	
	//constructor
	public GoogleSearchPageObjects (WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(textbox_search).sendKeys(Keys.RETURN);
	}
	
}

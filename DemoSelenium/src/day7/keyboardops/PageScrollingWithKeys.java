package day7.keyboardops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class PageScrollingWithKeys {

	public static void main(String[] args) throws InterruptedException {
		// using setUp() launch required browser with URL and return browser instance
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		// scrolling down the page
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		// scrolling up the page
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
			Thread.sleep(1000);
		}

	}

}

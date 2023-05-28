package day7.keyboardops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class PageScrollingWithKeys2 {

	public static void main(String[] args) throws InterruptedException {
		// using setUp() launch required browser with URL and return browser instance
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		// scrolling till bottom of page
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(2000);
		// scrolling till top of page
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));		
	}

}

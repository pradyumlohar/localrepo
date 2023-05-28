package day7.mouseops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtil;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// using setUp() launch required browser with URL and return browser instance
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		//create an instance of Actions class and pass browser instance to its constructor
		Actions act=new Actions(driver);
		//get all the main menu list
		List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		act.moveToElement(menuList.get(1)).contextClick().build().perform();
		//TODO: selecting option from Context menu

	}
}

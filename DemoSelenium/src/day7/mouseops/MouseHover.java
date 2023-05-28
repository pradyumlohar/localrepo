package day7.mouseops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtil;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// using setUp() launch required browser with URL and return browser instance
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		//create an instance of Actions class and pass browser instance to its constructor
		Actions act=new Actions(driver);
		//get all the main menu list
		List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		//to perform hover on specific element get the element from the list like:  1st element(HOME)
//		WebElement homeLink=menuList.get(0);
//		Thread.sleep(2000);
//		act.moveToElement(homeLink).perform();
		
		//perform hover on all the main menu one by one
		for(int i=0;i<menuList.size();i++) {
			act.moveToElement(menuList.get(i)).perform();
			Thread.sleep(1000);
		}
	}
}

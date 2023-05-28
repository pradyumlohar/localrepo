package day5.dropdownhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtil;

public class CustomDropdown {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://thompsonsj.com/bootstrap-select-dropdown/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement dropdown=driver.findElement(By.id("bsd1-button"));
		//wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		//identify dropdown list and click on it
		dropdown.click();
		//identify all the options and store them into List<WebElement>
		List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		//use size() to get option count
		System.out.println("option count: "+options.size());
		//use for loop to print one by one option
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		options.get(2).click();
	}

}
/*
 2. Custom/boosttrap dropdown:
			needs to be handled in normal way as we have handled multile elements in selenium
 */

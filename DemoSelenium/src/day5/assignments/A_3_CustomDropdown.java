package day5.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtil;

public class A_3_CustomDropdown {

	public static void main(String[] args) {

		WebDriver driver= SeleniumUtil.setUp("chrome","https://thompsonsj.com/bootstrap-select-dropdown/");
		WebDriverWait wait =new WebDriverWait(driver,20);
		
		WebElement dropdown = driver.findElement(By.id("bsd1-button"));
		//wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		//identify dropdown list and click on it
		dropdown.click();
		
		List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu>div>a"));
		System.out.println("Options count: "+options.size());
		for(int i=0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		options.get(2).click();
		
	}

}

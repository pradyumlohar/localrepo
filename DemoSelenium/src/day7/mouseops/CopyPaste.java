package day7.mouseops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtil;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		//using setUp() launch required browser with URL and return browser instance
		WebDriver driver=SeleniumUtil.setUp("chrome","https://demo.automationtesting.in/Register.html");
		//enter firstname
		WebElement firstNameInputField=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		Actions act=new Actions(driver);
		
		//type admin and double click on it using Actions class
		firstNameInputField.sendKeys("admin");
		act.moveToElement(firstNameInputField).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//enter lastname and press ENTER button using Keys class
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}

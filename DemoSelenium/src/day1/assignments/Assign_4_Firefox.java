package day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_4_Firefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
        driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement userNameInputField = driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		WebElement passwardInputField = driver.findElement(By.id("password"));
		passwardInputField.clear();
		passwardInputField.sendKeys("Test@123");
		
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		loginBtn.click();
		
	}

}

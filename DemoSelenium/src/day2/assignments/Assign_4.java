package day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_4 {

	public static void main(String[] args) {
		//Running well

		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement userNameInputField = driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		WebElement passwardInputField = driver.findElement(By.id("password"));
		passwardInputField.clear();
		passwardInputField.sendKeys("Test@123");
		
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		loginBtn.click();
		
//		driver.close();
		
	}
}
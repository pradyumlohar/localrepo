package day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_3 {

	public static void main(String[] args) {
		//Running well actitime

		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userNameInputField = driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		
		WebElement passwardInputField = driver.findElement(By.name("pwd"));
		passwardInputField.sendKeys("manager");
		
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		loginBtn.click();
		
//		driver.close();
	}

}

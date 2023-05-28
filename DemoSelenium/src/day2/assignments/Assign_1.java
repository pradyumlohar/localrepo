package day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assign_1 {

	public static void main(String[] args) {
		//Running well soucedemo


		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		System.out.println("Login page title : "+driver.getTitle());
		
		WebElement userNameInputField = driver.findElement(By.id("user-name"));
		userNameInputField.sendKeys("standard_user");
		
		WebElement passwardInputField = driver.findElement(By.id("password"));
		passwardInputField.sendKeys("secret_sauce");
		
		WebElement loginBtn = driver.findElement(By.id("login-button")); 
		loginBtn.click();
		
//		driver.close();
	}

}

package day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_2 {

	public static void main(String[] args){
		
		//Running well orangeHrm
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    driver.findElement(By.name("username")).sendKeys("Admin");
			
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("oxd-button")).click();
		
//		driver.close();
	}

}

package day6.propertyfilecalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidatePosition1 {

	public static void main(String[] args) {
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector(".errormsg"), "class", "errormsg"));
		
		WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
		//get point class object using getLocation method
		Point errorCord=errorMsg.getLocation();
		//get x or y cord based on requirement from point class
		int errorCord_x=errorCord.getX();
		int errorCord_y=errorCord.getY();
		System.out.println("Error msg x cord: "+errorCord_x);
		System.out.println("Error msg y cord: "+errorCord_y);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		WebElement usernameInputfield=driver.findElement(By.id("username"));
		//get point class object using getLocation method
		Point userNameInputCord=usernameInputfield.getLocation();
		//get x or y cord based on requirement from point class
		int user_x=userNameInputCord.getX();
		int user_y=userNameInputCord.getY();
		System.out.println("Username input field x cord: "+user_x);
		System.out.println("Username input field y cord: "+user_y);
		
		System.out.println("Is error msg getting displayed over username input field: "+(errorCord_y < user_y));
	}

}
/**
 * verify -
 * 			1. password field is getting displayed below username input field
 * 			2. keep me logged in text is getting displayed next to checkbox
 *			3. login button is getting displayed right side of keep me logged in text 
 */

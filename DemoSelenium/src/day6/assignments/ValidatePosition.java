package day6.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatePosition {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameInputfield=driver.findElement(By.id("username"));		
		Point usernameInputcord = usernameInputfield.getLocation();
		int user_x=usernameInputcord.getX();
		int user_Y=usernameInputcord.getY();
		System.out.println("Username input field x cord: "+user_x);
		System.out.println("Username input field y cord: "+user_Y);
		
		WebElement pwdfield=driver.findElement(By.cssSelector("[placeholder='Password']"));
		Point pwdfieldcord = pwdfield.getLocation();
		int pwd_X=pwdfieldcord.getX();
		int pwd_Y=pwdfieldcord.getY();
		System.out.println("Password input field x cord: "+pwd_X);
		System.out.println("Password input field y cord: "+pwd_Y);
		
		WebElement keepLoggedInCheckBoxfield=driver.findElement(By.id("keepLoggedInCheckBox"));
		Point keepLoggedInCheckBoxfieldcord = keepLoggedInCheckBoxfield.getLocation();
		int KeepmelogiBox_X=keepLoggedInCheckBoxfieldcord.getX();
		int KeepmelogiBox_Y=keepLoggedInCheckBoxfieldcord.getY();
		System.out.println("keepLoggedInCheckBox x cord: "+KeepmelogiBox_X);
		System.out.println("keepLoggedInCheckBox y cord: "+KeepmelogiBox_Y);
		
		WebElement keepmeloginfield=driver.findElement(By.id("keepMeLoggedInSection"));
		Point keepmeloginfieldcord = keepmeloginfield.getLocation();
		int KeepmeloginText_X=keepmeloginfieldcord.getX();
		int KeepmeloginText_Y=keepmeloginfieldcord.getY();
		System.out.println("keepMeLoggedInSection x cord: "+KeepmeloginText_X);
		System.out.println("keepMeLoggedInSection y cord: "+KeepmeloginText_Y);
		
		WebElement loginBtn=driver.findElement(By.id("loginButton"));
		Point loginBtncord = loginBtn.getLocation();
		int Login_X=loginBtncord.getX();
		int Login_Y=loginBtncord.getY();
		System.out.println("loginButton x cord: "+Login_X);
		System.out.println("loginButton y cord: "+Login_Y);
	
		System.out.println("Is passward field getting displayed below username input field: "+(user_Y < pwd_Y));
		System.out.println("Iskeep me logged in text is getting displayed next to checkbox: "+(KeepmelogiBox_X < KeepmeloginText_X));
		System.out.println("Is login button is getting displayed right side of keep me logged in text: "+(KeepmeloginText_X < Login_X));

		
	}

}

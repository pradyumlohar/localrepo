package day6.propertyfilecalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateColorCode {

	public static void main(String[] args) {
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement signinButton=driver.findElement(By.id("submitbtn"));
		//selenium get the color in RGBA format
		String buttonColorCode=signinButton.getCssValue("background-color");//
		String buttonFontSize=signinButton.getCssValue("font-size");
		System.out.println("Color code: "+buttonColorCode);
		System.out.println("Button font-size: "+buttonFontSize);

	}

}

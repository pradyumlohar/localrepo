package day3.syncAndbrowserOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class BrowserOps {

	public static void main(String[] args) throws InterruptedException {
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://demo.automationtesting.in/Register.html");
		// maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(1500);//it will hold the next action till the time is over
		//set required window size
		driver.manage().window().setSize(new Dimension(700, 200));
		Thread.sleep(1500);//
		// maximize browser window
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("WebTable")).click();
		Thread.sleep(1500);
		//to come back to the previous page
		driver.navigate().back();
		Thread.sleep(1500);
		//to move to next page
		driver.navigate().forward();
		Thread.sleep(1500);
		//to refress current page
		driver.navigate().refresh();
		Thread.sleep(1500);
		//to move to different application 
		driver.navigate().to("http://www.google.com");
	}
}

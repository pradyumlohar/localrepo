package day3.syncAndbrowserOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class BrowserOps2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {		
		setUp("chrome", "https://demo.automationtesting.in/Register.html");	
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
	public static void setUp(String browserName, String appUrl) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximize browser window
		driver.manage().window().maximize();
		// enter the required URL
		driver.get(appUrl);	
	}
}

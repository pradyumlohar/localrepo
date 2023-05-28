package day4.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleSuggestinos1Assig {
	static WebDriver driver;

	public static void main(String[] args) {
		setUp("chrome","https://www.google.com");
//		driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys("Selenium"); //use this primarly
		
		List<WebElement> suggestionList=driver.findElements(By.cssSelector(null));
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
//		driver.manage().window().maximize();
		// enter the required URL
		driver.get(appUrl);	
	}

}

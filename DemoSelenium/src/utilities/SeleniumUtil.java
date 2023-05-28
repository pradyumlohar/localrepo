package utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {

	static WebDriver driver;
	static WebDriverWait wait;
	public static WebDriver setUp(String browsername,String appUrl) {
		if(browsername.equalsIgnoreCase("chrome")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/			
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");		
			/*2. After setting the path of driver executable, create an instance of required browser*/
			driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		wait = new WebDriverWait(driver,20);
		return driver;
	}
	
}

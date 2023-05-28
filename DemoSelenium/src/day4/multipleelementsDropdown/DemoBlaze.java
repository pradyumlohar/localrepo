package day4.multipleelementsDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoBlaze {
	static WebDriver driver;
	public static void main(String[] args) {		
		setUp("chrome", "https://www.demoblaze.com/");
		//identify all mobile devices
		List<WebElement> mobileList=driver.findElements(By.cssSelector("#tbodyid>div>div>.card-block>h4>a"));
		System.out.println("Total mobile found: "+mobileList.size());
		//print one by one all the suggestions in the console
		for(int i=0;i<mobileList.size();i++) {
			WebElement mobile=mobileList.get(i);
			System.out.println("Mobile name "+i+": "+mobile.getText());
		}
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

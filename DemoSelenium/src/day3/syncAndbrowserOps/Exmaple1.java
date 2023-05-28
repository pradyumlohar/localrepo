package day3.syncAndbrowserOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exmaple1 {
	static WebDriver driver;
	public static void main(String[] args) {
		//step1
		setUp("chrome");
		//step2
		driver.get("https://demo.actitime.com/login.do");
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//step3: enter username as admin, 0-30 seconds time to identify the element
		/*identify the user name field using findElement(By) and perform the required operation*/
		driver.findElement(By.id("username")).sendKeys("admin");
		//step4: enter password as manager, 0-30 seconds time to identify the element
		/*identify the password field using findElement(By)  and perform the required operation*/
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//step5: click on login button, 0-30 seconds time to identify the element
		/*identify the login button using findElement(By) and perform the required operation*/
		driver.findElement(By.id("loginButton")).click();
		
		//validate HOME page
		String expectedtHomePageTitle="actiTIME - Enter Time-Track";
		//In real world, Actitime home page title changes after sometime, thats why Selenium will get Login page title 
		// to avoid this we can use conditional wait of selenium
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(expectedtHomePageTitle));
		
		String actualHomePageTile=driver.getTitle();
		System.out.println("Actual Home page title: "+actualHomePageTile);
		System.out.println("Expected Home page title: "+expectedtHomePageTitle);
		if(actualHomePageTile.equals(expectedtHomePageTitle)) {
			System.out.println("Home page validation is successfull, logout from the application now");
			//step7:logout from the application
			/*identify the login button using findElement(By) and perform the required operation*/
			driver.findElement(By.id("logoutLink")).click();
		}else {
			System.out.println("Home page validation is failed, not allowed to logout from the application");
		}		
		//step8: close the browser
		//driver.close();
	}
	public static void setUp(String browserName) {
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
	}
}
/*
1. open chrome browser
2. enter application url
3. enter username as admin
4. enter password as manager
5. click on login button
7. logout from the application
8. close the browser
*/
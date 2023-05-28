package day2.basicobjectidentification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exmaple5 {
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
		//step6: validate home page title is "actiTIME - Enter Time-Track"
		String expectedTitle="actiTIME - Enter Time-Track";
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));		
		String actualTitle=driver.getTitle();
		System.out.println("Expected title is: "+expectedTitle);
		System.out.println("Actual title is: "+actualTitle);
		System.out.println("home page title validation status: "+actualTitle.equals(expectedTitle));
		//step7:logout from the application
		/*identify the login button using findElement(By) and perform the required operation*/
		driver.findElement(By.id("logoutLink")).click();
		//step8: close the browser
		driver.close();
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
6. validate home page
7. logout from the application
8. close the browser
*/
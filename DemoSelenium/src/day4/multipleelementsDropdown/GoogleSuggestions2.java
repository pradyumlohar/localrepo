package day4.multipleelementsDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleSuggestions2 {
	static WebDriver driver;
	public static void main(String[] args) {		
		setUp("chrome", "https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Testing interview questions");
		//identify all google suggestions
		List<WebElement> suggestionList=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));
		System.out.println("Total suggestion found: "+suggestionList.size());
		//print one by one all the suggestions in the console
		for(int i=0;i<suggestionList.size();i++) {
			//to avoid StaleElementException re-identify the elements
			suggestionList=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));
			WebElement suggestion=suggestionList.get(i);
			if(suggestion.getText().equals("testing interview questions for freshers"))
			{
				suggestion.click();
				break;
			}
		}
		String pageTitle=driver.getTitle();
		String expectedTitle="testing interview questions for freshers";
		System.out.println("Search page validation: "+pageTitle.contains(expectedTitle));
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

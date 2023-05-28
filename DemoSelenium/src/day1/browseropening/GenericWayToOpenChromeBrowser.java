package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChromeBrowser {

	public static void main(String[] args) {
		/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
		//System.setProperty("webdriver.chrome.driver", "F:\\CyberBatch\\SeleniumBasics\\executables\\chromedriver.exe");
				//or
		//System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
				//or
		String driverPath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		/*2. After setting the path of driver executable, create an instance of required browser*/
		//ChromeDriver driver=new ChromeDriver();
				//or
		WebDriver driver=new ChromeDriver();
	}
}
/*
every time selenium launches new browser, it won't work on existing opened browser
browser opened by selenium won't be having-
			1. history
			2. cache & cookies
*/
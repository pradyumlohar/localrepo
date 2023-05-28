package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
		//System.setProperty("webdriver.gecko.driver", "F:\\CyberBatch\\SeleniumBasics\\executables\\geckodriver.exe");
				//or
		//System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
				//or
		String driverPath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		/*2. After setting the path of driver executable, create an instance of required browser*/
		FirefoxDriver cdriver=new FirefoxDriver();
	}
}
/*
every time selenium launches new browser, it won't work on existing opened browser
browser opened by selenium won't be having-
			1. history
			2. cache & cookies
*/
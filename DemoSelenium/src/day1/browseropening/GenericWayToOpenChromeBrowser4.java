package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericWayToOpenChromeBrowser4 {

	public static void main(String[] args) {
		WebDriver driver=setUp("firefox");
		//enter required application URL
		driver.get("https://www.google.com");
		//print page title
		System.out.println("Current page title is: "+driver.getTitle());
		//print current page url
		System.out.println("Current page url is :"+driver.getCurrentUrl());
		//current page source code
		String pageSourceCode=driver.getPageSource();
		//System.out.println("Source code: "+pageSourceCode);
		System.out.println("Page source length: "+pageSourceCode.length());
		//close opened browser
		driver.close();
	}
	
	public static WebDriver setUp(String browsername) {		
		if(browsername.equalsIgnoreCase("chrome")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new InternetExplorerDriver();
		}
		return null;
	}
}
/*
1. open chrome browser
2. enter google url
3. print its title 
4. print its current url
5. print its source code length
6. close browser

*/
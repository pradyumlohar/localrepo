package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		//step1: setup required driver executable path using System.setProperty(key,value);
		//System.setProperty("webdriver.chrome.driver", "F:\\CyberBatch\\SeleniumBasicsPrograms\\executables\\chromedriver.exe");
				//or
		//System.setProperty("webdriver.chrome.driver", "F:/CyberBatch/SeleniumBasicsPrograms/executables/chromedriver.exe");
				//or
		//String exePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
				//or
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		//step2: create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();
	}
}
/*
1. For each run selenium will launch a new browser it won;t work on already/existing browser
2. Browser open by selenium won't be having 
		* history
		* download history
		* Cookies
		* Cache
*/
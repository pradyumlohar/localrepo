package day1.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assign_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.get("https://demo.actitime.com/");
		String Expected_title = "actitime - login";
		String title = cdriver.getTitle();
		System.out.println("Title : "+title);
		System.out.println("Length off Title : "+title.length());	
		System.out.println("Current page url : "+cdriver.getCurrentUrl());	
		
		if(Expected_title.equalsIgnoreCase(title))
		{
			System.out.println("Expected and actuzl title is SAME ");
		}
		else {
			System.out.println("Expected and actuzl title is NOT SAME ");

		}
		String source= cdriver.getPageSource();
		System.out.println("source : "+source);
		System.out.println("Source page length : "+source.length());
		
	
	}

}

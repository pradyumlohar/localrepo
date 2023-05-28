package day1.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();	
		//enter required application URL
		String givenUrl = "https://www.facebook.com/";
		driver.get("https://www.facebook.com/");	
		//print current page url
		String currentPageUrl = driver.getCurrentUrl();
		System.out.println("Current page url is :"+driver.getCurrentUrl());
		
		if(givenUrl.equals(currentPageUrl))
		{
			System.out.println("Entered and opened URLs are same ");
		}
		 else {
				System.out.println("Entered and opened URLs are NOT same ");
			}
		
		
		//print page title
		String Title = driver.getTitle();
		System.out.println("Current page title is: " + Title );
				
		System.out.println("current page title length is : " + Title.length());
		
		//current page source code
		String pageSourceCode = driver.getPageSource();
//		System.out.println("SourceCode :"+ pageSourceCode);
		System.out.println("pageSourceCode  length :"+ pageSourceCode.length());
		//close opened browser
//    	driver.close();
	
	}

}

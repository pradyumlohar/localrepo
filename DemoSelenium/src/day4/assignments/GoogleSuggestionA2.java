package day4.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestionA2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Testing interview questions");
		
		List<WebElement> suggestionList=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));//
		System.out.println("Total suggestion found: "+suggestionList.size());
		
		for(int i=0;i<suggestionList.size();i++) {	
			suggestionList=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));		    
			WebElement suggestion=suggestionList.get(i);
			if(suggestion.getText().equals("testing interview questions for freshers"))
			{	
				suggestion.click();
				break;
				
			}
			
//			System.out.println("suggestion "+i+": "+suggestion.getText());
	    }
		String pageTitle=driver.getTitle();
		String expectedTitle="testing interview questions for freshers";
		System.out.println("Search page Validation: "+pageTitle.contains(expectedTitle));
		
	}

}

package day4.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_GsmArena {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		
		driver.findElement(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>*:nth-child(2)>li>a")).click();// or path--> div[class^=brandmenu-v2]>ul>li>a
		List<WebElement> mobileList=driver.findElements(By.cssSelector("div[id='review-body']>div>ul>li>a>strong>span")); // or path--> .makers>ul>li>a> strong>span || for s22 Ultra  5g .makers>ul>*:nth-child(41)>a>strong>span
		
	    System.out.println("Totle no of Samsung mobiles: "+mobileList.size());
	    
	    for(int i=0; i<mobileList.size(); i++)
	    {
	    	WebElement Mobilename=mobileList.get(i);
	    	System.out.println("Mobile model name: "+i+": "+Mobilename.getText());
	    	
	    }
	}

}

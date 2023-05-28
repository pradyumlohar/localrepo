package day4.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_GSMArina {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		List<WebElement> mobileList=driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>*:nth-child(2)>li>a"));
	    System.out.println("Totle no of mobiles: "+mobileList.size());
	    
	    for(int i=0; i<mobileList.size(); i++)
	    {
	    	WebElement Mobilename=mobileList.get(i);
	    	System.out.println("Mobile name: "+i+": "+Mobilename.getText());
	    	
	    }
	}

}

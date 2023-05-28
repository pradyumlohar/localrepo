package day4.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3DemoBlaze {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		List<WebElement> mobileList=driver.findElements(By.cssSelector("#tbodyid>div>div>*:nth-child(2)>h4>a"));
		List<WebElement> mobilePrice=driver.findElements(By.cssSelector("#tbodyid>div>div>*:nth-child(2)>h5"));

		System.out.println("Total mobile found: "+mobileList.size());

		for(int i=0; i<mobileList.size(); i++)
		{
			WebElement mobile=mobileList.get(i);
			WebElement cost=mobilePrice.get(i);
			System.out.println("mobile name "+i+": "+mobile.getText()+"  :price: "+cost.getText());
		}

		
		
	}
}

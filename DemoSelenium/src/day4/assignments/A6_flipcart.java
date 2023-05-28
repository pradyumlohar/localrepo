package day4.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_flipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		List<WebElement> menuList=driver.findElements(By.cssSelector("div[class='_37M3Pb']>div>a>div[class='xtXmba']"));
		System.out.println("No.of menu list: " +menuList.size());     
		
		for(int i=0; i<menuList.size(); i++)
		{
			WebElement Menuname = menuList.get(i);
			System.out.println("Menuname: "+i+": "+Menuname.getText());
		}
		
		
	}

}

package day4.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementCount {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
//		driver.findElement(By.xpath("/html/body/ntp-app//div/div[1]/ntp-realbox//div/input")).click();
	
		
		List<WebElement> objectlinks = (List<WebElement>) driver.findElement(By.tagName("a"));
		
	
		for (WebElement objCurrentLink : objectlinks) {
			
			String strLinkText = objCurrentLink.getText();
			System.out.println(strLinkText);
		}
		
	}
		

}

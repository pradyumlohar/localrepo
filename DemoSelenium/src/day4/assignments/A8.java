package day4.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/samsung_galaxy_s22_ultra_5g-11251.php");
		WebElement String= driver.findElement(By.cssSelector(".article-info-meta>*:nth-child(3)>a"));
		System.out.println("option name: "+String.getText());   
		String.click();
		System.out.println(driver.getTitle());
	}

}

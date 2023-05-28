package day6.propertyfilecalendar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.description.modifier.SynchronizationState;
import utilities.SeleniumUtil;

public class PropertyDataInWebApp {

	public static void main(String[] args) throws IOException {
		//load required property file
		FileInputStream fis=new FileInputStream(".\\testdata\\AppData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browsername");
		String appUrl=prop.getProperty("url");
		String userName=prop.getProperty("username");
		String password=prop.getProperty("password");
		String extectedTitle=prop.getProperty("expectedHomePageTitle");		
		
		System.out.println("App URL: "+appUrl);
		System.out.println("userName : "+userName);
		System.out.println("password : "+password);
		System.out.println("extectedTitle: "+extectedTitle);		
		
		WebDriver driver=SeleniumUtil.setUp(browserName, appUrl);
		driver.findElement(By.id("username")).sendKeys(userName);		
		driver.findElement(By.name("pwd")).sendKeys(password);		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(extectedTitle));
		
	
		String actualTitle=driver.getTitle();		
		if(actualTitle.equals(extectedTitle)) {
			System.out.println("Login successfull");
		}else {
			System.out.println("Either login got failed or page title got changed");
		}
	}
}

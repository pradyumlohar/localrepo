package day6.assignments;

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

public class PropertyDataInWebApp2 {

	public static void main(String[] args) throws IOException {
		//load required property file
		FileInputStream fis=new FileInputStream("F:\\\\Automation_Session\\\\Workspace\\\\CoreJavaBasicPrograms\\\\Myprop\\\\TestData.properties");
		Properties prop=new Properties();
		prop.load(fis);
	
		String extectedTitle=prop.getProperty("expectedHomePageTitle");			
		
		WebDriver driver=SeleniumUtil.setUp(prop.getProperty("browsername"), prop.getProperty("applicationUrl"));
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));		
		driver.findElement(By.name("pwd")).sendKeys(prop.getProperty("password"));		
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

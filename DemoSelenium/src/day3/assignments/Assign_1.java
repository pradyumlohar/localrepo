package day3.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().window().setSize(new Dimension(700,200));
//		driver.manage().window().maximize();
		
		System.out.println("Page title: "+driver.getTitle());
		
		//step6: validate home page title is "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		//explicit wait	
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.titleIs("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));		
		String actualTitle=driver.getTitle();
		System.out.println("Expected title is: "+expectedTitle);
		System.out.println("Actual title is: "+actualTitle);
		System.out.println("home page title validation status: "+actualTitle.equals(expectedTitle));
		System.out.println("==============================================");

		
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_mobiles']")).click();
		System.out.println("Page title: "+driver.getTitle());
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("==============================================");

		
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_gb']")).click();
		System.out.println("Page title: "+driver.getTitle());
		driver.navigate().back();
		driver.navigate().back();
		System.out.println("Page title: "+driver.getTitle());
		System.out.println("==============================================");

		String actualTitle2=driver.getTitle();
		System.out.println("Expected title is: "+expectedTitle);
		System.out.println("Actual title is: "+actualTitle2);
		System.out.println("home page title validation after navigation status: "+actualTitle2.equals(expectedTitle));
		System.out.println("==============================================");

		driver.close();


	}

}

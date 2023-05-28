package day5.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Not done bcz website issue
////ul/li/div/text
////ul/li/div/text[text()='Swargate']
public class A_4_RedBus_Calender {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";//sir ke pc me (drivers) but in my pc (executables) so executables
		System.setProperty("webdriver.chrome.driver", chromeExePath);

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		try{
			driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
		}
		catch(Exception e){
			System.out.println(e);
		}
		List<WebElement> suggestionList=driver.findElements(By.xpath("//text[contains(text(),'Swargate')]"));//
		System.out.println("Total suggestion found: "+suggestionList.size());
		
		for(int i=0;i<suggestionList.size();i++) {	
			WebElement suggestion=suggestionList.get(i);
			if(suggestion.getText().equals("Swargate, Pune"))
			{	
				suggestion.click();
				break;
				
			}
		}
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("goa");
		
		List<WebElement> suggestionList2=driver.findElements(By.xpath("//text[contains(text(),'Panjim')]"));//
		System.out.println("Total suggestion found: "+suggestionList2.size());
		
		for(int i=0;i<suggestionList2.size();i++) {	    
			WebElement suggestion2=suggestionList2.get(i);
			if(suggestion2.getText().equals("Panjim, Goa"))
			{	
				suggestion2.click();
				break;
				
			}
	    }
		
		
		
		
		
	}		
}

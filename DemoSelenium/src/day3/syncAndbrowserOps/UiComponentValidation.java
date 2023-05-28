package day3.syncAndbrowserOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiComponentValidation {

	public static void main(String[] args) {
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://demo.automationtesting.in/Register.html");
		//identify firstname input field
		WebElement firstNameInputField=driver.findElement(By.className("form-control"));
		/*
		 * visible --- isDisplayed()
		 * Editable--- isEnabled()
		 * Default value- getAttribute(String attributename)
		 */
		System.out.println("First name input field visible or not? "+firstNameInputField.isDisplayed());
		System.out.println("First name input field editable or not? "+firstNameInputField.isEnabled());
		String firstNameInputFieldValue=firstNameInputField.getAttribute("placeholder");
		System.out.println("Default value validation status: "+firstNameInputFieldValue.equals("First Name"));
		
		//identify male radio button
		WebElement maleRadioBtn=driver.findElement(By.name("radiooptions"));
		/*
		 * visible
		 * Functional 
		 * by default should not be selected
		 * select and verify, now its selected or not
		 */
		System.out.println("Male radio button visible or not? "+maleRadioBtn.isDisplayed());
		System.out.println("Male radio button functional or not? "+maleRadioBtn.isEnabled());
		System.out.println("Male radio button default selection status? "+maleRadioBtn.isSelected());	
		maleRadioBtn.click();
		System.out.println("After selection, Male radio button selection status? "+maleRadioBtn.isSelected());	
		
		//identify Submit button
		WebElement submitBtn=driver.findElement(By.id("submitbtn"));
		/*
		 * visible --- isDisplayed()
		 * Functional--- isEnabled()
		 * Default value- button name is coming from inner HTML text, so we will be using getText()
		 */
		System.out.println("Submit button visible or not? "+submitBtn.isDisplayed());
		System.out.println("Submit button functional or not? "+submitBtn.isEnabled());	
		String actualButtonName=submitBtn.getText().trim();//text has additional spaces, to remove that use trim()
		System.out.println("Submit button name validation status? "+actualButtonName.equals("Submit"));
	}
}

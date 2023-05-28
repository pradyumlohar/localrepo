package day5.dropdownhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtil;

public class HandlingMultiSelectDropdownList {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome","http://omayo.blogspot.com/");
		//**** Idetify dropdown list
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		//**** Create an instance of Select class and pass above element into its constructor
		Select selectSkill=new Select(carDropdown);
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		
		//get option count 
		List<WebElement> options=selectSkill.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
		 
		//select options from dropdown
		selectSkill.selectByIndex(0);
		selectSkill.selectByIndex(2);
		selectSkill.selectByIndex(3);
//		selectSkill.selectByValue("Hyundaix");
//		selectSkill.selectByVisibleText("Audi");
		
		//get all the selected options
		List<WebElement> selectCars=selectSkill.getAllSelectedOptions();
		System.out.println("Selected car count: "+selectCars.size());
		
		//unselect already select options
//		selectSkill.deselectByIndex(0);
//		selectSkill.deselectByValue("Hyundaix");
//		selectSkill.deselectByVisibleText("Audi");
				//or
		selectSkill.deselectAll();
	}
}
/*
 MultiSelect dropdown:
			created using HTML tag <select>
			Identify dropdown and store it into a WebElement
			Create an instance for Select in selenium and pass above dropdown WebElement as an argument into Select class constructor
			using Select class instance you can perform any required operation on dropdown
			
			* default value/selected value---> getFirstSelectedOption() ---> WebElement
			* option count 				  ---> getOptions() ----> List<WebElement>
			* multiselect or single select---> isMultiple() ----> boolean
			* select value from dropdown ----> 
												selectByIndex(int index)
												selectByValue(String arg)
												selectByVisibleText(String arg)
			* validation on options      ---->
								option name order
								options are in assending/descending order
								
			* unselect selected values:
												deselectByIndex(int index)
												deselectByValue(String arg)
												deselectByVisibleText(String arg)
												deselectAll()
			* to get count of only select option:
										----> getAllSelectedOptions() ---> List<WebElement>
			
 */

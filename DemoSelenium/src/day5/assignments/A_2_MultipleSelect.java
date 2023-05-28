package day5.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtil;

public class A_2_MultipleSelect {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome","http://omayo.blogspot.com/");
		WebElement carDropdown = driver.findElement(By.id("multiselect1"));
		
		Select selectSkill=new Select(carDropdown);
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
//				selectSkill.selectByValue("Hyundaix");
//				selectSkill.selectByVisibleText("Audi");
				
				//get all the selected options
				List<WebElement> selectCars=selectSkill.getAllSelectedOptions();
				System.out.println("Selected car count: "+selectCars.size());
				
				//unselect already select options
//				selectSkill.deselectByIndex(0);
//				selectSkill.deselectByValue("Hyundaix");
//				selectSkill.deselectByVisibleText("Audi");
						//or
				selectSkill.deselectAll();
				
	}

}

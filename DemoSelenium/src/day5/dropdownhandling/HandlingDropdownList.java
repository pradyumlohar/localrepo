package day5.dropdownhandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtil;


public class HandlingDropdownList {

	public static void main(String[] args) {

		WebDriver driver=SeleniumUtil.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		// **** Identify dropdown list
		WebElement skillDropdown = driver.findElement(By.id("Skills"));

		// **** Create an instance of Select class and pass above element into its constructor
		Select selectSkill = new Select(skillDropdown);

		// **** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: " + selectSkill.isMultiple());

		// **** get default or already select option
//		WebElement selectedOption=selectSkill.getFirstSelectedOption();
//		String selectedOptionName=selectedOption.getText();
//		System.out.println("Already selected option name: "+selectedOptionName);
		// or
		System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());

		// get option count
		List<WebElement> options = selectSkill.getOptions();
		System.out.println("Option count is:" + options.size());
		// Get dropdown option names
		for (int i = 0; i < options.size(); i++) {
			System.out.println("Option " + i + ": " + options.get(i).getText());
		}

		// TODO: validation dropdown skills are getting displayed in ascending order

		// select options from dropdown
		selectSkill.selectByIndex(4);
		System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());
		// or
		selectSkill.selectByValue("Backup Management");
		System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());
		// or
		selectSkill.selectByVisibleText("Analytics");
		System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());

		//Checking the order of skills
		String act_skillName="";//
		// Get dropdown option names
		for (int i = 1; i < options.size(); i++) {
			if((options.size()-1)!=i) {
				act_skillName=act_skillName+options.get(i).getText()+", ";
			}else {
				act_skillName=act_skillName+options.get(i).getText();
			}
		}
		//Expected skills
		String exp_skillName="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
		System.out.println("skillName: "+act_skillName);
		System.out.println("exp_skillName: "+exp_skillName);
		System.out.println("Skills are in sorted order or not: "+act_skillName.equals(exp_skillName));

		// TODO: perform validation on following
		// 1. Year(ascending order validation)--->
		// 2. Month(month Sequence validation)--->
		// 3. Days(ascending order validation)
		
		Select dayDrop=new Select(driver.findElement(By.id("daybox")));
		List<Integer> days=new ArrayList<Integer>();
		for(int i=1;i<dayDrop.getOptions().size();i++) {
			String day=dayDrop.getOptions().get(i).getText();
			days.add(Integer.parseInt(day));
		}
		List<Integer> dupDays=new ArrayList<Integer>(days);
		//dupDays.addAll(days);
		Collections.sort(dupDays);
		System.out.println(days.equals(dupDays));
		
		//TODO: validate year and month dropdown
		/*
		 * multiselect
		 * default value
		 * option count
		 * print one by one option
		 * order
		 */
	}
}
/**
 Dropdown list:
	1. Std Dropdown:
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
 */
 

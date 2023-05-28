package day5.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtil;

public class A_1_Year {

	public static void main(String[] args) {

		WebDriver driver=SeleniumUtil.setUp("chrome","http://demo.automationtesting.in/Register.html");
		WebElement yearDropdown =driver.findElement(By.id("yearbox"));
		Select selectYear =new Select(yearDropdown);
		
		System.out.println("Is dropdown is allowing you to select multiple option:  " + selectYear.isMultiple());
		System.out.println("Already selected option name: " + selectYear.getFirstSelectedOption().getText());
		
		List<WebElement> options = selectYear.getOptions();
		System.out.println("Option count is: "+ options.size());
		for(int i = 0; i < options.size(); i++)
		{
			System.out.println("Option "+ i +": " + options.get(i).getText());			
		}
		
		//Checking the order of years
		String act_yearName="";
		for (int i = 1; i < options.size(); i++ ) {
			if((options.size()-1) != i) {
				act_yearName=act_yearName+options.get(i).getText()+", ";			
			}else {
				act_yearName=act_yearName+options.get(i).getText();
			}
		}
		//Expected years
		String exp_yearName="1916, 1917, 1918, 1919, 1920, 1921, 1922, 1923, 1924, 1925, 1926, 1927, 1928, 1929, 1930, 1931, 1932, 1933, 1934, 1935, 1936, 1937, 1938, 1939, 1940, 1941, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1961, 1962, 1963, 1964, 1965, 1966, 1967, 1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015";
		System.out.println("yearName: "+act_yearName);
		System.out.println("exp_yearName: "+exp_yearName);
		System.out.println("Years are in sorted order or not: "+act_yearName.equals(exp_yearName));

		// TODO: perform validation on following
				// 1. Year(ascending order validation)--->
		Select yearDrop=new Select(driver.findElement(By.id("yearbox")));
		List<Integer> years=new ArrayList<Integer>();
		for(int i=1;i<yearDrop.getOptions().size();i++) {
			String year=yearDrop.getOptions().get(i).getText();
			years.add(Integer.parseInt(year));
		}
		List<Integer> dupYears=new ArrayList<Integer>(years);
		//dupYears.addAll(years);
		Collections.sort(dupYears);
		System.out.println("Validation of Year: "+years.equals(dupYears));
		
				// 2. Month(month Sequence validation)--->
		Select monthDrop=new Select(driver.findElement(By.cssSelector("[placeholder='Month']")));
		List<Integer> months=new ArrayList<Integer>();
		for(int i=1;i<monthDrop.getOptions().size();i++) {
			String month=monthDrop.getOptions().get(i).getText();
//			months.add(Integer.parseInt(month));  // because months names are string so don't need to convert it to integer
		}
		List<Integer> dupMonths=new ArrayList<Integer>(months);
		//dupmonth.addAll(months);
		Collections.sort(dupMonths);
		System.out.println("Validation of Month: "+months.equals(dupMonths));
		
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
		System.out.println("Validation of Days: "+days.equals(dupDays));
		
	}	
	
}

package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.LoginPage;

public class TestAcititimeLogin extends SeleniumUtility{
	
//	LoginPage getLoginPage;
//	WebDriver driver;
//	@Given("As a user I am in actitime login page")
//	public void as_a_user_i_am_in_actitime_login_page() {
//	  driver= setUp("chrome", "https://demo.actitime.com/login.do");
//	   getLoginPage=new LoginPage(driver);
//	}

//	@When("I entered user name as {string}")
//	public void i_am_entered_user_name_as(String username) {
//		typeInput(getLoginPage.getUserNameInputField(), username);
//	}
//
//	@And("entered password as {string}")
//	public void entered_password_as(String password) {	   
//		typeInput(getLoginPage.getPasswordInputField(), password);
//	}

//	@And("clicked on login button")
//	public void clicked_on_login_button() {
//	   clickOnElement(getLoginPage.getLoginButton());	    
//	}

//	@Then("I should navigate to Acititime home with title {string}")
//	public void i_should_navigate_to_acititime_home_with_title(String title) {
//	   String actualHomePageUrl=getCurrentTitleOfApplication(title);
//	   Assert.assertEquals(actualHomePageUrl, title,"Actitime login failed or title changed");
//	    
//	}
}

package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility{

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userNameInputField;
	@FindBy(name="pwd")
	private WebElement passwordInputField;
	@FindBy(id="loginButton")
	private WebElement loginButton;
	/**
	 * @return the userNameInputField
	 */
	public WebElement getUserNameInputField() {
		return userNameInputField;
	}
	/**
	 * @return the passwordInputField
	 */
	public WebElement getPasswordInputField() {
		return passwordInputField;
	}
	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}
	
}

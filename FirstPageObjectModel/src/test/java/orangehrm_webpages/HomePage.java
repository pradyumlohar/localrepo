package orangehrm_webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class HomePage extends SeleniumUtility{
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".oxd-userdropdown")
	private WebElement userProfileLink;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	
	public WebElement getUserProfileLink() {
		return userProfileLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void logoutFromOrangeHrm() {
		clickOnElement(userProfileLink);
		clickOnElement(logoutLink);
	}
}

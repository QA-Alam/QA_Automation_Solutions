package zoopla.uk.elements.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.api.baseclass.Base_Class;

public class LoginPage extends Base_Class {

	// Initializing the page object:
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// Selenium PageFactory concepts or design pattern

	@FindBy(xpath = "(//a[@data-testid='header-profile-sign-in'])[1]") // I have to store the web-element by using
																		// find-by annotation
	@CacheLookup // CacheLookup annotation help to execute the test more faster way
					// Because of CacheLookup find-out the computer cash memory
	private WebElement clickOnSignBTN;

	public WebElement getClickOnSignBTN() {
		return clickOnSignBTN;
	}

	@FindBy(id = "input-email-address") // I have to store the web-element by using find-by annotation
	@CacheLookup // CacheLookup annotation help to execute the test more faster way
					// Because of CacheLookup find-out the computer cash memory
	private WebElement enterUserName;

	public WebElement getenterUserName() {
		return enterUserName;
	}

	@FindBy(id = "input-password") // I have to store the web-element by using find-by annotation
	@CacheLookup // CacheLookup annotation help to execute the test more faster way
					// Because of CacheLookup find-out the computer cash memory
	private WebElement enterPassWord;

	public WebElement getEnterPassWord() {
		return enterPassWord;
	}

	@FindBy(xpath = "//button[text()='Sign in']") // I have to store the web-element by using find-by annotation
	@CacheLookup // CacheLookup annotation help to execute the test more faster way
					// Because of CacheLookup find-out the computer cash memory
	private WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}

	@FindBy(xpath = "(//*[text()='For sale'])[1]") 
	@CacheLookup 
	private WebElement hoverOverForSale;
	public WebElement getHoverOverForSale() {
		return hoverOverForSale;
	}

	@FindBy(xpath = "//*[text()='UK property for sale']") 
	@CacheLookup 
	private WebElement clickUkPropertiesForSale;
	public WebElement getclickUkPropertiesForSale() {
		return clickUkPropertiesForSale;
	}

	public void getLogin() {
		clickOnSignBTN.click();
		enterUserName.sendKeys(prop.getProperty("userName"));
		enterPassWord.sendKeys(prop.getProperty("textPassword"));
		signIn.click();
	}

}

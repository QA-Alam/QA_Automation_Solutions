package com.usa.stepdefinations;



import com.usa.api.baseclass.Base_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import zoopla.uk.elements.page.LoginPage;

public class LoginStepDefTest extends Base_Class{

	LoginPage lp;

	@Given("^User able to open a any browser$")
	public void user_able_to_open_a_any_browser() {
		//Base_Class.setUp();	
		lp = new LoginPage();
		
	}

	@Given("^User able to enter \"([^\"]*)\" url$")
	public void user_able_to_enter_url(String url) {
		driver.get(url);

	}

	@When("^User able to click on sign-in button$")
	public void user_able_to_click_on_sign_in_button() {
		lp.getClickOnSignBTN().click();
		

	}

	@When("^User able to enter valid userName \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void user_able_to_enter_valid_userName_password(String userName, String pwd) {
		
		lp.getenterUserName().sendKeys(userName);
		lp.getEnterPassWord().sendKeys(pwd);
		//driver.findElement(By.id("input-email-address")).sendKeys(userName);
		//driver.findElement(By.id("input-password")).sendKeys(pwd);

	}

	@When("^User able to click on login button$")
	public void user_able_to_click_on_login_button() {
	//	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		lp.getSignIn().click();  // If i use click method then i have to  use the locator
		//lp.getEnterPassWord().submit(); // If i use submit method then i don't have to use the locator

	}

	@Then("^User can verify the user information on the grid$")
	public void user_can_verify_the_user_information_on_the_grid() {

		System.out.println(driver.getTitle());
		driver.quit();
	}

}

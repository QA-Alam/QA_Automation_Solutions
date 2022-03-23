package com.usa.stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	WebDriver driver;

	@Given("^User able to open a any browser$")
	public void user_able_to_open_a_any_browser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Given("^User able to enter \"([^\"]*)\" url$")
	public void user_able_to_enter_url(String url) {
		driver.get(url);

	}

	@When("^User able to click on sign-in button$")
	public void user_able_to_click_on_sign_in_button() {
		driver.findElement(By.xpath("(//a[@data-testid='header-profile-sign-in'])[1]")).click();

	}

	@When("^User able to enter valid userName \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void user_able_to_enter_valid_userName_password(String userName, String pwd) {
		driver.findElement(By.id("input-email-address")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(pwd);

	}

	@When("^User able to click on login button$")
	public void user_able_to_click_on_login_button() {
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

	}

	@Then("^User can verify the user information on the grid$")
	public void user_can_verify_the_user_information_on_the_grid() {

		System.out.println(driver.getTitle());
		driver.quit();
	}

}

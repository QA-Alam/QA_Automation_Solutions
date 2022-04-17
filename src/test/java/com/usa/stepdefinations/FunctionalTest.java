package com.usa.stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.generic.code.Utility;
import com.generic.code.WaitHelper;
import com.usa.api.baseclass.Base_Class;

import cucumber.api.java.en.*;
import zoopla.uk.elements.page.LoginPage;

public class FunctionalTest extends Base_Class {
	LoginPage pf;

	@Given("^Users is able to verify login information successfully$")
	public void users_is_able_to_verify_login_information_successfully() {
		pf = new LoginPage();
		pf.getLogin();

		String title = "Sign in to Zoopla - Zoopla";
		Assert.assertEquals(title, driver.getTitle());
		System.out.println("My Test is pass");

	}

	@When("^Users can hover over the page on the For Sale module and click on the UK Property For Sale$")
	public void users_can_hover_over_the_page_on_the_For_Sale_module_and_click_on_the_UK_Property_For_Sale() throws InterruptedException {
		// For mouse hover over we have use Action Class
	/*	Actions ac = new Actions(driver);
		WebElement elem = driver.findElement(By.xpath("(//*[text()='For sale'])[1]"));
		Thread.sleep(3000);
		ac.moveToElement(elem).perform();
		Thread.sleep(3000);
		
		WebElement clickElement = driver.findElement(By.xpath("//*[text()='UK property for sale']"));
		ac.click(clickElement).build().perform();  */
		WaitHelper.waitForElement(pf.getHoverOverForSale(), 30);
		Utility.HoverOver(pf.getHoverOverForSale());

		WaitHelper.waitForElement(pf.getclickUkPropertiesForSale(), 15);
		Utility.getActionClick(pf.getclickUkPropertiesForSale());
	}

	@When("^Users is able to enter location- \"([^\"]*)\"- in the text box & hit enter button$")
	public void users_is_able_to_enter_location_in_the_text_box_hit_enter_button(String arg1) {

	}

	@When("^Users is able to print all value/price of the properties in the console$")
	public void users_is_able_to_print_all_value_price_of_the_properties_in_the_console() {

	}

	@When("^click on the third property from the properties list$")
	public void click_on_the_third_property_from_the_properties_list() {

	}

	@When("^Users is able to print out the selected property details$")
	public void users_is_able_to_print_out_the_selected_property_details() {

	}

	@Then("^Users can Verify the price of the selected property$")
	public void users_can_Verify_the_price_of_the_selected_property() {

	}

	@Then("^User is able to logout the application$")
	public void user_is_able_to_logout_the_application() {

	}
}

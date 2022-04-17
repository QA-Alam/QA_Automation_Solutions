package com.usa.hooks;

import com.usa.api.baseclass.Base_Class;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import zoopla.uk.elements.page.LoginPage;

public class Hooks extends Base_Class {

	public Scenario scenario;
	LoginPage pf;

	@Before // This is a cucumber hooks @Before & @After
	public void getSetup(Scenario scenario)  {
		initialization();
		System.out.println("...........START AUTOMATION.............");

	}

	//@After
	public void tearDown(Scenario scenario) {
		driver.quit();
		System.out.println("...........END AUTOMATION.............");

	}

}

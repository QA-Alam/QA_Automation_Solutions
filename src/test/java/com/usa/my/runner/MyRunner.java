package com.usa.my.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },		 // Generate report    xml/json
        features = ".//Features/",  // feature = feature folder location 
        glue = "com.usa.stepdefinations", // glue = step-definitions location
        tags = "@Smoke")   // help with the tag i can execute as per my require test cases 

	public class MyRunner extends AbstractTestNGCucumberTests {


	}
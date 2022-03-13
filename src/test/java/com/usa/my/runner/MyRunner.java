package com.usa.my.runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },			
		features = {".//Features/"}, 
        glue = "",// {"com.stepdefinations","com.hooks"}, 	
		//dryRun = false, 
		//monochrome = true, 
		//strict = false,
		tags = "@Smoke")   

public class MyRunner extends AbstractTestNGCucumberTests {
	
	  @DataProvider(parallel = true)
	    @Override
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
}

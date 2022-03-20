package com.usa.my.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



//CucumberOptions is help us to connect features folder, step definitions class, generate report
// Specify the test cases and many more 
@CucumberOptions(   		
      features = {".//Features/"},    //  features = location of features folder
      glue = {"com.usa.stepdefinations"},  //  glue = step definitions class location 
       tags = {"@Smoke"}
       )

public class MyRunner extends AbstractTestNGCucumberTests {

}

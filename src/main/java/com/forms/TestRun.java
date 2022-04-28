package com.forms;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format= {"pretty","html:target/cucumbe-html-report"},tags= {"@Application,@signup,@contactus,@getstarted,@onpremise,@Partnersletstalk"})
public class TestRun {
	
}

package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(// configures the cucumber class
		features = "src/test/resources/features"// Path of the feature you want to configure/run
		, glue = "com/hrms/steps",
		dryRun = false, 
		plugin = {"pretty", "html:target/html/cucumber-default-report", "json:target/cucumber.json"} // write code on console but with lots of confusing
																		// numbers and characters
		, monochrome = true // eliminates numbers and characters making the previous "plug-in" obsolete
 		,tags= {"@login"} // executes features with these tags(annotations)
		)

public class SmokeRunner {

}

package com.robust.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-report", 
							"json:target/cucumber.json",
							"pretty:target/cucumber-pretty.txt",
							"usage:target/cucumber-usage.json",
							"junit:target/cucumber-results.xml" }, 
					monochrome = true, 
					features = "src/test/resources/cucumberFeatures", 
					glue = {"com.robust" }, 
					tags = { "@runTest, @regressionTest, @modelTest" })


public class RunCucumberTest {
	/**
	 * meant to be empty
	 */
}

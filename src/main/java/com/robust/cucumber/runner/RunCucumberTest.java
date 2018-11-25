package com.robust.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = {"pretty", "html:target/cucumber-report"},
			monochrome = true,
			features = "src/test/resources/cucumberFeatures",
		    glue = {"com.robust"},
			tags = { "@runTest" }
			)

public class RunCucumberTest {
	/**
	 * meant to be empty
	 */
}

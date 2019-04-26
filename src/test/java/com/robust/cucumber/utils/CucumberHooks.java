package com.robust.cucumber.utils;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robust.selenium.configs.Browser;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {

	static Logger log = LoggerFactory.getLogger(CucumberHooks.class);
	WebDriver driver = Browser.driver();

	@Before
	public void initialize() {
		driver.get("http://demo.nopcommerce.com");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
		log.info("closing browser...");
		Browser.setDriverNull();
	}

}

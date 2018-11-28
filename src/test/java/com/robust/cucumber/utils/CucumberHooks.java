package com.robust.cucumber.utils;

import org.openqa.selenium.WebDriver;

import com.robust.selenium.configs.Browser;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {

	WebDriver driver = Browser.driver();
	
	@Before
	public void initialize() {
		driver.get("http://demo.nopcommerce.com");	
	}
	
	@After
	public void tearDown() {
		driver.quit();
		System.out.println("closing browser...");
		Browser.setDriverNull();
	}
	
}

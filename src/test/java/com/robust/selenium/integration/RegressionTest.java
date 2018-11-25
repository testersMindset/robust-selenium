package com.robust.selenium.integration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.robust.selenium.home.HomePageImpl;
import com.robust.selenium.utils.Browser;

public class RegressionTest {

	WebDriver driver = Browser.driver();

	@Before
	public void setup() {
		driver.get("http://demo.nopcommerce.com");
	}

	@Test
	public void testPage() {
		HomePageImpl homeImpl = new HomePageImpl(driver);
		// TODO //
	}
	
	
	
	
	
	
	
	@After
	public void tearDown() {
		driver.quit();
		Browser.setDriverNull();
	}
}

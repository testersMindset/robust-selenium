package com.robust.selenium.levi;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robust.selenium.configs.Browser;

import cucumber.api.java.en.When;

public class LeviPageImpl {
	WebDriver driver = Browser.driver();

	static Logger log = LoggerFactory.getLogger(LeviPageImpl.class);
	
	@When("^I add cart to Levi$")
	public void leviAddToCart() {
		LeviPage lp = new LeviPage(driver);
		log.info("adding levi to the cart");
		lp.leviAddToCartBttn().click();
		//lp.cartIcon().click();
	}

	 @When("^I navigate to the cart page$")
	 public void addToCartLevi() {
	 LeviPage lp = new LeviPage(driver);
	 log.info("adding cart");
	 lp.cartIcon().click();

	 }
}
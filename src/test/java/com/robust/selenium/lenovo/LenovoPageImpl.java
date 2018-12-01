package com.robust.selenium.lenovo;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robust.selenium.configs.Browser;
import com.robust.selenium.desktop.DesktopPage;

import cucumber.api.java.en.When;

public class LenovoPageImpl {
	WebDriver driver = Browser.driver();

	static Logger log = LoggerFactory.getLogger(LenovoPageImpl.class);
	
	public void lenovoAddToCart() {
		LenovoPage lp = new LenovoPage(driver);
		log.info("clicking on to add to cart button");
		lp.addToCartButton().click();
	}

	@When("^I add cart to Lenovo Desktop$")
	public void addToCartLenovo() {
		DesktopPage dt = new DesktopPage(driver);
		log.info("clicking to lenovo desktop icon");
		dt.lenovoIcon().click();

		LenovoPage lenovo = new LenovoPage(driver);
		lenovo.addToCartButton().click();
		log.info("current URL" + driver.getCurrentUrl());
	}

	@When("^I navigated to the cart page$")
	public void shoppingCart() {
		LenovoPage lenovo = new LenovoPage(driver);
		log.info("adding lenovo to shopping cart");
		lenovo.shoppingCartIcon().click();
		
	}

}

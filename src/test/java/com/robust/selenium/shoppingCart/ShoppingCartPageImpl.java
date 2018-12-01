package com.robust.selenium.shoppingCart;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robust.selenium.configs.Browser;

import cucumber.api.java.en.Then;

public class ShoppingCartPageImpl {
	WebDriver driver = Browser.driver();

	static Logger log = LoggerFactory.getLogger(ShoppingCartPageImpl.class);

	@Then("^I updated the cart to '(.+)'$")
	public void shoppingCartIcon(String value) {
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		log.info("clearing cart to empty");
		scp.UpdateCartIcon().click();
		scp.qtyInput().clear();
		scp.qtyInput().sendKeys(value);
		scp.UpdateCartIcon().click();
	}
}

package com.robust.selenium.home;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.robust.selenium.common.SeleniumHelper;
import com.robust.selenium.configs.Browser;

import cucumber.api.java.en.When;

public class HomePageImpl {

	WebDriver webDriver = Browser.driver();

	/*
	 * implement predefined page objects/methods from Page Classes.
	 */
	@When("^I am landed into home page$")
	public void validateHomePage() throws Exception {
		HomePage home = new HomePage(webDriver);
		Assert.assertTrue(home.headerLogo().isDisplayed());
	}

	@When("^currency is selected as '(.+)'$")
	public void selectCurrency(String currencyType) {
		HomePage home = new HomePage(webDriver);
		SeleniumHelper.selectFromDropdownByVisibleText(home.currencySelect(), currencyType);
	}
	
	@When("^I click to the Register Link$")
	public void clickToRegisterLink() {
		HomePage home = new HomePage(webDriver);
		home.registerLink().click();
	}
	
}

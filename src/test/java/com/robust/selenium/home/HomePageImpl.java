package com.robust.selenium.home;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robust.selenium.common.SeleniumHelper;
import com.robust.selenium.configs.Browser;

import cucumber.api.java.en.When;

public class HomePageImpl {

	WebDriver webDriver = Browser.driver();

	static Logger log = LoggerFactory.getLogger(HomePageImpl.class);

	/*
	 * implement predefined page objects/methods from Page Classes.
	 */
	@When("^I am landed into home page$")
	public void validateHomePage() throws Exception {
		HomePage home = new HomePage(webDriver);
		log.info("validating logo present ..");
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

	@When("^I click into Computers Link$")
	public void clickToComputersLink() {
		HomePage home = new HomePage(webDriver);
		home.computersLink().click();
	}

	@When("^I select '(.+)' link from '(.+)' on Home Page$")
	public void selectValueFromTheHeaderMenu(String linkName, String menuItem) {
		HomePage home = new HomePage(webDriver);
		WebElement menu = SeleniumHelper.waitForElementToBeClickable(home.getLinkOfElement(menuItem));
		SeleniumHelper.moveToElement(menu);
		SeleniumHelper.waitForElementToBeClickable(home.getLinkOfElement(linkName)).click();
	}
}

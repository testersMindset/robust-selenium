package com.robust.selenium.home;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robust.selenium.common.SeleniumHelper;
import com.robust.selenium.configs.Browser;
import com.robust.selenium.register.RegisterPageImpl;

import cucumber.api.java.en.When;

public class HomePageImpl {

	WebDriver webDriver = Browser.driver();

	static Logger log = LoggerFactory.getLogger(HomePageImpl.class);

	WebDriver driver = Browser.driver();

//	@Before
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

	@Test
	public void runRegistrationTest() throws Exception {
//		Map<String, Map<String, String>> maps = TestWithJsonData.createDataMap();
		Map<String, Map<String, String>> maps = new HashMap<>();
		RegisterPageImpl page = new RegisterPageImpl();

		for (Map.Entry<String, Map<String, String>> map : maps.entrySet()) {
			String key = map.getKey();
			Map<String, String> keyValues = map.getValue();

			log.info("");
			log.info("*******************^^^^^^^^^^^^^^^^^^**************************");
			log.info("RUNNING TEST >>>>>> " + key);
			initialize();
			validateHomePage();
			selectCurrency(keyValues.get("Currency"));
			clickToRegisterLink();
			page.validateRegisterPageLanding();
			page.validateRegisterPageLanding(keyValues);

		}

	}

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

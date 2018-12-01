package com.robust.selenium.clothing;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robust.selenium.common.SeleniumHelper;
import com.robust.selenium.configs.Browser;

import cucumber.api.java.en.Then;

public class ClothingPageImpl {
	WebDriver driver = Browser.driver();
	
	static Logger log = LoggerFactory.getLogger(ClothingPage.class);

	@Then("^I am landed into clothing page$")

	public void selectLeviLink() {
		ClothingPage cp = new ClothingPage(driver);
		log.info("validating clothing page title..");
		Assert.assertTrue(cp.ClothingPageTitle().isDisplayed());
		log.info("sorting by price >>.");
		SeleniumHelper.selectFromDropdownByVisibleText(cp.SortingIcon(), "Price: High to Low");
		SeleniumHelper.selectFromDropdownByVisibleText(cp.PageSizeButton(), "6");
		log.info("shopping for levi dress.");
		cp.LeviLink().click();
	}
}

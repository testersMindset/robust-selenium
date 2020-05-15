package com.robust.selenium.register;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robust.selenium.common.SeleniumHelper;
import com.robust.selenium.configs.Browser;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageImpl {

	WebDriver driver = Browser.driver();
	
	static Logger log = LoggerFactory.getLogger(RegisterPageImpl.class);
	
	@When("^I land into Register page$")
	public void validateRegisterPageLanding() {
		Assert.assertTrue(driver.getCurrentUrl().contains("/register"));
	}

	@When("^I fill in register info with below values:$")
	public void validateRegisterPageLanding(Map<String, String> map) {
		RegisterPage reg = new RegisterPage(driver);
		SeleniumHelper.waitForElementToBeClickable(reg.genderFemaleRadio());

		if (map.get("Gender").equalsIgnoreCase("female")) {
			reg.genderFemaleRadio().click();
		} else {
			reg.genderMaleRadio().click();
		}
		SeleniumHelper.selectFromDropdownByVisibleText(reg.selectBirthDay(), map.get("Day"));
		SeleniumHelper.selectFromDropdownByVisibleText(reg.selectBirthMonth(), map.get("Month"));
		SeleniumHelper.selectFromDropdownByVisibleText(reg.selectBirthYear(), map.get("Year"));
		reg.firstName().sendKeys(map.get("Name"));
		reg.lastName().sendKeys(map.get("Last"));
		reg.email().sendKeys(map.get("Email"));
		// fake registering.
		reg.registerButton().click();
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Password is required."));
	}

	@Then("^I click to computers link$")
	public void clickOntoComputersLink() {

	}

}

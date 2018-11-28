package com.robust.selenium.register;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.robust.selenium.common.SeleniumHelper;
import com.robust.selenium.configs.Browser;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageImpl {

	WebDriver driver = Browser.driver();

	@When("^I land into Register page$")
	public void validateRegisterPageLanding() {
		Assert.assertTrue(driver.getCurrentUrl().contains("/register"));
	}

	@When("^I fill in register info with below values:$")
	public void validateRegisterPageLanding(Map<String, String> map) {
		RegisterPage reg = new RegisterPage(driver);
		SeleniumHelper.waitForElementToBeClickable(reg.genderFemaleRadio());

		if (map.get("gender").equalsIgnoreCase("female")) {
			reg.genderFemaleRadio().click();
		} else {
			reg.genderMaleRadio().click();
		}
		SeleniumHelper.selectFromDropdownByVisibleText(reg.selectBirthDay(), map.get("birthDay"));
		SeleniumHelper.selectFromDropdownByVisibleText(reg.selectBirthMonth(), map.get("birthMonth"));
		SeleniumHelper.selectFromDropdownByVisibleText(reg.selectBirthYear(), map.get("birthYear"));
		reg.firstName().sendKeys(map.get("firstName"));
		reg.lastName().sendKeys(map.get("lastName"));
		reg.email().sendKeys(map.get("email"));
		// fake registering.
		reg.registerButton().click();
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Password is required."));
	}

	@Then("^I click to computers link$")
	public void clickOntoComputersLink() {

	}

}

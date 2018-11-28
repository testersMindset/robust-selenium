package com.robust.selenium.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.robust.selenium.configs.Page;

public class RegisterPage extends Page {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "gender-female")
	private WebElement genderFemaleRadio;

	@FindBy(id = "gender-male")
	private WebElement genderMaleRadio;

	@FindBy(id = "FirstName")
	private WebElement firstName;

	public WebElement firstName() {
		return firstName;
	}

	@FindBy(id = "LastName")
	private WebElement lastName;

	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement lastName() {
		return lastName;
	}

	public WebElement genderFemaleRadio() {
		return genderFemaleRadio;
	}

	public WebElement genderMaleRadio() {
		return genderMaleRadio;
	}

	public WebElement registerButton() {
		return registerButton;
	}

	public WebElement email() {
		return email;
	}

	@FindBy(name = "DateOfBirthDay")
	private WebElement selectBirthDay;

	public WebElement selectBirthDay() {
		return selectBirthDay;
	}

	@FindBy(name = "DateOfBirthMonth")
	private WebElement selectBirthMonth;

	public WebElement selectBirthMonth() {
		return selectBirthMonth;
	}

	@FindBy(name = "DateOfBirthYear")
	private WebElement selectBirthYear;

	public WebElement selectBirthYear() {
		return selectBirthYear;
	}

	@FindBy(linkText = "Computers")
	private WebElement computersLink;

	public WebElement computersLink() {
		return computersLink;
	}

}

package com.robust.selenium.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.robust.selenium.configs.Page;

public class HomePage extends Page {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * add element with @FindBy annotations. eg:
	 * 
	 * @FindBy(id = "id_002") 
	 * private WebElement textField;
	 * 
	 */

	@FindBy(className = "header-logo")
	private WebElement headerLogo;

	@FindBy(id = "customerCurrency")
	private WebElement currencySelect;

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	public WebElement registerLink() {
		return registerLink;
	}

	public WebElement currencySelect() {
		return currencySelect;
	}

	public WebElement headerLogo() {
		return headerLogo;
	}

}

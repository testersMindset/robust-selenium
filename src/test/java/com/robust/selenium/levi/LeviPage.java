package com.robust.selenium.levi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.robust.selenium.configs.Page;

public class LeviPage extends Page {

	public LeviPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(className  = "add-to-cart-button")
	private WebElement leviAddToCartBttn;

	public WebElement leviAddToCartBttn() {
		return leviAddToCartBttn;
	}

	@FindBy(className = "ico-cart")
	private WebElement cartIcon;

	public WebElement cartIcon() {
		return cartIcon;
	}

}

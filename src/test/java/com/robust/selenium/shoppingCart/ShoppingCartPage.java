package com.robust.selenium.shoppingCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.robust.selenium.configs.Page;

public class ShoppingCartPage extends Page {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(name = "updatecart")
	private WebElement updateCartIcon;

	public WebElement UpdateCartIcon() {
		return updateCartIcon;
	}

	@FindBy(className = "qty-input")
	private WebElement qtyInput;

	public WebElement qtyInput() {
		return qtyInput;
	}

}

package com.robust.selenium.lenovo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.robust.selenium.configs.Page;

public class LenovoPage extends Page {

	public LenovoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "add-to-cart-panel")
	private WebElement addToCartPanel;

	public WebElement addToCartButton() {
		return addToCartPanel.findElement(By.className("add-to-cart-button"));
	}

	@FindBy(id = "topcartlink")
	private WebElement shoppingCart;

	public WebElement shoppingCartIcon() {
		return shoppingCart;
	}

}

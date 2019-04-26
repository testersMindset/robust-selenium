package com.robust.selenium.lenovo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.robust.selenium.configs.Page;

public class LenovoPage extends Page {

	public LenovoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "product-item")
	private List<WebElement> productItems;

	@FindBy(className = "add-to-cart-panel")
	private WebElement addToCartPanel;

	public WebElement addToCartButton() {
		return productItems.get(2).findElement(By.cssSelector("input[value = 'Add to cart']"));
	}

	@FindBy(className = "cart-qty")
	private WebElement shoppingCart;

	public WebElement shoppingCartIcon() {
		return shoppingCart;
	}

}

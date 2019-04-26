package com.robust.selenium.desktop;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.robust.selenium.common.SeleniumHelper;
import com.robust.selenium.configs.Page;

public class DesktopPage extends Page {

	public DesktopPage(WebDriver driver) {
		super(driver);
	}

	
		@FindBy(css = ".product-item > div")
		private List<WebElement> desktopIcons;

		@FindBy(xpath = "//a[title = 'Show details for Lenovo IdeaCentre 600 All-in-One PC']")
		private WebElement lenovoIdeapad;

		public WebElement lenovoIdeapad() {
			SeleniumHelper.waitForElementToBeClickable(lenovoIdeapad);
			return lenovoIdeapad;
		}

		public List<WebElement> desktopIcons() {
			return desktopIcons;
		}

		@FindBy(className = "button-2")
		private List<WebElement> addToCartButtons;

		public List<WebElement> addToCartButtons() {
			return addToCartButtons;
		}

		public WebElement lenovoAddToCart() {
			return SeleniumHelper.waitForElementToBeClickable(addToCartButtons().get(2));
		}

		public WebElement desktopAddToCart() {
			return SeleniumHelper.waitForElementToBeClickable(addToCartButtons().get(0));
		}

		public WebElement digitalStormAddToCart() {
			return addToCartButtons().get(1);
		}

		public WebElement lenovoIcon() {
			return SeleniumHelper.waitForElementToBeClickable(desktopIcons().get(2));
		}

		@FindBy(className = "ico-cart")
		private WebElement shopingCart;

	}

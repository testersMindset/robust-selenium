package com.robust.selenium.clothing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.robust.selenium.configs.Page;

public class ClothingPage extends Page {

	public ClothingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "page-title")
	private WebElement ClothingPageTitle;

	public WebElement ClothingPageTitle() {
		return ClothingPageTitle;
	}

	@FindBy(id = "products-orderby")
	private WebElement SortingIcon;

	public WebElement SortingIcon() {
		return SortingIcon;
	}

	@FindBy(id = "products-pagesize")
	private WebElement PageSizeButton;

	public WebElement PageSizeButton() {
		return PageSizeButton;
	}

	@FindBy(linkText = "Levi's 511 Jeans")
	private WebElement LeviLink;

	public WebElement LeviLink() {
		return LeviLink;
	}

}

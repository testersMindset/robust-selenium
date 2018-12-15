package com.robust.selenium.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robust.selenium.common.SeleniumHelper;
import com.robust.selenium.configs.Page;

public class HomePage extends Page {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	static Logger log = LoggerFactory.getLogger(HomePage.class);

	/**
	 * add element with @FindBy annotations. eg:
	 * 
	 * @FindBy(id = "id_002") private WebElement textField;
	 * 
	 */

	@FindBy(className = "header-logo")
	private WebElement headerLogo;

	@FindBy(id = "customerCurrency")
	private WebElement currencySelect;

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(linkText = "Computers")
	private WebElement computersLink;

	@FindBy(linkText = "Desktops")
	private WebElement desktopLink;

	@FindBy(linkText = "Electronics")
	private WebElement electronicsLink;

	@FindBy(linkText = "Apparel")
	private WebElement apparelLink;

	@FindBy(linkText = "Notebooks")
	private WebElement notebooksLink;

	@FindBy(linkText = "Accessories")
	private WebElement accessoriesLink;

	@FindBy(linkText = "Clothing")
	private WebElement clothingLink;

	@FindBy(linkText = "Shoes")
	private WebElement shoesLink;

	@FindBy(linkText = "Others")
	private WebElement othersLink;

	@FindBy(linkText = "Cell phones")
	private WebElement cellPhonesLink;

	@FindBy(linkText = "Camera & photo")
	private WebElement cameraLink;

	@FindBy(linkText = "Software")
	private WebElement softwareLink;

	@FindBy(linkText = "Digital downloads")
	private WebElement digitalDownloadsLink;

	@FindBy(linkText = "Books")
	private WebElement booksLink;

	@FindBy(linkText = "Jewelry")
	private WebElement jewelryLink;

	@FindBy(linkText = "Gift Cards")
	private WebElement giftCardsLink;

	public WebElement registerLink() {
		return SeleniumHelper.waitForElementToBeClickable(registerLink);
	}

	public WebElement computersLink() {
		return SeleniumHelper.waitForElementToBeClickable(computersLink);
	}

	public WebElement currencySelect() {
		return SeleniumHelper.waitForElementToBeClickable(currencySelect);
	}

	public WebElement headerLogo() {
		return SeleniumHelper.waitForElementToBeDisplayed(headerLogo);
	}

	public WebElement getLinkOfElement(String linkName) {

		switch (linkName.toLowerCase()) {
		case "desktops":
			return desktopLink;
		case "computers":
			return computersLink;
		case "notebooks":
			return notebooksLink;
		case "software":
			return softwareLink;
		case "camera & photo":
			return cameraLink;
		case "cell phones":
			return cellPhonesLink;
		case "others":
			return othersLink;
		case "electronics":
			return electronicsLink;
		case "clothing":
			return clothingLink;
		case "shoes":
			return shoesLink;
		case "accessories":
			return accessoriesLink;
		case "apparel":
			return apparelLink;
		case "digital downloads":
			return digitalDownloadsLink;
		case "books":
			return booksLink;
		case "jewelry":
			return jewelryLink;
		case "gift cards":
			return giftCardsLink;
		default:
			log.info("Link '" + linkName + "' is invalid choice.");
			return null;
		}

	}
}
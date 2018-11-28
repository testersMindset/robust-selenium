package com.robust.selenium.computer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.robust.selenium.common.SeleniumHelper;
import com.robust.selenium.configs.Page;

public class ComputerPage extends Page {

	public ComputerPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Desktops")
	private WebElement desktopIcon;

	public WebElement desktopIcon() {
		SeleniumHelper.waitForElementToBeClickable(desktopIcon);
		return desktopIcon;
	}

}

package com.robust.selenium.configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {
	protected static WebDriver driver;

	public Page(WebDriver driver) {
		Page.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

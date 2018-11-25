package com.robust.selenium.utils;

import org.openqa.selenium.WebDriver;

public class Page {
	protected static WebDriver driver;

	public Page(WebDriver driver) {
		Page.driver = driver;
	}
}

package com.robust.selenium.desktop;

import org.openqa.selenium.WebDriver;

import com.robust.selenium.configs.Browser;

public class DesktopPageImpl {
	WebDriver webDriver = Browser.driver();


	public void selectLenovoIcon() {
		DesktopPage dt = new DesktopPage(webDriver);
		dt.lenovoIcon().click();
	}
}
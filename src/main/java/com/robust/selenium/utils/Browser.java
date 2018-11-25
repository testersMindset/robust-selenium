package com.robust.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	private static WebDriver webDriver;

	public static WebDriver driver() {
		System.out.println("launching browser .. ");
		if (webDriver == null) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			webDriver = new ChromeDriver();
		}
		return webDriver;
	}

	public static void setDriverNull() {
		webDriver = null;
	}
	
	

}

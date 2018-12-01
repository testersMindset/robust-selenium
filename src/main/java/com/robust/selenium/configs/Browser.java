package com.robust.selenium.configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Browser {

	private static WebDriver webDriver;
	static Logger log = LoggerFactory.getLogger(Browser.class);
	
	public static WebDriver driver() {
		log.info("launching browser .. ");
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

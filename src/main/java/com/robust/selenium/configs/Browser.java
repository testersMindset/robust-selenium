package com.robust.selenium.configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robust.common.utils.DataStore;
import com.robust.common.utils.JSONFileReader;

public class Browser {

	private static WebDriver webDriver;
	static Logger log = LoggerFactory.getLogger(Browser.class);

	public static WebDriver driver() {
		log.info("launching browser .. ");
		String launchMode = System.getProperty("browser.launchmode");
		if (webDriver == null) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			webDriver = "headless".equalsIgnoreCase(launchMode) ? new PhantomJSDriver(getDesiredCapabilities())
					: new ChromeDriver();
		}
		return webDriver;
	}

	/**
	 * Above same conditions can be provided thru json file as well. 
	 * Example: Read data from json file to run test. generates driver from given values in json file
	 * 
	 * this is just example, launching browser mode by hardcoding into json file is not 
	 * considered as best practice. This can be passed thru runconfig & parameterizing in jenkins,
	 * if thats' how test is going to run
	 */
	/*
	 * public static WebDriver driverThruJsonFile() {
	 * log.info("launching browser .. "); 
	 * JSONFileReader.getJSONConfigData();
	 * String launchMode = DataStore.getJsonObject().getString("browserMode"); 
	 * if (webDriver == null) 
	 * 		{ System.setProperty("webdriver.chrome.driver", ./Drivers/chromedriver.exe"); 
	 * 		webDriver = "headless".equalsIgnoreCase(launchMode) 
	 * 					? new PhantomJSDriver(getDesiredCapabilities()) 
	 * 					: new ChromeDriver(); 
	 * 		}
	 * 
	 * 	return webDriver; 
	 * }
	 * 
	 */

	public static void setDriverNull() {
		webDriver = null;
	}

	/**
	 * set capabilities for headless browser
	 * 
	 * @return
	 */
	public static DesiredCapabilities getDesiredCapabilities() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "./Drivers/phantomjs.exe");
		return caps;
	}

}

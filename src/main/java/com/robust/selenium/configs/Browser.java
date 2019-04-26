package com.robust.selenium.configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.robust.common.utils.PropertiesReader;

public class Browser {

	private static WebDriver webDriver;
	static Logger log = LoggerFactory.getLogger(Browser.class);
	
	public static WebDriver driver() {
		log.info("launching browser .. ");
		if (webDriver == null) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			webDriver = PropertiesReader.getValue("browser.launchmode").equalsIgnoreCase("headless")
					? new PhantomJSDriver(getDesiredCapabilities())
					: new ChromeDriver();
		}
		return webDriver;
	}

	public static void setDriverNull() {
		webDriver = null;
	}

	/**
	 * set capabilities for headless browser
	 * @return
	 */
	public static DesiredCapabilities getDesiredCapabilities() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "./Drivers/phantomjs.exe");
		return caps;
	}

}

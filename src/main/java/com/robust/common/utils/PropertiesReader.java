package com.robust.common.utils;

import java.io.FileInputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesReader {

	private static Logger log = LoggerFactory.getLogger(PropertiesReader.class);
	public static final String PROPERTY_FILEPATH = "./testdata/config.properties";

	public static String getValue(String key) {
		Properties prop = loadProperties();
		return prop.getProperty(key);
	}

	private static Properties loadProperties() {
		log.info("Loading from property..");
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(PROPERTY_FILEPATH);
			prop.load(fis);
			log.info("successfully data loaded from property..");
			return prop;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
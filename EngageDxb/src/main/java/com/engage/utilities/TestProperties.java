package com.engage.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.engage.Constants.Constants;



public class TestProperties {
public static Properties GetProperties() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(Constants.configFilePath);
		prop.load(fis);
		return prop;
	}
}

package com.hha.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	String path = "C:\\Users\\HP\\automation workplace\\Swag\\Configuration\\Config.properties";

	public ReadConfig() {       
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public String getBaseURL() {
		String value = prop.getProperty("BaseURL");

		if (value != null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");

	}

	public String getBrowser() {
		String value = prop.getProperty("Browser");

		if (value != null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");

	}

	public String getUserName() {
		String UserName = prop.getProperty("UserName");
		if (UserName != null)
			return UserName;
		else
			throw new RuntimeException("email not specified in config file.");

	}

	public String getPassword() {
		String password = prop.getProperty("Password");
		if (password != null)
			return password;
		else
			throw new RuntimeException("password not specified in config file.");

	}

}

package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AccountFile {
	public String getproperties(String key) throws IOException {
		
		
		FileInputStream fileinput;
		String userDir = System.getProperty("user.dir");
		String filesaperator = System.getProperty("file.separator");
		
		String filepath = userDir+filesaperator+"properties"+filesaperator+"accountDetails.properties";
		System.out.println(filepath);
		
		fileinput = new FileInputStream(filepath);
		Properties prop = new Properties();
		prop.load(fileinput);
		String value = prop.getProperty(key);
		
		return value;
		}
}

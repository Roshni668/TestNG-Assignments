package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserMenuPropertiFile {
FileInputStream fileinput;
	
	public String getproperties(String key) {
		//1. Define the path of the file 
		String userDir = System.getProperty("user.dir");
		String filesaperator = System.getProperty("file.separator");
		//C:\Project automation\TestNGFrameworkSalesforce\TestNGFrameworkSalesforce\properties\UserMenuTestData.properties
		String filepath = userDir+filesaperator+"properties"+filesaperator+"UserMenuTestData.properties";
		System.out.println(filepath);
		
	    //2. Load this path into the file object.	
		
		try {
			fileinput = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//3. Create the Oject as Property file
		 Properties prop = new Properties();
		 try {
			prop.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //4. Fetch the data from the property file 
		String value = prop.getProperty(key);
		
		return value;
	}

	public static String readUserMenuTestData(String expectedURL) {
		// TODO Auto-generated method stub
		return null;
	}

}

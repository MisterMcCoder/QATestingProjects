package org.wipro.fedex.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class UtilityClass 
{

	public static String readConfigProp(String key) throws Exception 
	{
		File f = new File("./TestData/config.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		return prop.get(key).toString();
	}
	
	public static String readElementProp(String key) throws Exception 
	{
		File f = new File("./TestData/element.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		return prop.get(key).toString();
	}
}

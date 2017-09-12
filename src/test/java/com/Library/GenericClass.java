package com.Library;

import java.io.FileInputStream;
import java.util.Properties;

public class GenericClass {
	
	
	public static String getproperties(String skey){
		
		String svalue=null;
		Properties properties=new Properties();
		try{
		
		FileInputStream file=new FileInputStream("C:\\Users\\JASON\\workspace\\framework\\config.properties");
		properties.load(file);
		svalue=properties.getProperty(skey);
		}catch(Exception e){
			
		
		}
		return svalue;
	}

}
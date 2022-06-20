package com.amazon.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p = new Properties();
	public Configuration_Reader() throws IOException {
		
	File f =new File("C:\\Users\\Imagination\\Desktop\\code\\amazon_project\\src\\test\\java\\com\\amazon\\properties\\configration.properties");
	FileInputStream fis =new FileInputStream(f);
	p =new Properties();
	p.load(fis);
	
	
	}
	

	

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	
	
	
}

package com.Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigureFile {
	
	public static Properties p;
	
	public ConfigureFile() throws IOException {
		
		File fil = new File("D:\\MavenProject\\Property\\PropertyFiles");
		FileInputStream fis = new FileInputStream(fil);
		 p = new Properties();
		 p.load(fis);
					
	}

	public String getPassword() {
		
		String pass = p.getProperty("password");
		return pass;
		
	}
	
}

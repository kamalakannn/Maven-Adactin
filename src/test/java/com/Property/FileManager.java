package com.Property;

import java.io.IOException;

public class FileManager {
	
	private FileManager() {
		
		
	}

	
	public ConfigureFile getInstancePassword() throws IOException {
		ConfigureFile password = new ConfigureFile();
		return password;
	}
	
	public static FileManager getInstanceFileManager() {
		FileManager fm = new FileManager();
		return fm;
	}
	
}

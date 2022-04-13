package com.Property;

import com.Base.Baseclass;
import com.Pom.AdacLogin;

import java.io.IOException;

import org.openqa.selenium.*;

public class PropertyfileRunner extends Baseclass{

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
	    driver = borswerLanuch("chrome");
		
		getUrl("https://adactinhotelapp.com/");
		
		AdacLogin log = new AdacLogin(driver);
		WebElement login = log.getUserName();
		String a = FileManager.getInstanceFileManager().getInstancePassword().getPassword();
		sendValues(login, a);
		
	}
}

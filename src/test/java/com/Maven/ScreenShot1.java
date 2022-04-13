package com.Maven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot1 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\MavenProject\\Driver\\chromedriver.exe");
		
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.facebook.com");
		
		
		TakesScreenshot b = (TakesScreenshot) a;
		File socure = b.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\USER\\Pictures\\Camera Roll\\facebook.png");
        FileUtils.copyFile(socure, dest);
		
	
		
		
		
		
		
	} 
	
	
	

}

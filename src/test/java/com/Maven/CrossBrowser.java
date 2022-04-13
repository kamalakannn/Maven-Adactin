package com.Maven;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CrossBrowser {
	@Test
	public void browser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");	
	}
   
	
	@Test
   public void browser2() {
	   
	   System.setProperty("webdriver.chrome.driver",
				"D:\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	   
	   
	   
   }



}



package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\MavenProject\\src\\test\\java\\com\\FeatureFile\\Featurefile.feature", 
    glue = "com.StepDefinition")

public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser() {
		
		driver =  Baseclass.borswerLanuch("chrome");
		
	}
	
	@AfterClass
	public static void closeBrowser() {
		
		//Baseclass.quitWindow();
	}
	
	
	
	

}

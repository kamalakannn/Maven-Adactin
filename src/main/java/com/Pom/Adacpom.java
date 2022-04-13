package com.Pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;


public class Adacpom {
	
	public WebDriver driver;
	
	private AdacLogin l;
	private AdacSearch s;
	private AdacContinue c;
	private AdacBook b;
	private AdacConfirmation con;
	
	public AdacLogin getInstanceLogin() {
		l = new AdacLogin(driver);
		return l;
	}
	public AdacSearch getInstanceSearch() {
		s  = new AdacSearch(driver);
		return s;
	}
	public AdacContinue getInstanceContinue() {
		c = new AdacContinue(driver);
		return c;
	}
	public AdacBook getInstanceBook() {
		b = new AdacBook(driver);
		return b;
	}
	public AdacConfirmation getInstanceCon() {
		con = new AdacConfirmation(driver);
		return con;
	}
	
	public Adacpom (WebDriver pom) {
		this.driver = pom;
		PageFactory.initElements(pom, driver);
	}

}

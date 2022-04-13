package com.Pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdacConfirmation {
	
	
	public WebDriver driver;
	@FindBy(id = "search_hotel")
	private WebElement searchHotel;
	@FindBy(id = "my_itinerary")
	private WebElement myLtinerary;
	@FindBy(id = "logout")
	private WebElement logout;
	
	
	public WebElement getSearchHotel() {
		return searchHotel;
	}
	public WebElement getMyLtinerary() {
		return myLtinerary;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	public AdacConfirmation(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}

package com.Pom;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AdacSearch {
	
	public WebDriver driver;
	
	@FindBy(name = "location")
	private WebElement loation;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement roomTypes;
	@FindBy(id = "room_nos")
	private WebElement numberRooms;
	@FindBy(id = "datepick_in")
	private WebElement checkDate;
	@FindBy(id = "datepick_out")
	private WebElement checkOut;
	@FindBy(id = "adult_room")
	private WebElement audltRoom;
	@FindBy(id = "child_room")
	private WebElement childRoom;
	@FindBy(id = "Submit")
	private WebElement search;
	@FindBy(id = "Reset")
	private WebElement reset;
	
	
	public WebElement getLoation() {
		return loation;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomTypes() {
		return roomTypes;
	}
	public WebElement getNumberRooms() {
		return numberRooms;
	}
	public WebElement getCheckDate() {
		return checkDate;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAudltRoom() {
		return audltRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getReset() {
		return reset;
	}
	public AdacSearch(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}
	

}

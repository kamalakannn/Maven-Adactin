package com.Pom;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdacBook {
	
	public  WebDriver driver;
    
	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement cardNumber;
	@FindBy(id = "cc_type")
	private WebElement cardType;
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;
	@FindBy(id = "book_now")
	private WebElement bookNow;
	@FindBy(id = "cancel")	
	private WebElement cancel;
	
	
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNumber() {
		return cardNumber;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	
	public WebElement getBookNow() {
		return bookNow;
	}
	
	public WebElement getCancel() {
		return cancel;
	}
	
	public AdacBook(WebDriver driver2) {
		
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	}
}

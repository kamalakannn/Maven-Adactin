package com.Pom;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pom {
	public WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement mail;
	
	@FindBy(name = "pass")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement login;
	@FindBy(xpath = "(//a[@role = 'button'])[2]")
	private WebElement createAccount;
	@FindBy(xpath = "//a[text() = 'Forgotten password?']")
	private WebElement forgotPassword;
		
	public WebElement getMail() {
		return mail;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getCreateAccount() {
		return createAccount;
	}
	public WebElement getForgotPassword() {
		return forgotPassword;
	}
	
	public Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}
	
	
	
	
	

}

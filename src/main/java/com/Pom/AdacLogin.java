package com.Pom;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdacLogin {
	
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	private WebElement forgotPass;
	@FindBy(id = "login")
	private WebElement login;
	@FindBy(xpath = "//a[text()='New User Register Here']")
	private WebElement newUser;
	
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getForgotPass() {
		return forgotPass;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getNewUser() {
		return newUser;
	}
	
	
	public AdacLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this );
		
	}
	
	
	

}

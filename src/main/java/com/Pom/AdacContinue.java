package com.Pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AdacContinue {
	
	public WebDriver driver;
	
	@FindBy(id ="radiobutton_0")
    private WebElement button;
	@FindBy(id = "continue")
    private WebElement clickContinue;
    @FindBy(id = "cancel")
	private WebElement cancel;
    
    public WebElement getButton() {
    	return button;
    }
    
    public WebElement getClickContinue() {
    	return clickContinue;
    
    }
    
    public WebElement getCancel() {
    	return cancel;
    }
    
    public AdacContinue(WebDriver driver3){
    	this.driver= driver3;
    	PageFactory.initElements(driver3, this);
    	
    }
    
}

package com.Maven;
import org.openqa.selenium.*;
import com.Base.Baseclass;
import com.Pom.AdacLogin;

public class AdacRunner extends Baseclass {
	
	public static WebDriver driver;
	public static void main(String[] args) {
	     driver = borswerLanuch("chrome");
		
		getUrl("https://adactinhotelapp.com/");
		
		AdacLogin login = new AdacLogin(driver);
		
		WebElement forgot = login.getForgotPass();
		click(forgot);
		
		backNavigate();
		WebElement newUser = login.getNewUser();
		click(newUser);
		
		backNavigate();
		
		WebElement user = login.getUserName();
		sendValues(user, "kamalakann98@gmail.com");
		
		WebElement pass = login.getPassword();
		sendValues(pass, "Kamal@267");
		
		WebElement log = login.getLogin();
		click(log);
		
		
	}

}

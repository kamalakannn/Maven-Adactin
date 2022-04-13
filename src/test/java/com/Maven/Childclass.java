package com.Maven;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Base.Baseclass;

public class Childclass extends Baseclass {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
	   driver = borswerLanuch("chrome");
	   getUrl("https://adactinhotelapp.com/");
	   WebElement userName = driver.findElement(By.id("username"));
	   sendValues(userName, "kamalaka267");
	   WebElement pass = driver.findElement(By.id("password"));
	   sendValues(pass,"Kamal@267");
	   //clear(pass);
	   /*String text = userName.getText();
	   System.out.println(text);*/
	   
	   WebElement login = driver.findElement(By.id("login"));
	   click(login);
	   
	   WebElement location = driver.findElement(By.id("location"));
	   selectMethod(location, "value", "Sydney", 0);
	   selectMethod(location, "value", "Melbourne", 0);
	   options(location);
	   firstOption(location);
	   
	   WebElement hotels = driver.findElement(By.id("hotels"));
	   selectMethod(hotels, "visibletext", "Hotel Hervey", 0);
	   
	   WebElement room_type = driver.findElement(By.id("room_type"));
	   selectMethod(room_type, "index", "text", 3);
	   
	   //WebElement search = driver.findElement(By.id("Submit"));
	   //click(search);
	  // WebElement log = locater("xpath", "(//a[text() = 'Forgot Password?'])");
	   //click(log);
		
	   //quitWindow();
	   /*toNavigate("https://www.amazon.com");
	   toNavigate("https://www.flipkart.com/");
	   backNavigate();
	   forwardNavigate();
	   refreshNavigate(); */
		
		
	}
	
	
	

}

package com.Maven;

import com.Base.Baseclass;
import com.Pom.Adacpom;

import org.openqa.selenium.*;


public class RunnerClass extends Baseclass {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
		driver = borswerLanuch("chrome");
		
		Adacpom po = new Adacpom(driver);
		getUrl("https://adactinhotelapp.com/index.php");
		
		//--------------login------------//
		
		WebElement name = po.getInstanceLogin().getUserName();
		sendValues(name, "kamalaka267");
		WebElement password = po.getInstanceLogin().getPassword();
		sendValues(password, "Kamal@267");
		WebElement login = po.getInstanceLogin().getLogin();
		click(login);
		
		
		//-----------------search hotel-----------//
		
		WebElement loation = po.getInstanceSearch().getLoation();
		selectMethod(loation, "value", "Brisbane", 0);
		
		WebElement hotel = po.getInstanceSearch().getHotel();
		selectMethod(hotel, "visibletext", "Hotel Hervey", 0);
		
		WebElement roomTypes = po.getInstanceSearch().getRoomTypes();
		selectMethod(roomTypes, "Value", "Double", 0);
		
		WebElement numberRooms = po.getInstanceSearch().getNumberRooms();
		selectMethod(numberRooms, "visibletext", "8 - Eight", 0);
		
		WebElement checkDate = po.getInstanceSearch().getCheckDate();
		sendValues(checkDate, "3/4/2022");
		
		WebElement checkOut = po.getInstanceSearch().getCheckOut();
		sendValues(checkOut, "28/4/2022");
		
		WebElement audltRoom = po.getInstanceSearch().getAudltRoom();
		selectMethod(audltRoom, "value", "2", 0);
		
		WebElement childRoom = po.getInstanceSearch().getChildRoom();
		selectMethod(childRoom, "index", " ", 4);
		
		WebElement search = po.getInstanceSearch().getSearch();
		click(search);
		
		//------------------Continue------------------//
		
		WebElement button = po.getInstanceContinue().getButton();
		click(button);
		
		WebElement clickContinue = po.getInstanceContinue().getClickContinue();
		click(clickContinue);
		
		//------------------Book--------------------//
		
		
		
		WebElement firstName = po.getInstanceBook().getFirstName();
		sendValues(firstName, "Kamalakannan");
		
		WebElement lastName = po.getInstanceBook().getLastName();
		sendValues(lastName, "p");
		
		WebElement address = po.getInstanceBook().getAddress();
		sendValues(address, "1/36, ko.su.mani street");
		
		WebElement cardNumber = po.getInstanceBook().getCardNumber();
		sendValues(cardNumber, "1234567891234560");
		
		WebElement cardType = po.getInstanceBook().getCardType();
		selectMethod(cardType, "index", " ", 3);
		
		WebElement expiryMonth = po.getInstanceBook().getExpiryMonth();
		selectMethod(expiryMonth, "value", "4", 0);
		
		WebElement expiryYear = po.getInstanceBook().getExpiryYear();
		selectMethod(expiryYear, "visibletext", "2022", 0);
		
		WebElement cvvNumber = po.getInstanceBook().getCvvNumber();
		sendValues(cvvNumber, "1234");
		
		WebElement bookNow = po.getInstanceBook().getBookNow();
		click(bookNow);
		
		//----------------confirmation----------///
		
		Thread.sleep(20000);
		WebElement logout = po.getInstanceCon().getLogout();
		click(logout);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

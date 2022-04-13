package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.Base.Baseclass;
import com.Pom.Adacpom;
import com.Runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definition extends Baseclass {
	
	public static  WebDriver driver = TestRunner.driver;
	
	 public static Adacpom pom = new Adacpom(driver); 
	
	@Given("^user Lanuch The Adaction Application$")
	public  void user_Lanuch_The_Adaction_Application() throws Throwable {
		getUrl("https://adactinhotelapp.com/");
	    //driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username$")
	public  void user_Enter_The_Username() throws Throwable {
		sendValues(pom.getInstanceLogin().getUserName(), "kamalaka267");
	    
	}

	@When("^user Enter The Password$")
	public  void user_Enter_The_Password() throws Throwable {
	    sendValues(pom.getInstanceLogin().getPassword(), "Kamal@267");
	}

	@Then("^user Click The LoginButton And To nagivates To The SearchHotel Page$")
	public  void user_Click_The_LoginButton_And_To_nagivates_To_The_SearchHotel_Page() throws Throwable {
	    click(pom.getInstanceLogin().getLogin());
	}

	/*@When("^user Select The Location In The Select Option$")
	public  void user_Select_The_Location_In_The_Select_Option() throws Throwable {
	    selectMethod(pom.getInstanceSearch().getLoation(), "value", "Melbourne", 0);
	}

	@When("^user Select The Hotel In The Select Option$")
	public void user_Select_The_Hotel_In_The_Select_Option() throws Throwable {
		selectMethod(pom.getInstanceSearch().getHotel(), "index", null, 2);
	    
	}
*/
	/*@When("^user Select The RoomType In The Select Option$")
	public void user_Select_The_RoomType_In_The_Select_Option() throws Throwable {
	    
	}

	@When("^user Select The Number Of Rooms In The Select Option$")
	public void user_Select_The_Number_Of_Rooms_In_The_Select_Option() throws Throwable {
	    
	}

	@When("^user Enter The CheckIn Date In The Input Box$")
	public void user_Enter_The_CheckIn_Date_In_The_Input_Box() throws Throwable {
	    
	}

	@When("^user Enter The CheckOut Date In The Input Box$")
	public void user_Enter_The_CheckOut_Date_In_The_Input_Box() throws Throwable {
	    
	}

	@When("^user Select The Adult Per Room In The Select Option$")
	public void user_Select_The_Adult_Per_Room_In_The_Select_Option() throws Throwable {
	    
	}

	@When("^user Select The Childern Per Room In The Select Option$")
	public void user_Select_The_Childern_Per_Room_In_The_Select_Option() throws Throwable {
	    
	}

	@Then("^user Click The SearchButton And To Navigates to The SelectHotel Page$")
	public void user_Click_The_SearchButton_And_To_Navigates_to_The_SelectHotel_Page() throws Throwable {
	    
	}

	@When("^user Click the SelectButton$")
	public void user_Click_the_SelectButton() throws Throwable {
	    
	}

	@Then("^user Click The ContinueButton And Navigates To The Book A Hotel Page$")
	public void user_Click_The_ContinueButton_And_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
	    
	}

	@When("^user Enter The First Name In The Input Box$")
	public void user_Enter_The_First_Name_In_The_Input_Box() throws Throwable {
	    
	}

	@When("^user Enter The Last Name In The Input Box$")
	public void user_Enter_The_Last_Name_In_The_Input_Box() throws Throwable {
	   
	}

	@When("^user Enter The Billing Address In The Input Box$")
	public void user_Enter_The_Billing_Address_In_The_Input_Box() throws Throwable {
	    
	}

	@When("^user Enter The Credit Card Number In The Input Box$")
	public void user_Enter_The_Credit_Card_Number_In_The_Input_Box() throws Throwable {
	   
	}

	@When("^user Select The Credit Card Type In The Select Option$")
	public void user_Select_The_Credit_Card_Type_In_The_Select_Option() throws Throwable {
	   
	}

	@When("^user Select The Expiry Month In The Select Option$")
	public void user_Select_The_Expiry_Month_In_The_Select_Option() throws Throwable {
	   
	}

	@When("^user Select The Expiry Year In The Select Option$")
	public void user_Select_The_Expiry_Year_In_The_Select_Option() throws Throwable {
	    
	}

	@When("^user Enter The CVV Number In The Input Box$")
	public void user_Enter_The_CVV_Number_In_The_Input_Box() throws Throwable {
	    
	}

	@Then("^user Click The BookNow Button And Navigates To The Booking Confirmation$")
	public void user_Click_The_BookNow_Button_And_Navigates_To_The_Booking_Confirmation() throws Throwable {
	   
	}

	@Then("^user Click The My Itinerary And Navigates To The Booked Itinerary$")
	public void user_Click_The_My_Itinerary_And_Navigates_To_The_Booked_Itinerary() throws Throwable {
	   
	}

	@When("^user Take Screenshot$")
	public void user_Take_Screenshot() throws Throwable {
	    
	}

	@When("^user Click The Check Box In The Booked Hotel$")
	public void user_Click_The_Check_Box_In_The_Booked_Hotel() throws Throwable {
	    
	}

	@When("^user Click The Cancel Selected Button$")
	public void user_Click_The_Cancel_Selected_Button() throws Throwable {
	    	}

	@Then("^user Click The Logout Button And Navigates To The Logout Page$")
	public void user_Click_The_Logout_Button_And_Navigates_To_The_Logout_Page() throws Throwable {
	    
	}
*/


}

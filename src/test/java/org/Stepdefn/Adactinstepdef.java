package org.Stepdefn;

import java.util.concurrent.TimeUnit;

import org.Baseclass.Adactinbase;
import org.Pomclass.Adactinpom;
import org.Runnerfile.Adactinrunner;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactinstepdef extends Adactinbase {

	WebDriver driver =Adactinrunner.driver;
	
	Adactinpom ap = new Adactinpom(driver);
	

	@Given("User launch url and maximize the site")
	public void user_launch_url_and_maximize_the_site() {
	    url(driver,"https://adactinhotelapp.com/");
	    maximize(driver);
	}
	@When("User enters valid username")
	public void user_enters_valid_username() {
	    tosenduser(ap.getUsername(), "Nyrazahrin");
	}
	@When("enter valid password")
	public void enter_valid_password() {
	    tosendvalue(ap.getPassword(), "123456");
	}
	@Then("User click on login button")
	public void user_click_on_login_button() {
	    toclick(ap.getLogin());
	}
	
		@When("User select the location")
	public void user_select_the_location() {
	    toselect(driver,ap.getLocation(), "London");;
	}
	@When("Select the hotel")
	public void select_the_hotel() {
	    toselect1(driver, ap.getHotels(), 2);
	}
	@When("User select the room type")
	public void user_select_the_room_type() {
	    toselect2(driver, ap.getRoom(), "Deluxe");;
	}
	@When("Number of rooms")
	public void number_of_rooms() {
	    toselect3(driver, ap.getRoomno(), "3");;
	}
	@When("user select check in date")
	public void user_select_check_in_date() {
	    tosenddate(ap.getDatein(), "18/05/2024");;
	}
	@When("checkout date")
	public void checkout_date() {
	    tosendout(ap.getDateout(), "20/05/2024");
	}
	@When("User select the adult room")
	public void user_select_the_adult_room() {
	    toselect4(driver, ap.getAdult(), "3");
	}
	@When("child rooms")
	public void child_rooms() {
	    toselect5(driver, ap.getChild(), "2");
	}
	@Then("User clicks on search button")
	public void user_clicks_on_search_button() {
	    tosearch(ap.getSubmit());
	}

	@When("User select hotel")
	public void user_select_hotel() {
	    toselect(ap.getSelect());
	}
	@Then("User Click on continue")
	public void user_click_on_continue() {
	     cont(ap.getContinue());
	}
	@When("Use enters first name")
	public void use_enters_first_name() {
	    fname(ap.getFname(),"FATHIMA");
	}
	@When("lastname")
	public void lastname() {
	    lname(ap.getLname(), "k");
	
	}
	@When("Billing Address")
	public void billing_address() {
	    add(ap.getBaddress(),"32/1, Muthaiah street, Teynampet");
	}
	@When("Credit card number")
	public void credit_card_number() {
	    credit(ap.getCreditnum(), "1234567891234567");
	}
	@When("User select credit card type")
	public void user_select_credit_card_type() {
	    toselect6(driver, ap.getCredittype(), "VISA");
	}
	@When("Enter expiry month")
	public void enter_expiry_month() {
	   toselect7(driver,ap.getCreditmonth(), "9");
	}
	@When("enter expiry year")
	public void enter_expiry_year() {
	    toselect8(driver, ap.getCredityr(), "2030");
	}
	
	@When("Credit card cvv")
	public void credit_card_cvv() {
	   cvv(ap.getCreditcvv(), "678"); 
	}
	@Then("User click on book now")
	public void user_click_on_book_now() {
	    booknow(ap.getBooknow());
	}


	@Then("User need to logout")
	public void user_need_to_logout() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    log(ap.getLogout());
	}




	
	
	
	
	
	
	
	
	
	
	
}

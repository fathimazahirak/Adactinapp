package org.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinpom {
public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement datein;
	
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement Submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement Select;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement Lname;
	
	@FindBy(id="address")
	private WebElement Baddress;
	
	@FindBy(id="cc_num")
	private WebElement Creditnum;
	
	@FindBy(id="cc_type")
	private WebElement Credittype;
	
	@FindBy(id="cc_exp_month")
	private WebElement Creditmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement Credityr;
	
	@FindBy(id="cc_cvv")
	private WebElement Creditcvv;
	
	@FindBy(id="book_now")
	private WebElement Booknow;
	
	@FindBy(id="logout")
	private WebElement Logout;
	
	public WebElement getSelect() {
		return Select;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getBaddress() {
		return Baddress;
	}

	public WebElement getCreditnum() {
		return Creditnum;
	}

	public WebElement getCredittype() {
		return Credittype;
	}

	public WebElement getCreditmonth() {
		return Creditmonth;
	}

	public WebElement getCredityr() {
		return Credityr;
	}

	public WebElement getCreditcvv() {
		return Creditcvv;
	}

	public WebElement getBooknow() {
		return Booknow;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public Adactinpom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
}

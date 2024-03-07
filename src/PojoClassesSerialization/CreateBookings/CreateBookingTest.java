package PojoClassesSerialization.CreateBookings;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateBookingTest {
	
	@Test
	public void CreateBookings() {
		
		/*
		 * Creating the Object of the POJO Class CreateBooking to Add the Data
		 */
		CreateBookingPojo createBooking = new CreateBookingPojo();
		
		/*
		 * Adding the First Name, Last Name, Price, Deposit Paid Status
		 * 
		 */
		createBooking.setFirstname("Krishna");
		createBooking.setLastname("Deeduvanu");
		createBooking.setTotalprice(400);
		createBooking.setDepositpaid(false);
		createBooking.setAdditionalneeds("No");
		
		/*
		 * Now to add the Details to Booking Dates
		 * First Create  Array List to Add the Data
		 */
//		ArrayList<String> DateList = new ArrayList<String>();
//		DateList.add("2024-1-21");
//		DateList.add("2024-1-22");
//		
		BookingDatesPojo datesPojo = new BookingDatesPojo();
		datesPojo.setCheckin("2024-1-21");
		datesPojo.setCheckout("2024-1-22");
		
		createBooking.setBookingdates(datesPojo);
		
		 String respone = RestAssured.baseURI="https://restful-booker.herokuapp.com";
		   given().log().all().body(createBooking).log().all().
		   when().post("/booking").
		   then().log().all().extract().response().prettyPrint();
		
		   System.out.println(respone);
		
		
		
	}

}

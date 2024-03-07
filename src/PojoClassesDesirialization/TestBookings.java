package PojoClassesDesirialization;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class TestBookings {
	
	@Test
	public void getUsers()
	{
		/* POJO CLASES WORKS ON 2 PRICIPLES
		 * 
		 * SERIALIZATION
		 * 
		 * DE-SERIALIZATION
		 * 
		 * This Test Class is for De serialization
		 * 
		 */
		
		/* While Construction Pojo Clases Please Consier the JSON as below
		 * 
		 * [ ]--->Indicates Array
		 * 
		 * { }--->Indicates List
		 * 
		 * 
		 * For this Test Class Related Pojo Classes are
		 * 
		 * 1.Users.Json
		 * 
		 * Sample JSON  File Path: UtilityFiles-->Bookings.json
		 */
	

		
	   BookingPojo[] bookingRespobe=  given().log().all().
	   when().get("https://restful-booker.herokuapp.com/booking").
	   then().log().all().assertThat().statusCode(200).extract().as(BookingPojo[].class);
	  
	  
	
	
	}
	
	
}

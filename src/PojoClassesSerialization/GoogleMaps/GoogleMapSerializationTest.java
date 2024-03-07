package PojoClassesSerialization.GoogleMaps;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class GoogleMapSerializationTest {
	
   @Test
   public void serialization1()
  
   {
	  /*Create Object for First Pojo Class i.e GoogleMapPojo as this will be the First Pojo Class
	   * 
	   * Add the Data Required Using set Methods
	   *    
	   *  Except Location Types and Location remaining attributes Can be add Directly because
	   *  
	   *    Location contains { indicates List of Strings
	   *    
	   *    Types Contains [ means it is an Array
	   */
	   
	   
	   GoogleMapPojo gmapPojo = new GoogleMapPojo();
	
	   gmapPojo.setAccuracy(50);
	   gmapPojo.setAddress("28, side layout, cohen 09");
	   gmapPojo.setLanguage("ENGLISH");
	   gmapPojo.setPhone_number("8522008752");
	   gmapPojo.setWebsite("Outlook.com");
	   gmapPojo.setName("avi");
	   
	   List<String> typesList = new ArrayList<String>();
	   typesList.add("AVI");
	   typesList.add("RAVI");
	  
	   gmapPojo.setTypes(typesList);
	   
	   LocationPojo locObj = new LocationPojo();
	   locObj.setLat(10);
	   locObj.setLon(20);
	   
	    gmapPojo.setLocation(locObj);;
	   
	   
	   
	   String respone = RestAssured.baseURI="https://rahulshettyacademy.com";
	   given().log().all().queryParam("key", "=qaclick123").body(gmapPojo).log().all().
	   when().post("/maps/api/place/add/json").
	   then().log().all().assertThat().statusCode(200).extract().response();
	   
	
	   
	 
	   
	   
   }

}

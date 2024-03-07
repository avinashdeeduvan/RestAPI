package Rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetJsonFileAsPayLoad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Validate ADD API
				
		 //Add Place--API
	     //Update Place with new Address-PUT API
	     //Get Place to Validate if the New Address is Present in repsone--GET api
		
		/* Steps to get Json File as Payload
		 * Cotent of File to String--> 
		 * Content of File to Byte---> Files.readAll()
		 * Content of Byte to String-->new String(Files.readAll())
		 */
						
	 
				
				RestAssured.baseURI="https://rahulshettyacademy.com";
			
				String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body(new String(Files.readAllBytes(Paths.get("E:\\RestAssured\\JsonFiles\\AddMap.json"))))
				.when().post("/maps/api/place/add/json")
				.then().assertThat().statusCode(200)
				.body("scope", equalTo("APP"))
				.header("Server","Apache/2.4.52 (Ubuntu)")
				.extract().response().asString();
				
				/*System.out.println(response);
				
				JsonPath jsonPath = new JsonPath(response);
				String placeId = jsonPath.getString("place_id");
				
				System.out.println("Displayed Place Id="+placeId);
				
				String newAddress = "70 winter walk, USA";
				
				given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body("{\r\n"
						+ "\"place_id\":\""+placeId+"\",\r\n"
						+ "\"address\":\""+newAddress+"\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n"
						+ "}\r\n"
						+ "").
				when().put("/maps/api/place/update/json")
				.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
				
				String getLocation =given().log().all()
						           .queryParam("key", "qaclick123") 
						           .queryParam("place_id", placeId)
				                   .when().get("/maps/api/place/get/json")
				                   .then().assertThat().statusCode(200).extract().body().asString();
				
				System.out.println("get Location="+getLocation);
				
				JsonPath jsPath = new JsonPath(getLocation);
				String extractedAddress = jsPath.getString("address");
				
				System.out.println("extractedAddress="+extractedAddress);
				Assert.assertEquals(newAddress, extractedAddress);*/

	}

}

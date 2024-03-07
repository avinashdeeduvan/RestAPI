package SpecBuilders;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecTes1 {
	
	@Test
	public void test1() {
		
		//Creating the Object for Request SpecBuilder
		//New commit mow
		RequestSpecification reqSpec= new RequestSpecBuilder()
				                      .setBaseUri("https://rahulshettyacademy.com")
				                      .addQueryParam("key", "qaclick123")
		                              .setContentType(ContentType.JSON).build();
		
		ResponseSpecification respSpec = new ResponseSpecBuilder()
				                       .expectStatusCode(200)
				                       .expectContentType(ContentType.JSON).build();
		
		RequestSpecification request = given().spec(reqSpec).body(ReuseFiles.PayLoad.AddApi());
		
		Response response = request.when().post("/maps/api/place/add/json").then().spec(respSpec).extract().response();
		
		
		String responseString=response.asString();
		System.out.println(responseString);
		System.out.println("Newly Updated Code for Commit");
		
		
	}

}

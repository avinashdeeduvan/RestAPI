

package PojoClassesDesirialization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class TestUsers {
	
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
		 * Sample JSON  File Path: UtilityFiles-->Users
		 * .json
		 */
		
		UsersPojo[] CartRespone=given().relaxedHTTPSValidation().log().all()
				  .when().log().all().get("https://gorest.co.in./public/v2/users")
				  .then().log().all().statusCode(200).extract().body().as(UsersPojo[].class);
		
		System.out.println(CartRespone.length);
		
		for(int i=0; i<2;i++)
		{
			System.out.println("All Generated ID"+CartRespone[i].getId());
		}
	}

}

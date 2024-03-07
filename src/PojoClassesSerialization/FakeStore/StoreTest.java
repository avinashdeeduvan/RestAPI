package PojoClassesSerialization.FakeStore;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class StoreTest {
	
	@Test
	public void AddStoreDetails() {
		
		AddProducts addProducts = new AddProducts();
		
		addProducts.setId(91220);
		addProducts.setTitle("FAKE STORE REST ASSURED");
		addProducts.setPrice(825);
		addProducts.setDescription("PRATICE REST ASSURED VIA FAKE STORE API");
		addProducts.setCategory("KIDS POJO");
		addProducts.setImage("https://fakestoreapi.com/img/71YAIFU48IL._AC_UL640_QL65_ML3_.jpg");
		
		AddRatings addRatings = new AddRatings();
		addRatings.setRate(29);
		addRatings.setCount(10);
		
		addProducts.setRating(addRatings);
		

		 String respone = RestAssured.baseURI="https://fakestoreapi.com";
		   given().log().all().body(addProducts).log().all().
		   when().post("/products").
		   then().log().all().extract().response().prettyPrint();
		   
		   
		   //De Serialization
		   
		   AddProducts[] respone2 = given().log().all().
		   when().get("https://fakestoreapi.com/products").
		   then().assertThat().statusCode(200).log().all().extract().body().as(AddProducts[].class);
		   
		   System.out.println(respone2.length);
		   
		//   respone2[0].
		   
		   
		   
		   
		  
		   
		   
		
		
		
		
		
		
		
	}

}

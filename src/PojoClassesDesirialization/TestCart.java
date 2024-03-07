package PojoClassesDesirialization;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import Rest.GetCoursePOJO;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class TestCart {
	
	@Test
	public void TestCart()
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
		 * 1.CartPojo
		 * 2.CartsPojo
		 * 3.ProductsPojo
		 * 
		 * Sample JSON  File Path: UtilityFiles-->Cart.json
		 */
	
		
	 CartPojo CartRespone=given().log().all()
			  .when().log().all().get("https://dummyjson.com/carts/user/5")
			  .then().log().all().statusCode(200).extract().body().as(CartPojo.class);
	 
	 System.out.println("CartsTotal"+CartRespone.getTotal());
	 System.out.println("Cartsskip"+CartRespone.getSkip());
	 System.out.println("******************************************");
	 //Print the Id Value//
	 System.out.println("Cart Id Value"+CartRespone.getCarts().get(0).getId());
	 System.out.println("******************************************");
	 //Print Total , discountedTotal, userId,totalProducts,toal Quantity
	 System.out.println("Print Total"+CartRespone.getCarts().get(0).getTotal());
	 int DiscountedPrice = CartRespone.getCarts().get(0).getDiscountedTotal();
	 System.out.println("discountedTotal "+DiscountedPrice);
	 System.out.println("userId "+CartRespone.getCarts().get(0).getUserId());
	 System.out.println("totalProducts "+CartRespone.getCarts().get(0).getTotalProducts());
	 System.out.println("totalProducts "+CartRespone.getCarts().get(0).getTotalProducts());
	 System.out.println("Quantity "+CartRespone.getCarts().get(0).getTotalQuantity());
	 System.out.println("******************************************");
	 
	//Print the Product SIZE
	 int productsSize = CartRespone.getCarts().get(0).getProducts().size();
	 	 System.out.println("Products Size="+productsSize);
	 
	 //Get the Discounted Price of all Products is Matced with TotalDiscounted Price
	
	 int ProductsDiscountedPrice = 0;
	 
	 for(int i=0; i<productsSize;i++)
	 {
		 int sum=0;
		 int IndividualPrice= CartRespone.getCarts().get(0).getProducts().get(i).getDiscountedPrice();
		 ProductsDiscountedPrice = ProductsDiscountedPrice+IndividualPrice;
		 System.out.println("ProductsDiscountedPricee of "+i+" ="+ProductsDiscountedPrice);
			
	 }
	 System.out.println("ProductsDiscountedPricee-->"+ProductsDiscountedPrice);
	 
	assertEquals(ProductsDiscountedPrice, DiscountedPrice, "ASSERTM PASSES");
	 if(ProductsDiscountedPrice==DiscountedPrice)
	 {
		 System.out.println("MATECHED");
	 }
	 else
	 {
		 System.out.println("Not MATECHED");
	 }
	}
}

	
	
	

	


